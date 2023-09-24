package org.example.Generics;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class FindMax {
    public static <T extends Comparable<T>> T findMaximum(List<T> values){
        if(values==null || values.isEmpty()){
            throw new IllegalArgumentException("list is empty");
        }
        T max = values.get(0);
        for (T value : values) {
            if(value.compareTo(max)>0){
                max = value;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(12);
        ints.add(24);
        ints.add(56);
        Integer maxInt = findMaximum(ints);
        System.out.println(maxInt);

        List<Double> doubles = new ArrayList<>();
        doubles.add(34.45);
        doubles.add(5.43);
        doubles.add(63.57);

        Double maxDouble = findMaximum(doubles);
        System.out.println(maxDouble);

        List<BigDecimal> bigDecimals = new ArrayList<>();
        bigDecimals.add(new BigDecimal("343.445"));
        bigDecimals.add(new BigDecimal("36.563"));
        bigDecimals.add(new BigDecimal("631.57"));

        BigDecimal maxBigDecimal = findMaximum(bigDecimals);
        System.out.println(maxBigDecimal);
    }
}

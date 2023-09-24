package org.example.Generics;

public class BoxExample {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.setItem(5);
        int num = integerBox.getItem();
        System.out.println(num);

        Box<String> stringBox = new Box<>();
        stringBox.setItem("represents a string of generic class box");
        String str = stringBox.getItem();
        System.out.println(str);
    }
}

class Box<T>{
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}

package org.example.Enum;

public class EnumExample {
    public static void main(String[] args) {
        DayOfWeek day = DayOfWeek.MONDAY;
        if(day == DayOfWeek.MONDAY){
            System.out.println("its monday");
        }else{
            System.out.println("its not monday");
        }
        for(DayOfWeek days:DayOfWeek.values()){
            System.out.println(days);
        }
    }
}

package org.example.Builder;

public class Main {
    public static void main(String[] args) {
        Computer computer = new ComputerBuilder()
                .setOs("macOS")
                .setRam(8)
                .setStorage(256).build();
        System.out.println("The Operating sys is "+computer.getOperatingSystem());
        System.out.println("The Ram of sys is "+computer.getRam());
        System.out.println("The Storage of sys is "+computer.getStorage());
    }


}

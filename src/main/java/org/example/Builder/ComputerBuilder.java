package org.example.Builder;

public class ComputerBuilder {
    private String operatingSystem;
    private String motherBoard;
    private int ram;
    private String cpu;
    private int storage;
    public ComputerBuilder(){

    }
    public ComputerBuilder setOs(String operatingSystem){
        this.operatingSystem = operatingSystem;
        return this;
    }
    public ComputerBuilder setMotherBoard(String motherBoard){
        this.motherBoard = motherBoard;
        return this;
    }
    public ComputerBuilder setRam(int ram){
        this.ram = ram;
        return this;
    }
    public ComputerBuilder setCpu(String cpu){
        this.cpu = cpu;
        return this;
    }
    public ComputerBuilder setStorage(int storage){
        this.storage = storage;
        return this;
    }
    public Computer build(){
        return new Computer(operatingSystem,motherBoard,ram,cpu,storage);
    }
}

package com.teachmeskills.lesson_5.task_1;

public class Computer {
    int costOfComputer;
    String modelOfComputer;
    RAM fastMemory = new RAM();
    HDD slowMemory = new HDD();

    public Computer(int cost, String model) {
        this.costOfComputer = cost;
        this.modelOfComputer = model;
    }

    public Computer(int cost, String model, RAM ram, HDD hdd) {
        this.costOfComputer = cost;
        this.modelOfComputer = model;
        this.fastMemory = ram;
        this.slowMemory = hdd;
    }

    public void computerReview() {
        System.out.println("Model of the computer: " + modelOfComputer);
        System.out.println("Price of the computer: " + costOfComputer);
        System.out.println("RAM model: " + fastMemory.getModelOfRAM() + "\n" + "RAM memory: " + fastMemory.getMemoryOfRAM());
        System.out.println("HDD model: " + slowMemory.getModelOfHDD() + "\n" + "HDD memory: " + slowMemory.getMemoryOfHDD() + "\n" + "HDD type: " + slowMemory.getTypeOfHDD());
    }
}

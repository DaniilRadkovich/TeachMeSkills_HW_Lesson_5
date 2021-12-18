package com.teachmeskills.lesson_5.task_1;

public class RAM {
    String modelOfRAM;
    int memoryOfRAM;

    public RAM() {
    }

    public RAM(String model, int memory) {
        this.modelOfRAM = model;
        this.memoryOfRAM = memory;
    }

    public String getModelOfRAM() {
        return modelOfRAM;
    }

    public int getMemoryOfRAM() {
        return memoryOfRAM;
    }
}

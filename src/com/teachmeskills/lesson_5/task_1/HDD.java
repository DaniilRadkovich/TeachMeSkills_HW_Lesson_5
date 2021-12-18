package com.teachmeskills.lesson_5.task_1;

public class HDD {
    String modelOfHDD;
    int memoryOfHDD;
    String typeOfHDD;

    public HDD() {

    }

    public HDD(String model, int memory, String type) {
        this.modelOfHDD = model;
        this.memoryOfHDD = memory;
        this.typeOfHDD = type;
    }

    public String getModelOfHDD() {
        return modelOfHDD;
    }

    public void setModelOfHDD(String modelOfHDD) {
        this.modelOfHDD = modelOfHDD;
    }

    public int getMemoryOfHDD() {
        return memoryOfHDD;
    }

    public void setMemoryOfHDD(int memoryOfHDD) {
        this.memoryOfHDD = memoryOfHDD;
    }

    public String getTypeOfHDD() {
        return typeOfHDD;
    }

    public void setTypeOfHDD(String typeOfHDD) {
        this.typeOfHDD = typeOfHDD;
    }
}

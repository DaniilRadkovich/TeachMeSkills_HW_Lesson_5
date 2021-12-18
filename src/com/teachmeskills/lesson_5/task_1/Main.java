package com.teachmeskills.lesson_5.task_1;

public class Main {
    public static void main(String[] args) {
        Computer comp1 = new Computer(1000, "HP");
        System.out.println("Computer 1 info: ");
        comp1.computerReview();
        Computer comp2 = new Computer(2500, "ASUS", new RAM("HyperPC", 32), new HDD("WD", 1024, "Internal"));
        System.out.println("Computer 2 info: ");
        comp2.computerReview();
    }
}

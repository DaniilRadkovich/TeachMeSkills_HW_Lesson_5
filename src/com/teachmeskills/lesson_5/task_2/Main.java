package com.teachmeskills.lesson_5.task_2;

public class Main {
    public static void main(String[] args) {

        ATM atm = new ATM(5, 7, 8);
        System.out.println("--------------");
        atm.getATMInfo();

        System.out.println("--------------");
        atm.withdrawCash(123);

        System.out.println("--------------");
        atm.getATMInfo();

        System.out.println("--------------");
        atm.withdrawCash(970);

        System.out.println("--------------");
        atm.getATMInfo();

        System.out.println("_______________");
        atm.withdrawCash(120);

        System.out.println("_______________");
        atm.getATMInfo();

        System.out.println("_______________");
        atm.withdrawCash(15);

    }
}

package com.teachmeskills.lesson_5.task_0;

import java.util.Scanner;

public class CreditCard {
    int accountNumber;
    double currentMoney;

    void moneyDeposit(double sum) {
        currentMoney += sum;
    }

    void moneyWithdraw(double sum) {
        currentMoney -= sum;
    }

    void cardInformation() {
        System.out.println("Card number: " + accountNumber);
        System.out.println("Current amount of money: " + currentMoney);
    }
}

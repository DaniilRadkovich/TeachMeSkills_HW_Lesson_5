package com.teachmeskills.lesson_5.task_0;

import java.util.Scanner;

public class Main0 {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard();
        CreditCard card2 = new CreditCard();
        CreditCard card3 = new CreditCard();

        card1.currentMoney = 1000;
        card2.currentMoney = 2000;
        card3.currentMoney = 3000;

        card1.accountNumber = 1111;
        card2.accountNumber = 2222;
        card3.accountNumber = 3333;

        card1.moneyDeposit(500);
        card2.moneyDeposit(500);
        card3.moneyWithdraw(222);

        card1.cardInformation();
        card2.cardInformation();
        card3.cardInformation();
    }
}

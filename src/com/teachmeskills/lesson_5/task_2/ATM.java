package com.teachmeskills.lesson_5.task_2;

public class ATM {

    int[] banknote20;
    int[] banknote50;
    int[] banknote100;

    public ATM() {
    }

    public ATM(int banknote20, int banknote50, int banknote100) {
        this.banknote20 = new int[banknote20];
        this.banknote50 = new int[banknote50];
        this.banknote100 = new int[banknote100];
    }

    public boolean withdrawCash(int amountToWithdraw) {
        int allMoneyInATM = 20 * banknote20.length + 50 * banknote50.length + 100 * banknote100.length;

        if (allMoneyInATM < amountToWithdraw) {
            System.out.println("Not enough money in the ATM!");
            return false;
        }

        int balance = 0;

        if (amountToWithdraw < 20) {
            System.out.println("Only 20, 50, 100 banknotes in the ATM!");
            return false;
        }

        if (amountToWithdraw % 10 != 0) {
            balance = amountToWithdraw % 10;
        }

        int count20ToWithdraw = 0;
        int count50ToWithdraw = 0;
        int count100ToWithdraw = 0;
        int money = 0;
        money = amountToWithdraw - balance;

        while (money != 0) {

            if ((money >= 100) && ((money - 100) % 20 == 0) && (banknote100.length > 0)) {
                money -= 100;
                banknote100 = new int[banknote100.length - 1];
                count100ToWithdraw += 1;
            } else if ((money >= 50) && (money % 50 == 0) && (banknote50.length > 0)) {
                money -= 50;
                banknote50 = new int[banknote50.length - 1];
                count50ToWithdraw += 1;
            } else if ((money >= 20) && (banknote20.length > 0)) {
                money -= 20;
                banknote20 = new int[banknote20.length - 1];
                count20ToWithdraw += 1;
            } else if (money == 10) {
                System.out.println("Only 20, 50, 100 banknotes in the ATM!");
            }

        }
        System.out.println("Sum to withdraw: " + amountToWithdraw);
        System.out.println("Banknotes 20: " + count20ToWithdraw + " Banknotes 50: " + count50ToWithdraw + " Banknotes 100: " + count100ToWithdraw);
        System.out.println("Balance: " + balance);
        return true;
    }

    public void getATMInfo() {
        int currentBalance = 20 * banknote20.length + 50 * banknote50.length + 100 * banknote100.length;
        System.out.println("Current ATM balance: " + currentBalance);
        System.out.println("Banknote 100: " + banknote100.length);
        System.out.println("Banknote 50: " + banknote50.length);
        System.out.println("Banknote 20: " + banknote20.length);
    }
}

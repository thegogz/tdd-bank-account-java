package org.xpdojo.bank;

public class Account {

    private int balance = 0;

    public Account(int startingBalance) {
        balance = startingBalance;
    }

    public int balance() {
        return balance;
    }

    public int deposit(int amount) {
        balance += amount;
        return balance;
    }

    public int withdraw(int amount) {
        balance -= amount;
        return balance;
    }
}

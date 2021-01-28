package org.xpdojo.bank;

public class Account {

    private int balance;

    public Account(int starting_balance) {
        balance = starting_balance;
    }

    public Account() {
        this(0);
    }

    public int balance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }
}

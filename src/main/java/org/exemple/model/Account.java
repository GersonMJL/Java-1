package org.exemple;

import org.exemple.model.Client;

public abstract class Account {
    private double balance;
    private int agency;
    private int number;
    private Client owner;
    private static int total = 0;

    public Account(int agency, int number) {
        total++;
        this.agency = agency;
        this.number = number;
    }

    public static int getTotal() {
        return total;
    }

    public double getBalance() {
        return balance;
    }

    public int getNumber() {
        return number;
    }

    public int getAgency() {
        return agency;
    }

    public Client getOwner() {
        return owner;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void deposit(double value) {
        this.balance += value;
    };

    public void withdraw(double value) throws InsufficientBalanceException {
        if (this.balance < value) {
            throw new InsufficientBalanceException("Current balance is: " + this.balance);
        }
        this.balance -= value;
    }

    public void transfer(double value, Account targetAccount) throws InsufficientBalanceException {
        this.withdraw(value);
        targetAccount.balance += value;
    }
}

package org.exemple;

public class Account {
    private double balance;
    private int agency;
    private int number;
    private Client owner;
    private static int total = 0;

    public Account(int agency, int number) {
        total++;
        System.out.println("Total of accounts are: " + total);
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
    }

    public boolean withdraw(double value) {
        if (this.balance >= value) {
            this.balance -= value;
            return true;
        }
        return false;
    }

    public boolean transfer(double value, Account targetAccount) {
        if (this.withdraw(value)) {
            targetAccount.balance += value;
            return true;
        }
        return false;
    }
}

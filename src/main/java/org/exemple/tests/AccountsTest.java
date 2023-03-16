package org.exemple.Tests;

import org.exemple.CheckingAccount;
import org.exemple.InsufficientBalanceException;
import org.exemple.SavingsAccount;

public class AccountsTest {
    public static void main(String[] args) throws InsufficientBalanceException {
        CheckingAccount ca = new CheckingAccount(111, 111);
        ca.deposit(100);

        SavingsAccount sa = new SavingsAccount(222, 222);
        sa.deposit(200);

        ca.transfer(10, sa);

        System.out.println("CA " + ca.getBalance());
        System.out.println("SA " + sa.getBalance());
    }
}

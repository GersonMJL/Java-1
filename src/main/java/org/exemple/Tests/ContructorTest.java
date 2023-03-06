package org.exemple.Tests;

import org.exemple.Account;
import org.exemple.SavingsAccount;

public class ContructorTest {
    public static void main(String[] args) {
        Account account = new SavingsAccount(1337, 24226);
        System.out.println(account.getAgency());
        System.out.println(account.getNumber());

        new SavingsAccount(4523, 545455);

        System.out.println(Account.getTotal());
    }
}

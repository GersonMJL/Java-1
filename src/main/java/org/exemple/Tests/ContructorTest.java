package org.exemple.Tests;

import org.exemple.Account;

public class ContructorTest {
    public static void main(String[] args) {
        Account account = new Account(1337, 24226);
        System.out.println(account.getAgency());
        System.out.println(account.getNumber());

        new Account(4523, 545455);

        System.out.println(Account.getTotal());
    }
}

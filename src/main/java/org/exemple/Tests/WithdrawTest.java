package org.exemple.Tests;

import org.exemple.Account;
import org.exemple.CheckingAccount;

public class WithdrawTest {
    public static void main(String[] args) {
        Account account = new CheckingAccount(123, 123);

        account.deposit(200);
        account.withdraw(210);
        System.out.println(account.getBalance());
    }
}

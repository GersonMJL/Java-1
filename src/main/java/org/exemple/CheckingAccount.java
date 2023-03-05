package org.exemple;

public class CheckingAccount extends Account{

    public CheckingAccount(int agency, int number) {
        super(agency, number);
    }

    @Override
    public boolean withdraw(double value) {
        return super.withdraw(value + 0.2);
    }
}

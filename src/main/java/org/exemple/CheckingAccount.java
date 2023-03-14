package org.exemple;

public class CheckingAccount extends Account implements Taxable{

    public CheckingAccount(int agency, int number) {
        super(agency, number);
    }

    @Override
    public void deposit(double value) {
        super.deposit(value);
    }

    @Override
    public void withdraw(double value) {
        super.withdraw(value + 0.2);
    }

    @Override
    public double getTaxValue() {
        double tax = super.getBalance() * 0.1;
        this.withdraw(tax);
        return tax;
    }
}

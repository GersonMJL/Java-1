package org.exemple.Tests;

import org.exemple.CheckingAccount;
import org.exemple.LifeInsurance;
import org.exemple.TaxesCalculator;

public class TaxesTest {

    public static void main(String[] args) {
        LifeInsurance lifeInsurance = new LifeInsurance();
        CheckingAccount cc = new CheckingAccount(222, 2222);

        cc.deposit(200);

        TaxesCalculator calculator = new TaxesCalculator();
        calculator.addTax(lifeInsurance);
        calculator.addTax(cc);

        System.out.println(calculator.getTotalTaxes());
    }
}

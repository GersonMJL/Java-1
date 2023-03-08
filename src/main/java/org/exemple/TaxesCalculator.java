package org.exemple;

public class TaxesCalculator {

    private int totalTaxes = 0;

    public void addTax(Taxable taxable) {
        this.totalTaxes += taxable.getTaxValue();
    }

    public int getTotalTaxes() {
        return totalTaxes;
    }
}

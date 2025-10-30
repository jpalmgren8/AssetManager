package com.pluralsight;

public class Cash extends Asset {

    protected int cashAmount;

    public Cash(String description, String dateAcquired, double originalCost, int cashAmount) {
        super(description, dateAcquired, originalCost);
        this.cashAmount = cashAmount;
    }

    public int getCashAmount() {
        return cashAmount;
    }

    public void setCashAmount(int cashAmount) {
        this.cashAmount = cashAmount;
    }

    @Override
    public double getValue() {
        return 0;
    }
}

package com.company;

public class BankTransfer {
    private double value;
    private String via;
    private TargetAccount target;

    public BankTransfer(double value, String via, TargetAccount target) {
        this.value = value;
        this.via = via;
        this.target = target;
    }

    public double getValue() {
        return value;
    }

    public String getVia() {
        return via;
    }

    public TargetAccount getTarget() {
        return target;
    }
}

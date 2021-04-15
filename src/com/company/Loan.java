package com.company;

public class Loan {
    private double worth;
    private int payday;
    private int installments;
    private double fees = 0.01;
    private double payable;

    public Loan(double worth, int payday, int installments) {
        this.worth = worth;
        this.payday = payday;
        this.installments = installments;
        this.payable = worth * installments * fees;
    }

    public double getWorth() {
        return worth;
    }

    public int getPayday() {
        return payday;
    }

    public void setPayday(int payday) {
        this.payday = payday;
    }

    public int getInstallments() {
        return installments;
    }

    public double getFees() {
        return fees;
    }

    public double getPayable() {
        return payable;
    }

    public void setFees(double fees) {
        this.fees = fees;
        this.payable = this.worth * this.installments * fees;
    }

    public void setInstallments(int installments) {
        this.installments = installments;
        this.payable = this.worth * installments * this.fees;
    }
}

package com.company;

public class BankSlip extends PayMethod{
    private double fee = 0;
    private String barcode;

    public BankSlip(String barcode, double fee) {
        this.barcode = barcode;
        this.fee = fee;
    }

    public String getBarcode() {
        return barcode;
    }

    public double getFee() {
        return fee;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public void transferMoney(double value){

    }
}

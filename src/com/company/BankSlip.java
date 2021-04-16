package com.company;

public class BankSlip extends Transaction{
    private String barcode;

    public BankSlip(double value, String description, String date, String barcode) {
        super(value, description, date);
        this.barcode = barcode;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }
}

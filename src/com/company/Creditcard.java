package com.company;

import java.util.ArrayList;
import java.util.List;

public class Creditcard {
    private String number;
    private String cvv;
    private String expiration;
    private String brand;
    private int limit;
    private double fees = 0.259;
    private List<Purchase> purchases;
    private double currentBillAmount;
    private List<Bill> bills;

    public Creditcard(String number, String cvv, String expiration, String brand, int limit) {
        this.number = number;
        this.cvv = cvv;
        this.expiration = expiration;
        this.brand = brand;
        if (limit > 0){
            this.limit = limit;
        }
        this.purchases = new ArrayList<Purchase>();
        this.bills = new ArrayList<Bill>();
    }

    public String getNumber() {
        return number;
    }

    public String getCvv() {
        return cvv;
    }

    public String getExpiration() {
        return expiration;
    }

    public String getBrand() {
        return brand;
    }

    public int getLimit() {
        return limit;
    }

    public double getFees() {
        return fees;
    }

    public List<Purchase> getPurchases() {
        return purchases;
    }

    public List<Bill> getBills() {
        return bills;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    public void setLimit(int limit) {
        if(limit > 0) {
            this.limit = limit;
        }
    }

    public void addPurchase(Purchase purchase) {
        double newAmount = this.currentBillAmount + purchase.getPrice();
        if(newAmount < this.limit) {
            this.purchases.add(purchase);
            this.currentBillAmount = newAmount;
        }
    }

    public void generateBill(String date) {
        Bill newBill = new Bill(this.currentBillAmount, date);
        this.bills.add(newBill);
        System.out.printf("Bill amount: %2f", this.currentBillAmount);
    }

    public void payBill(double value) {
        if (value <= this.currentBillAmount && value >= 0) {
            this.currentBillAmount -= value;
            this.currentBillAmount *= this.fees;
            // As we're not manipulating dates, the fees are only added when the bill is paid.
            // The system, therefore, should call the payBill() method every month with a paid value.
            // If the bill was not paid, the method is called with value 0.
        }
    }
}

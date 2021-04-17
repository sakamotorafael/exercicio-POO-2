package com.company;

import payment.PayMethod;
import payment.PaymentDestination;

public class Transaction {
    private double value;
    private String description;
    private String date;
    private PayMethod method;
    private PaymentDestination destination;

    public Transaction(double value, String description, String date, PayMethod method, PaymentDestination destination) {
        this.value = value;
        this.description = description;
        this.date = date;
        this.method = method;
        this.destination = destination;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

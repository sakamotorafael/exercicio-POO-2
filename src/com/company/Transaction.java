package com.company;

public class Transaction {
    private double value;
    private String description;
    private String date;

    public Transaction(double value, String description, String date) {
        this.value = value;
        this.description = description;
        this.date = date;
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
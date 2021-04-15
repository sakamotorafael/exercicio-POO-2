package com.company;

public class Payment {
    private double value;
    private String description;
    private String date;
    private PayMethod method;

    public Payment(double value, String description, String date, PayMethod method) {
        this.value = value + method.getFee();
        this.description = description;
        this.date = date;
        this.method = method;
    }

    public double getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    public PayMethod getMethod() {
        return method;
    }

    public String getDate() {
        return date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setMethod(PayMethod method) {
        this.method = method;
    }
}

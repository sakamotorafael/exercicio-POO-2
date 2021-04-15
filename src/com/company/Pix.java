package com.company;

public class Pix extends PayMethod {
    private String key;
    private double fee = 0;

    public Pix(String key) {
        this.key = key;
    }

    public double getFee() {
        return fee;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void transferMoney(double value){

    }
}

package com.company;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private static int lastId;
    private int id;
    private User user;
    private double balance;
    private String pix;
    private Creditcard creditcard;
    private Loan loan;
    private List<Transaction> transactions;

    public BankAccount(User user, double balance, String pix) {
        this.id = ++lastId;
        this.user = user;
        this.balance = balance;
        this.pix = pix;
        this.transactions = new ArrayList<Transaction>();
    }

    public int getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public double getBalance() {
        return balance;
    }

    public String getPix() {
        return pix;
    }

    public Creditcard getCreditcard() {
        return creditcard;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setPix(String pix) {
        this.pix = pix;
    }

    public void generateCreditcard(String number, String cvv, String expiration, String brand) {
        int limit = user.getScore() * 7;
        if(limit>100) {
            this.creditcard = new Creditcard(number, cvv, expiration, brand, limit);
        }
    }

    public void loan(double worth, int payday, int installments) {
        if(user.getScore() > 400 && worth < (user.getScore() * 30)) {
            this.loan = new Loan(worth, payday, installments);
        }
    }



    public void deposit(double value) {
        if(value > 0) {
            this.balance += value;
        }
    }

    public void pay(double value, String description, String date, String barcode) {
        if(value < this.balance){
            Transaction bankSlip = new BankSlip(value, description, date, barcode);
            transactions.add(bankSlip);
            this.balance -= value;
        }
    }

    public void transfer(double value, String description, String date, TransferDestination destination) {
        double fee = destination.getFee();
        value += fee;
        if(value < this.balance){
            Transaction transfer = new Transfer(value, description, date, destination);
            transactions.add(transfer);
            this.balance -= value;
        }
    }


}

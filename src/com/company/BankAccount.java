package com.company;

import creditcard.Creditcard;
import exceptions.InsufficientCreditException;
import exceptions.InsufficientFundsException;
import exceptions.UnrelatedPayMethodException;
import payment.PayMethod;
import payment.PaymentDestination;

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
        this.creditcard = new Creditcard("","","","",0);
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

    public void generateCreditcard(String number, String cvv, String expiration, String brand) throws Exception {
        int limit = this.user.getScore() * 7;
        if(limit<100) {
            throw new InsufficientCreditException();
        }
        if(this.creditcard.getCurrentBillAmount() > 0){
            throw new Exception("Denied operation: Current credit card's bill is pending.");
        }
        this.creditcard = new Creditcard(number, cvv, expiration, brand, limit);
    }

    public void loan(double worth, int payday, int installments) throws InsufficientCreditException {
        if(this.user.getScore() < 400 && worth > (this.user.getScore() * 30)) {
            throw new InsufficientCreditException();
        }
        this.loan = new Loan(worth, payday, installments);
    }

    public void deposit(double value) throws Exception {
        if(value < 0) {
            throw new Exception("Invalid deposit value.");
        }
        this.balance += value;
    }

    public void payCreditcardBill(double value, String date) throws Exception {
        if (value > this.creditcard.getCurrentBillAmount()){
            throw new Exception("The payment value exceeds the bill amount.");
        }
        if (value > this.balance){
            throw new InsufficientFundsException();
        }
        double currentAmount = this.creditcard.getCurrentBillAmount();
        double newAmount = (currentAmount-value)*this.creditcard.getFees();
        this.creditcard.setCurrentBillAmount(newAmount);
        this.balance -= value;
        System.out.printf("Value added to the next bill: %2f", newAmount);
    }

    public void pay(double value, String description, String date, PayMethod method, PaymentDestination destination) throws Exception {
        if(method.getRelatedData() != destination.getRelatedMethod()){
            throw new UnrelatedPayMethodException();
        }
        if(value > this.balance && value < (this.balance + this.creditcard.getLimit() - this.creditcard.getCurrentBillAmount())){
            throw new Exception("Insufficient funds. Do you wish to use your credit to make the transaction anyway?");
        }
        if(value > this.balance) {
            throw new InsufficientFundsException();
        }

        double methodFee = method.getFee();
        value += methodFee;

        transactions.add(new Transaction(value, description, date, method, destination));
        this.balance -= value;

        if(method.getRelatedData() == "tev"){
            destination.getBankAccount().deposit(value);
        }

    }


}

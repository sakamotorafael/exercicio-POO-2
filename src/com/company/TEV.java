package com.company;

public class TEV extends PayMethod {
    private BankAccount account;
    private double fee = 0;

    public TEV(BankAccount account) {
        this.account = account;
    }

    public BankAccount getAccount() {
        return account;
    }

    public double getFee() {
        return fee;
    }

    public void transferMoney(double value){
        double accountBallance = this.account.getBalance();
        this.account.setBalance(accountBallance + value);
    }

    public void setAccount(BankAccount account) {
        this.account = account;
    }
}

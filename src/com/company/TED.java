package com.company;

public class TED extends PayMethod{
    private String bank;
    private String name;
    private String ag;
    private String cc;
    private String cpf;
    private double fee = 10.9;

    public TED(String name, String bank, String ag, String cc, String cpf) {
        this.bank = bank;
        this.ag = ag;
        this.cc = cc;
        this.cpf = cpf;
        this.name = name;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public void setAg(String ag) {
        this.ag = ag;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public String getBank() {
        return bank;
    }

    public String getAg() {
        return ag;
    }

    public String getCc() {
        return cc;
    }

    public String getCpf() {
        return cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void transferMoney(double value){

    }
}

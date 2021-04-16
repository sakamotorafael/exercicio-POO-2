package com.company;

public class TedInformation extends TransferDestination {
    private String bank;
    private String ag;
    private String cc;
    private String cpf;
    private double fee = 10.9;

    public TedInformation(String name, String bank, String ag, String cc, String cpf) {
        super(name);
        this.bank = bank;
        this.ag = ag;
        this.cc = cc;
        this.cpf = cpf;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getAg() {
        return ag;
    }

    public void setAg(String ag) {
        this.ag = ag;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getCpf() {
        return cpf;
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
}

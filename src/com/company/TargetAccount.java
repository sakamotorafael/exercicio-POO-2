package com.company;

public class TargetAccount {
    private String name;
    private String bank;
    private String pix;
    private String ag;
    private String cc;
    private String cpf;

    public TargetAccount(String name, String bank, String pix, String ag, String cc, String cpf) {
        this.name = name;
        this.bank = bank;
        this.pix = pix;
        this.ag = ag;
        this.cc = cc;
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public String getBank() {
        return bank;
    }

    public String getPix() {
        return pix;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public void setPix(String pix) {
        this.pix = pix;
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
}

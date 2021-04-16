package com.company;

public class TevInformation extends TransferDestination {
    private BankAccount contaZe;
    private double fee = 0;

    public TevInformation(String name, BankAccount contaZe) {
        super(name);
        this.contaZe = contaZe;
    }

    public BankAccount getContaZe() {
        return contaZe;
    }

    public void setContaZe(BankAccount contaZe) {
        this.contaZe = contaZe;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
}

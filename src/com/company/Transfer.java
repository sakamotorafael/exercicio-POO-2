package com.company;

public class Transfer extends Transaction {
    private TransferDestination destination;

    public Transfer(double value, String description, String date, TransferDestination destination) {
        super(value, description, date);
        this.destination = destination;
    }

    public TransferDestination getDestination() {
        return destination;
    }

    public void setDestination(TransferDestination destination) {
        this.destination = destination;
    }
}

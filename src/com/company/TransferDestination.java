package com.company;

public abstract class TransferDestination {
    private String name;

    public TransferDestination(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double getFee();
}

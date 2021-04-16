package com.company;

public class PixInformation extends TransferDestination {
    private String pix;
    private double fee = 0;

    public PixInformation(String name, String pix) {
        super(name);

        this.pix = pix;
    }

    public String getPix() {
        return pix;
    }

    public void setPix(String pix) {
        this.pix = pix;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
}

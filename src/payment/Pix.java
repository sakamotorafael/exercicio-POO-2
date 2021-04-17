package payment;

public class Pix implements PayMethod {
    private double fee = 0;

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String getRelatedData() {
        return "pix";
    }
}

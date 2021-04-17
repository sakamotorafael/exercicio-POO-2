package payment;

public class Ted implements PayMethod {
    private double fee = 10.9;

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String getRelatedData() {
        return "TedDoc";
    }
}

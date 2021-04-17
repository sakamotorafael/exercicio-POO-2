package payment;

public class Doc implements PayMethod {
    private double fee = 9.9;

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

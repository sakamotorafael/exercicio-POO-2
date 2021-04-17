package payment;

public interface PayMethod {
    public abstract double getFee();
    public abstract void setFee(double fee);
    public abstract String getRelatedData();
}

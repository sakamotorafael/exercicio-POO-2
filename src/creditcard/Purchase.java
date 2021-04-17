package creditcard;

public class Purchase {
    private double price;
    private String date;

    public Purchase(double price, String date) {
        this.price = price;
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public String getDate() {
        return date;
    }
}

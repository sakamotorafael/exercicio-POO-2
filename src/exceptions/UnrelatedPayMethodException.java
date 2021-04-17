package exceptions;

public class UnrelatedPayMethodException extends Exception {
    public UnrelatedPayMethodException() {
        super("The pay method is unrelated to the payment destination data.");
    }
}

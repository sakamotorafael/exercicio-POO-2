package exceptions;

public class InsufficientCreditException extends Exception {
    public InsufficientCreditException() {
        super("Insufficient credit to make this operation.");
    }
}

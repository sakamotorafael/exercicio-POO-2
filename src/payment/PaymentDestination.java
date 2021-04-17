package payment;

import com.company.BankAccount;

public interface PaymentDestination {
    public abstract String getRelatedMethod();
    public abstract BankAccount getBankAccount();
}

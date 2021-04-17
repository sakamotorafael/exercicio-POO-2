package payment;

import com.company.BankAccount;

public class TevData implements PaymentDestination {
    private String name;
    private BankAccount bankAccount;

    public TevData(String name, BankAccount bankAccount) {
        this.name = name;
        this.bankAccount = bankAccount;
    }

    public String getRelatedMethod(){
        return "tev";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
}

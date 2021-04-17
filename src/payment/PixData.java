package payment;

import com.company.BankAccount;

public class PixData implements PaymentDestination {
    private String name;
    private String pixKey;

    public PixData(String name, String pixKey) {
        this.name = name;
        this.pixKey = pixKey;
    }

    public String getRelatedMethod(){
        return "pix";
    }

    @Override
    public BankAccount getBankAccount() {
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPixKey() {
        return pixKey;
    }

    public void setPixKey(String pixKey) {
        this.pixKey = pixKey;
    }
}

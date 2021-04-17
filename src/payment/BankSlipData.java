package payment;

import com.company.BankAccount;

public class BankSlipData implements PaymentDestination {
    String barcode;

    public BankSlipData(String barcode) {
        this.barcode = barcode;
    }

    public String getRelatedMethod(){
        return "slip";
    }

    @Override
    public BankAccount getBankAccount() {
        return null;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }
}

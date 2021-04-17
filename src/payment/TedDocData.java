package payment;

import com.company.BankAccount;

public class TedDocData implements PaymentDestination {
    private String name;
    private String cpf;
    private String bank;
    private String ag;
    private String cc;

    public TedDocData(String name, String cpf, String bank, String ag, String cc) {
        this.name = name;
        this.cpf = cpf;
        this.bank = bank;
        this.ag = ag;
        this.cc = cc;
    }

    public String getRelatedMethod(){
        return "TedDoc";
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getAg() {
        return ag;
    }

    public void setAg(String ag) {
        this.ag = ag;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }
}

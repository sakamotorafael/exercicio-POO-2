package com.company;

import java.lang.annotation.Target;

public class Main {

    public static void main(String[] args) {
        Address rafaAddress = new Address("Rua dos bobos", "0", "Centro", "city", "state", "01234-567");
        User rafa = new User("Rafael", "123.456.789-22", "(11)98765-4321", "rafa@gmail.com", 888, rafaAddress);
        BankAccount account1 = new BankAccount(rafa, 10000,"rafael@gmail.com");

        account1.generateCreditcard("1234.5678.9876.5432", "123", "09/2027", "Mastercard");
        account1.loan(2300, 12, 5);

        Purchase sanduiche = new Purchase(50, "1/4/2021");
        Purchase chiclete = new Purchase(2, "1/4/2021");
        Purchase cocacola = new Purchase(13, "1/4/2021");
        Purchase mensalidade4u2 = new Purchase(100, "1/4/2021");

        account1.getCreditcard().addPurchase(sanduiche);
        account1.getCreditcard().addPurchase(chiclete);
        account1.getCreditcard().addPurchase(cocacola);
        account1.getCreditcard().addPurchase(mensalidade4u2);

        account1.getCreditcard().generateBill("25/4/2021");
        account1.getCreditcard().payBill(100);

        TargetAccount agiotaMarcio = new TargetAccount("Marcio", "Bradesco", "marcinhoagiota@yahoo.com", "0329", "28823-4", "321.654.987-88");
        TargetAccount michele = new TargetAccount("Michele", "BB", "789.456.123-55", null, null, null);

        account1.pay(250, "TED", agiotaMarcio);
        account1.pay(89, "pix", michele);

        account1.deposit(2500);
    }
}

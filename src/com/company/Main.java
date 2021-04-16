package com.company;

import java.lang.annotation.Target;

public class Main {

    public static void main(String[] args) {
        Address rafaAddress = new Address("Rua dos bobos", "0", "Centro", "city", "state", "01234-567");
        User rafa = new User("Rafael", "123.456.789-22", "(11)98765-4321", "rafa@gmail.com", 888, rafaAddress);
        BankAccount account1 = new BankAccount(rafa, 10000,"rafael@gmail.com");

        Address zeAddress = new Address("Rua X", "54", "Centro", "city", "state", "01234-567");
        User ze = new User("José da Silva", "123.456.789-23", "(11)98765-4322", "ze@gmail.com", 500, zeAddress);
        BankAccount contaZe = new BankAccount(ze, 250,"ze@gmail.com");


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

        TransferDestination marcinho = new TedInformation("Marcinho Agiota", "BB", "0123", "12345-6", "111.222.333.444-55");
        TransferDestination michele = new PixInformation("Michele", "micheleb@gmail.com");
        TransferDestination zezinho = new TevInformation("José", contaZe);


        account1.deposit(2500);

        account1.transfer(250, "aquela divida", "11/02/2021", marcinho);
        account1.transfer(89, "aquele cheque", "1/4/2021", michele);
        account1.transfer(20, "lanche", "1/4/2021", zezinho);

        account1.pay(120, "conta de luz","1/4/2021", "123456.789456.123456.7897-88");

    }
}

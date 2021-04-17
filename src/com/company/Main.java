package com.company;

import creditcard.Purchase;
import payment.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Address rafaAddress = new Address("Rua dos bobos", "0", "Centro", "city", "state", "01234-567");
        User rafa = new User("Rafael", "123.456.789-22", "(11)98765-4321", "rafa@gmail.com", 888, rafaAddress);
        BankAccount account1 = new BankAccount(rafa, 10000,"rafael@gmail.com");

        Address zeAddress = new Address("Rua X", "54", "Centro", "city", "state", "01234-567");
        User ze = new User("José da Silva", "123.456.789-23", "(11)98765-4322", "ze@gmail.com", 500, zeAddress);
        BankAccount contaZe = new BankAccount(ze, 250,"ze@gmail.com");


        try {
            account1.generateCreditcard("1234.5678.9876.5432", "123", "09/2027", "Mastercard");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(account1.getCreditcard());
        System.out.println(account1.getCreditcard().getLimit());

        try {
            account1.loan(2300, 12, 5);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Purchase sanduiche = new Purchase(50, "1/4/2021");
        Purchase chiclete = new Purchase(2, "1/4/2021");
        Purchase cocacola = new Purchase(13, "1/4/2021");
        Purchase mensalidade4u2 = new Purchase(100, "1/4/2021");

        try {
            account1.getCreditcard().addPurchase(sanduiche);
            account1.getCreditcard().addPurchase(chiclete);
            account1.getCreditcard().addPurchase(cocacola);
            account1.getCreditcard().addPurchase(mensalidade4u2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        account1.getCreditcard().generateBill("25/4/2021");

        try {
            account1.payCreditcardBill(100, "1/4/2021");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            account1.deposit(2500);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //exception
        try {
            account1.generateCreditcard("123456", "222", "9/2030", "Cielo");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            account1.pay(200, "conta de luz", "1/4/2021", new BankSlip(), new BankSlipData("44444444"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            account1.pay(100, "conta de luz", "1/4/2021", new Ted(), new BankSlipData("44444444"));
            System.out.println("pagamento feito. conta de luz");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            account1.pay(89, "carro", "1/4/2021", new Pix(), new PixData("michele", "michele@gmail.com"));
            System.out.println("pagamento feito. michele 89");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            account1.pay(11009.69, "divida", "1/4/2021", new Tev(), new TevData("José", contaZe));
            System.out.println("pagamento feito.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            account1.pay(89000, "carro", "1/4/2021", new Pix(), new PixData("michele", "michele@gmail.com"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("conta zé:");
        System.out.println(contaZe.getBalance());
    }
}

package com.neoteric.javademojenkins.polymorphism;

public class InterfaceTest {

    public static void main(String[] args) {

        UPIPayment payments = new PhonePay();

        Payment pay = payments.transfer("9701061489", "7995179127", 3000.0);

        System.out.println(pay.getTransactionid() + "status" + pay.getStatus() + "uter" + pay.getUter() + "Date" + pay.getTransactiondate());
        System.out.println("Balance of from account" + PhonePay.accountBalanceMap.get("9701061489"));
        System.out.println("To account Balance" + PhonePay.accountBalanceMap.get("7995179127"));


    }
}

package com.neoteric.javademojenkins.polymorphism;

public class GPayTest {


    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        TranscationLimitService transactionLimitService = new TranscationLimitService();


        UPIPayment payments = new GPay(accountService, transactionLimitService);


        for (int i = 0; i <= 10; i++) {
            Payment payment = payments.transfer("9701061489", "7995179127", 1000.0);

            System.out.println("Transaction ID: " + payment.getTransactionid());
            System.out.println("Status: " + payment.getStatus());
            System.out.println("UTR: " + payment.getUter());
            System.out.println("Date: " + payment.getTransactiondate());
            System.out.println("From Account Balance: " + accountService.getBalance("9701061489"));
            System.out.println("To Account Balance: " + accountService.getBalance("7995179127"));
            System.out.println("-----------------------------");

            if ("FAILED".equals(payment.getStatus())) {
                System.out.println("Transaction stopped due to daily limit or insufficient balance.");
                break;
            }
        }
    }
}

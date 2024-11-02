package com.neoteric.javademojenkins.polymorphism;

import java.util.Date;
import java.util.UUID;

public class GPay implements UPIPayment{
    private AccountService accountService;
    private TranscationLimitService transactionLimitService;

    public GPay(AccountService accountService, TranscationLimitService transactionLimitService) {
        this.accountService = accountService;
        this.transactionLimitService = transactionLimitService;
    }

    @Override
    public Payment transfer(String fromMobileNumber, String toNumber, Double amount) {
        Payment payment = new Payment();


        if (transactionLimitService.isLimitReached()) {
            payment.setStatus(PaymentStatus.FAILED.getLabel() + ": Daily transaction limit reached");
            payment.setTransactionid(UUID.randomUUID().toString());
            payment.setTransactiondate(new Date());
            return payment;
        }


        if (accountService.hasSufficientBalance(fromMobileNumber, amount)) {
            accountService.updateBalances(fromMobileNumber, toNumber, amount);
            payment.setStatus(PaymentStatus.SUCCESS.getLabel());
            payment.setTransactionid(UUID.randomUUID().toString());
            payment.setTransactiondate(new Date());

            transactionLimitService.incrementTransactionCount();
        } else {
            payment.setStatus(PaymentStatus.FAILED.getLabel());
            payment.setTransactionid(UUID.randomUUID().toString());
            payment.setTransactiondate(new Date());
            payment.setUter(UUID.randomUUID().toString());
        }

        return payment;
    }
}

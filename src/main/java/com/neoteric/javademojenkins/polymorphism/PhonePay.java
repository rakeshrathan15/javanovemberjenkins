package com.neoteric.javademojenkins.polymorphism;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.function.BiPredicate;

public class PhonePay implements UPIPayment{

    static Map<String,Double> accountBalanceMap=new HashMap<>();
    static Map<String,Integer> transactionCountMap= new HashMap<>();


    static {

        accountBalanceMap.put("9701061489",10000.0);
        accountBalanceMap.put("7995179127",1000.0);
    }

    BiPredicate<String,Double> balanceCheck =(accountNumber ,amt) -> {
        Double accountBalance = accountBalanceMap.get(accountNumber);
        if (accountBalance > amt) {
            return true;
        }else {
            return false;
        }
    };

    private String getCurrentDate() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        return formatter.format(new Date());
    }

    @Override
    public Payment transfer(String fromMobileNumber, String toNumber , Double amount) {
        Payment p = new Payment();

        String currentDate = getCurrentDate();

        int currentDayCount = transactionCountMap.getOrDefault(currentDate, 0);


        if (currentDayCount >= 10) {
            p.setStatus(PaymentStatus.FAILED.getLabel() + ": Daily transaction limit reached");
            p.setTransactionid(UUID.randomUUID().toString());
            p.setTransactiondate((new Date()));
            return p;
        }
        if (balanceCheck.test(fromMobileNumber,amount)) {
            Double fromAccountBalance = accountBalanceMap.get(fromMobileNumber);
            Double toAccountBalance = accountBalanceMap.get(toNumber);
            Double FromTotalBalance = fromAccountBalance-amount;
            Double ToTotalBalance = toAccountBalance+amount;
            accountBalanceMap.put(fromMobileNumber,FromTotalBalance);
            accountBalanceMap.put(toNumber,ToTotalBalance);
            p.setStatus(PaymentStatus.SUCCESS.getLabel());
            p.setTransactionid(UUID.randomUUID().toString());
            p.setStatus(UUID.randomUUID().toString());
            p.setTransactiondate(new Date());
            p.setUter(UUID.randomUUID().toString());
        }else {

            p.setStatus(PaymentStatus.FAILED.getLabel());
            p.setTransactionid(UUID.randomUUID().toString());
            p.setTransactiondate(new Date());
            p.setUter(UUID.randomUUID().toString());

        }

        return p;

    }




}






package com.neoteric.javademojenkins.polymorphism;

import java.util.HashMap;
import java.util.Map;

public class AccountService {

    private Map<String, Double> accountBalanceMap = new HashMap<>();

    public AccountService() {
        accountBalanceMap.put("9701061489", 100000.0);
        accountBalanceMap.put("7995179127", 1000.0);
    }

    public boolean hasSufficientBalance(String accountNumber, Double amount) {
        Double accountBalance = accountBalanceMap.get(accountNumber);
        return accountBalance != null && accountBalance >= amount;
    }

    public void updateBalances(String fromAccount, String toAccount, Double amount) {
        Double fromBalance = accountBalanceMap.get(fromAccount) - amount;
        Double toBalance = accountBalanceMap.get(toAccount) + amount;
        accountBalanceMap.put(fromAccount, fromBalance);
        accountBalanceMap.put(toAccount, toBalance);
    }

    public Double getBalance(String accountNumber) {
        return accountBalanceMap.getOrDefault(accountNumber, 0.0);
    }
}

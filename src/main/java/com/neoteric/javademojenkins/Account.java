package com.neoteric.javademojenkins;

public class Account {

 private String holderName;

 private String accountNumber;

 private static String bankName;
 private  static String ifscCode;

 private String address;

 public  Account(){

 }

    public Account(String holderName, String accountNumber, String address) {
        this.holderName = holderName;
        this.accountNumber = accountNumber;
        this.address = address;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public static String getBankName() {
        return bankName;
    }

    public static void setBankName(String bankName) {
        Account.bankName = bankName;
    }

    public static String getIfscCode() {
        return ifscCode;
    }

    public static void setIfscCode(String ifscCode) {
        Account.ifscCode = ifscCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

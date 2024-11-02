package com.neoteric.javademojenkins.polymorphism;

public enum PaymentStatus {


    SUCCESS( "Transaction is successful"),
    FAILED ("Transaction is failed"),
    PENDING ("Transaction is pending");

    private String label;

    PaymentStatus(String label){
        this.label=label;

    }
    public String getLabel (){
        return label;


    }

    public void setSuccess(String label){
        this.label=label;

    }

    public void setFailed(String label){
        this.label=label;

    }

}

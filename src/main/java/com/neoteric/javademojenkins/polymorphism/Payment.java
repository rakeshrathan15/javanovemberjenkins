package com.neoteric.javademojenkins.polymorphism;

import java.util.Date;

public class Payment {


    private String transactionid;

    private String uter;

    private String status;

    private  String transactionId;

    private  Date transactiondate;

    public String getTransactionid() {
        return transactionId;
    }

    public void setTransactionid(String transactionId) {
        this.transactionId = transactionId;
    }

    public Date getTransactiondate() {
        return transactiondate;
    }

    public void setTransactiondate(Date transactiondate) {
        this.transactiondate = transactiondate;
    }

    public String getUter() {
        return uter;
    }

    public void setUter(String uter) {
        this.uter = uter;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

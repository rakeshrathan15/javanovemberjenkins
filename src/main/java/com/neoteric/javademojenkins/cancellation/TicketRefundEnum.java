package com.neoteric.javademojenkins.cancellation;

public enum TicketRefundEnum {

    Full_refund(1.0),
    half_refund(0.5),
    no_refund(0.0);

    private Double refund;

    private TicketRefundEnum(Double refund){
        this.refund=refund;
    }
    public Double getRefund(){
        return refund;
    }
}

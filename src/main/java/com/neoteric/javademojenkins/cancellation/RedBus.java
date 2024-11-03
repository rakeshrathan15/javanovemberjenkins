package com.neoteric.javademojenkins.cancellation;

import java.util.Date;

public class RedBus implements TicketCancellation {

    private long noofHours(Date startDate, Date endDate){

        long ms=endDate.getTime()-startDate.getTime();
        //System.out.println(ms);
        long totalHours= ms/(1000*60*60);
        System.out.println(totalHours);
        return totalHours;
    }

    @Override
    public double refundforCancellation(Ticket ticket, Date cancellationdate) {
        long noofhour=noofHours(cancellationdate,ticket.getBookingDate());
        double refundamount;

        if(noofhour>=48){

            refundamount=ticket.getAmount()* TicketRefundEnum.Full_refund.getRefund();
            System.out.println(refundamount);
        } else if (noofhour<48 && noofhour>=24) {
            refundamount=ticket.getAmount()*TicketRefundEnum.half_refund.getRefund();
            System.out.println(refundamount);
        }
        else {
            refundamount=ticket.getAmount()*TicketRefundEnum.no_refund.getRefund();
            System.out.println(refundamount);
        }
        return refundamount;
    }
}

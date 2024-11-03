package com.neoteric.javademojenkins.cancellation;

import java.util.Date;

public interface TicketCancellation {

    String name="rak";


    double refundforCancellation(Ticket ticket, Date cancelDate);
}

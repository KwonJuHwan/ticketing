package com.ticketing.domain.ticket.exception;

import com.ticketing.global.exception.ApplicationException;
import com.ticketing.global.exception.ErrorCode;

public class TicketNotFoundException extends ApplicationException {
    public TicketNotFoundException() {
        super(ErrorCode.TICKET_NOT_FOUND);
    }
}

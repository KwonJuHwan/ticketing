package com.ticketing.domain.show.exception;

import com.ticketing.global.exception.ApplicationException;
import com.ticketing.global.exception.ErrorCode;

public class ShowNotFoundException extends ApplicationException {
    public ShowNotFoundException() {
        super(ErrorCode.SHOW_NOT_FOUND);
    }
}

package com.ticketing.global.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {
    // COMMON
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "내부 서버 에러입니다."),
    INVALID_AUTHORIZATION_REQUEST(HttpStatus.UNAUTHORIZED, "서버에서 인증 오류가 발생했습니다."),
    INVALID_AUTHORIZATION_HEADER(HttpStatus.UNAUTHORIZED, "인증 헤더가 올바르지 않습니다."),
    INVALID_REQUEST_PARAM(HttpStatus.BAD_REQUEST, "잘못된 요청입니다."),

    // SHOW
    SHOW_NOT_FOUND(HttpStatus.NOT_FOUND, "해당 ID와 일치하는 공연이 존재하지 않습니다"),

    // TICKET
    TICKET_NOT_FOUND(HttpStatus.NOT_FOUND, "해당 ID와 일치하는 티켓이 존재하지 않습니다"),

    ;

    private final HttpStatus httpStatus;
    private final String message;
}

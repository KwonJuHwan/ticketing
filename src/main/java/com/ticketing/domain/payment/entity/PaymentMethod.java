package com.ticketing.domain.payment.entity;

import lombok.Getter;

@Getter
public enum PaymentMethod {
    CARD("카드"),
    GIFT_CARD("상품권"),
    PAY("간편 페이"),
    ACCOUNT_TRANSFER("계좌 이체");

    private final String value;

    PaymentMethod(String value) {
        this.value = value;
    }
}

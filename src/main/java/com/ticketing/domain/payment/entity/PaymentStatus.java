package com.ticketing.domain.payment.entity;

import lombok.Getter;

@Getter
public enum PaymentStatus {
    BEFORE("결제 전"),
    PROCEEDING("결제 중"),
    AFTER("결제 완료");

    private final String value;

    PaymentStatus(String value) {
        this.value = value;
    }
}

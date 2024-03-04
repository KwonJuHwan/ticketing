package com.ticketing.domain.show.entity;

import lombok.Getter;

@Getter
public enum Category {
    CONCERT("콘서트"),
    MUSICAL("뮤지컬"),
    SPORTS("스포츠"),
    EVENT("전시/행사"),
    CLASSIC("클래식/무용"),
    FAMILY("아동/가족"),
    THEATER("연극"),
    CAMPING("레저/캠핑");

    private final String value;

    Category(String value) {
        this.value = value;
    }
}

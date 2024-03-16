package com.ticketing.domain.ticket.entity.dto;

import jakarta.validation.constraints.NotBlank;

public record SectorCreateDto(
        String name,
        @NotBlank(message = "해당 구역의 수용 가능 인원을 작성해주세요.")
        int peopleNum,
        @NotBlank(message = "해당 구역의 가격을 작서해주세요.")
        int price
) {

}

package com.ticketing.domain.ticket.entity.dto;

import java.time.LocalDate;

public record TicketCreateDto(
        Long showId,
        String ticketTitle,
        LocalDate startDate,
        LocalDate endDate,
        String place,
        Integer showTime,
        String showInformation,
        String sellInformation
) {
}

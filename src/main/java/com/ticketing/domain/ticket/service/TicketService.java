package com.ticketing.domain.ticket.service;

import com.ticketing.domain.show.entity.Show;
import com.ticketing.domain.show.repository.ShowRepository;
import com.ticketing.domain.ticket.entity.Ticket;
import com.ticketing.domain.ticket.entity.dto.TicketCreateDto;
import com.ticketing.domain.show.exception.ShowNotFoundException;
import com.ticketing.domain.ticket.repository.TicketRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Transactional
public class TicketService {

    private final ShowRepository showRepository;

    private final TicketRepository ticketRepository;

    public void create(Long id, TicketCreateDto dto) {
        Show show = showRepository.findById(id).orElseThrow(ShowNotFoundException::new);

        Ticket ticket = Ticket.builder()
                .ticketTitle(dto.ticketTitle())
                .startDate(dto.startDate())
                .endDate(dto.endDate())
                .place(dto.place())
                .showTime(dto.showTime())
                .showInformation(dto.showInformation())
                .sellInformation(dto.sellInformation())
                .show(show).build();

        ticketRepository.save(ticket);
    }
}
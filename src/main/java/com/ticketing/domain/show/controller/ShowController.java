package com.ticketing.domain.show.controller;

import com.ticketing.domain.show.entity.dto.ShowCreateDto;
import com.ticketing.domain.show.service.ShowService;
import com.ticketing.domain.ticket.entity.dto.SectorCreateDto;
import com.ticketing.domain.ticket.entity.dto.TicketCreateDto;
import com.ticketing.domain.ticket.service.SectorService;
import com.ticketing.domain.ticket.service.TicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/shows")
public class ShowController {

    private final ShowService showService;
    private final TicketService ticketService;
    private final SectorService sectorService;

    @PostMapping
    public ResponseEntity<?> createShow(ShowCreateDto showCreateDto) {
        showService.create(showCreateDto);
        return ResponseEntity.created(URI.create("/")).build();
    }
    @PostMapping("/{show_id}")
    public ResponseEntity<?> createTicket(@PathVariable Long show_id, TicketCreateDto ticketCreateDto) {
        ticketService.create(show_id,ticketCreateDto);
        return ResponseEntity.created(URI.create("/")).build();
    }

    @PostMapping("/{show_id}/{ticket_id}")
    public ResponseEntity<?> createSector(@PathVariable Long ticket_id, List<SectorCreateDto> sectorCreateDtos) {
        sectorService.create(ticket_id, sectorCreateDtos);
        return ResponseEntity.created(URI.create("/")).build();
    }
}

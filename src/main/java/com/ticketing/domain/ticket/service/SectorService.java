package com.ticketing.domain.ticket.service;

import com.ticketing.domain.ticket.entity.Sector;
import com.ticketing.domain.ticket.entity.Ticket;
import com.ticketing.domain.ticket.entity.dto.SectorCreateDto;
import com.ticketing.domain.ticket.exception.TicketNotFoundException;
import com.ticketing.domain.ticket.repository.SectorRepository;
import com.ticketing.domain.ticket.repository.TicketRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class SectorService {

    private final TicketRepository ticketRepository;
    private final SectorRepository sectorRepository;

    public void create(Long ticketId, List<SectorCreateDto> sectorCreateDtos) {
        Ticket ticket = ticketRepository.findById(ticketId).orElseThrow(TicketNotFoundException::new);

        int now_sid = 0;
        char now_name = 'A';
        List<Sector> sectors = new ArrayList<>();
        for (SectorCreateDto sectorCreateDto : sectorCreateDtos) {
            String sectorName = sectorCreateDto.name().isBlank() ? String.valueOf(now_name++) : sectorCreateDto.name();
            int sectorNum = sectorCreateDto.peopleNum() / 20;
            int lastSector = sectorCreateDto.peopleNum() % 20;

            for (int i = 0; i < sectorNum; i++) {
                sectors.add(buildSector(sectorName, now_sid++, 20, sectorCreateDto.price(), ticket));
            }

            if (lastSector != 0) {
                sectors.add(buildSector(sectorName, now_sid++, lastSector, sectorCreateDto.price(), ticket));
            }
        }
        sectorRepository.saveAll(sectors);
    }

    private Sector buildSector(String name, int sId, int maxPeople, int price, Ticket ticket) {
        return Sector.builder()
                .name(name)
                .sId(sId)
                .maxPeople(maxPeople)
                .price(price)
                .ticket(ticket)
                .build();
    }
}

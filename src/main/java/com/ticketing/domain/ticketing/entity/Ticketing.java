package com.ticketing.domain.ticketing.entity;

import com.ticketing.domain.ticket.entity.Sector;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Ticketing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ticketing_date_id")
    private TicketingDate ticketingDate;

    @ManyToOne
    @JoinColumn(name = "sector_id")
    private Sector sector;

    @OneToOne(optional = false,cascade = CascadeType.ALL)
    private Stock stock;
}

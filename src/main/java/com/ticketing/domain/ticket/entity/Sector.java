package com.ticketing.domain.ticket.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Sector {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Min(10)
    @Max(20)
    @Column(nullable = false)
    private Integer maxPeople = 20;

    private String name;

    private Integer sId;

    @Column(nullable = false)
    private Integer price = 0;

    @ManyToOne
    @JoinColumn(name = "ticket_id")
    private Ticket ticket;

    @Builder
    public Sector(Long id, Integer maxPeople, String name, Integer sId, Integer price, Ticket ticket) {
        this.id = id;
        this.maxPeople = maxPeople;
        this.name = name;
        this.sId = sId;
        this.price = price;
        this.ticket = ticket;
    }
}

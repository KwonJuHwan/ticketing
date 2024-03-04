package com.ticketing.domain.ticket.entity;

import com.ticketing.domain.show.entity.Show;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.time.LocalDate;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String detailTitle;

    private LocalDate startDate;

    private LocalDate endDate;

    private String place;

    private Integer showTime;

    private String totalPrice;

    private String showInformation;

    private String sellInformation;

    @ManyToOne
    @JoinColumn(name = "show_id")
    private Show show;


}

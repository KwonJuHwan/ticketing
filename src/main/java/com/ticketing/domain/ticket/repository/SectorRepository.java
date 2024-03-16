package com.ticketing.domain.ticket.repository;

import com.ticketing.domain.ticket.entity.Sector;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SectorRepository extends JpaRepository<Sector,Long> {
}

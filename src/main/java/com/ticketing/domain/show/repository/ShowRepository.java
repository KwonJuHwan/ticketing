package com.ticketing.domain.show.repository;

import com.ticketing.domain.show.entity.Show;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowRepository extends JpaRepository<Show, Long> {
}

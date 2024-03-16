package com.ticketing.domain.show.service;

import com.ticketing.domain.show.entity.Show;
import com.ticketing.domain.show.entity.dto.ShowCreateDto;
import com.ticketing.domain.show.repository.ShowRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class ShowService {
    private final ShowRepository showRepository;

    public void create(ShowCreateDto showCreateDto) {
        Show show = Show.builder()
                .title(showCreateDto.ShowTitle())
                .imageUrl(showCreateDto.imageUrl())
                .category(showCreateDto.category())
                .build();
        showRepository.save(show);
    }
}

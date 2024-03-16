package com.ticketing.domain.show.entity.dto;

import com.ticketing.domain.show.entity.Category;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;

public record ShowCreateDto(
        @NotBlank
        String ShowTitle,
        @NotBlank
        String imageUrl,
        @NotBlank
        Category category
) {

}

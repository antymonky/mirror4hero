package com.example.demo4hero.infrastructure.api.dto;

import lombok.Builder;
import lombok.NonNull;
import lombok.Value;

@Value
@Builder
public class HeroDto {

    @NonNull
    private Long id;

    @NonNull
    private String name;

    private String alterEgo;

    private String power;
}

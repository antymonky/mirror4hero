package com.example.demo4hero.domain;

import lombok.Builder;
import lombok.NonNull;
import lombok.Value;

@Value
@Builder
public class Hero {

    @NonNull
    private Long id;

    @NonNull
    private String name;

    private String alterEgo;

    private String power;
}

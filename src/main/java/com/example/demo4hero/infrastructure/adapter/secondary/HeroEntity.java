package com.example.demo4hero.infrastructure.adapter.secondary;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HeroEntity {

    @Id
    private Long id;

    private String name;

    private String alterEgo;

    private String power;
}

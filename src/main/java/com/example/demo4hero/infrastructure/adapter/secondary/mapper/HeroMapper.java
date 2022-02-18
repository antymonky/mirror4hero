package com.example.demo4hero.infrastructure.adapter.secondary.mapper;

import com.example.demo4hero.domain.Hero;
import com.example.demo4hero.infrastructure.adapter.secondary.HeroEntity;
import com.example.demo4hero.infrastructure.api.dto.HeroDto;

public class HeroMapper {

    public HeroDto toHeroDto(Hero hero) {
        return HeroDto
                .builder()
                .id(hero.getId())
                .name(hero.getName())
                .alterEgo(hero.getAlterEgo())
                .power(hero.getPower())
                .build();
    }

    public Hero toHero(HeroEntity heroEntity) {
        return Hero
                .builder()
                .id(heroEntity.getId())
                .name(heroEntity.getName())
                .alterEgo(heroEntity.getAlterEgo())
                .power(heroEntity.getPower())
                .build();
    }

    public HeroEntity toHeroEntity(Hero hero) {
        final HeroEntity entity = new HeroEntity();

        return mapForUpdateEntity(entity, hero);
    }

    public HeroEntity mapForUpdateEntity(HeroEntity entity, Hero hero) {
        entity.setId(hero.getId());
        entity.setName(hero.getName());
        entity.setAlterEgo(hero.getAlterEgo());
        entity.setPower(hero.getPower());

        return entity;
    }
}

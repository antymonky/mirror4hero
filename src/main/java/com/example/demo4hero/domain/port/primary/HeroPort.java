package com.example.demo4hero.domain.port.primary;

import com.example.demo4hero.domain.Hero;

import java.util.Set;

public interface HeroPort {
    Set getAllHeroes();

    Hero getHero(Long heroId);

    void addHero(Hero hero);

    void updateHero(Long heroId, Hero hero);

    void deleteHero(Long heroId);
}

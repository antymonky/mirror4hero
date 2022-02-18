package com.example.demo4hero.domain.port.secondary;

import com.example.demo4hero.domain.Hero;

import java.util.Set;

public interface HeroRepository {
    Set<Hero> findAllHeroes();

    Hero findById(Long heroId);

    void save(Hero hero);

    void deleteById(Long heroId);
}

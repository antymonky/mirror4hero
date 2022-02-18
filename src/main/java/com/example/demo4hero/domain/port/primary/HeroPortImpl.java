package com.example.demo4hero.domain.port.primary;

import com.example.demo4hero.domain.Hero;
import com.example.demo4hero.domain.port.secondary.HeroRepository;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Set;

@AllArgsConstructor
public class HeroPortImpl implements HeroPort {

    private HeroRepository repository;

    @Override
    public Set getAllHeroes() {
        return repository.findAllHeroes();
    }

    @Override
    public Hero getHero(Long heroId) {
        return repository.findById(heroId);
    }

    @Override
    public void addHero(Hero hero) {
        repository.save(hero);
    }

    @Override
    public void updateHero(Long heroId, Hero hero) {
        repository.save(hero);
    }

    @Override
    public void deleteHero(Long heroId) {
        repository.deleteById(heroId);
    }
}

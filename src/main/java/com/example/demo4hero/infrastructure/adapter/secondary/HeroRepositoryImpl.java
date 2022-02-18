package com.example.demo4hero.infrastructure.adapter.secondary;

import com.example.demo4hero.domain.Hero;
import com.example.demo4hero.domain.port.secondary.HeroRepository;
import com.example.demo4hero.infrastructure.adapter.secondary.mapper.HeroMapper;
import lombok.AllArgsConstructor;

import java.util.Set;
import java.util.stream.Collectors;

@AllArgsConstructor
public class HeroRepositoryImpl implements HeroRepository {

    private final HeroCrudRepository repository;

    private final HeroMapper mapper;

    @Override
    public Set<Hero> findAllHeroes() {
        return repository.findAll().stream().map(mapper::toHero).collect(
                Collectors.toSet());
    }

    @Override
    public Hero findById(Long heroId) {
        return mapper.toHero(repository.findById(heroId));
    }

    @Override
    public void save(Hero hero) {
        HeroEntity entity = null;
        entity = repository.findById(hero.getId());

        if (entity == null) {
            entity = mapper.toHeroEntity(hero);
        } else {
            mapper.mapForUpdateEntity(entity, hero);
        }
        repository.save(entity);
    }

    @Override
    public void deleteById(Long heroId) {
        repository.deleteById(heroId);
    }
}

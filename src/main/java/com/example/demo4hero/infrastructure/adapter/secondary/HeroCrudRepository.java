package com.example.demo4hero.infrastructure.adapter.secondary;

import org.springframework.data.repository.Repository;

import java.util.List;

public interface HeroCrudRepository extends Repository<HeroEntity, Long> {

    List<HeroEntity> findAll();

    HeroEntity findById(Long id);

    void save(HeroEntity hero);

    void deleteById(Long heroId);
}

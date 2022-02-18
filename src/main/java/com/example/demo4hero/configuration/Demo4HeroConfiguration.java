package com.example.demo4hero.configuration;

import com.example.demo4hero.domain.port.primary.HeroPort;
import com.example.demo4hero.domain.port.primary.HeroPortImpl;
import com.example.demo4hero.domain.port.secondary.HeroRepository;
import com.example.demo4hero.infrastructure.adapter.secondary.HeroCrudRepository;
import com.example.demo4hero.infrastructure.adapter.secondary.HeroRepositoryImpl;
import com.example.demo4hero.infrastructure.adapter.secondary.mapper.HeroMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Demo4HeroConfiguration {

    @Bean
    HeroRepository heroRepository(HeroCrudRepository heroCrudRepository,
            HeroMapper heroMapper) {
        return new HeroRepositoryImpl(heroCrudRepository, heroMapper);
    }

    @Bean
    HeroMapper heroMapper() {
        return new HeroMapper();
    }

    @Bean
    HeroPort heroPort(HeroRepository repository, HeroMapper heroMapper) {
        return new HeroPortImpl(repository);
    }

}

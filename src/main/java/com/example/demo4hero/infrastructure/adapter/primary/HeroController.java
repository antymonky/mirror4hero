package com.example.demo4hero.infrastructure.adapter.primary;

import com.example.demo4hero.domain.port.primary.HeroPort;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Set;

public class HeroController {

    @Autowired
    private HeroPort heroPort;

}

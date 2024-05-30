package com.example.mahjong.domain.tile.suits;


import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CirclesList {

    public List<String> arrange(List<String> apiCodeList){
        return apiCodeList.stream()
                .filter(Circles::is筒子)
                .toList();
    }

}

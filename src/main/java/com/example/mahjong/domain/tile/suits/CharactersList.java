package com.example.mahjong.domain.tile.suits;


import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CharactersList {

    public List<String> arrange(List<String> apicodeList){
        return apicodeList.stream()
                .filter(Characters::is萬子)
                .collect(Collectors.toList());
    }
}

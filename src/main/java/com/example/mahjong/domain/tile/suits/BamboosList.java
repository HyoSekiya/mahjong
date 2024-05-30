package com.example.mahjong.domain.tile.suits;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class BamboosList {

    public List<String> arrange(List<String> apiCodeList){
        return apiCodeList.stream()
                .filter(Bamboos::is索子)
                .collect(Collectors.toList());
    }
}

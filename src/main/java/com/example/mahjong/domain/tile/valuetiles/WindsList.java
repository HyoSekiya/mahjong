package com.example.mahjong.domain.tile.valuetiles;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class WindsList {
    public List<String> arrange(List<String> apiCodeList){
        return apiCodeList.stream()
                .filter(Winds::is風牌)
                .collect(Collectors.toList());
    }
}

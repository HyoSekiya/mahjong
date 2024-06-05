package com.example.mahjong.domain.tile.valuetiles;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class DragonsList {

    public List<String> arrange(List<String> apiCodeList){
        return apiCodeList.stream()
                .filter(Dragons::is三元牌)
                .collect(Collectors.toList());
    }
}

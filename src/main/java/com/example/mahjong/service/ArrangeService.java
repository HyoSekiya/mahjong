package com.example.mahjong.service;

import com.example.mahjong.domain.tile.suits.*;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class ArrangeService {

    private final CharactersList charactersList;
    private final BamboosList bamboosList;
    private final CirclesList circleList;

    public ArrangeService(CharactersList charactersList, BamboosList bamboosList, CirclesList circleList) {
        this.charactersList = charactersList;
        this.bamboosList = bamboosList;
        this.circleList = circleList;
    }

    // 3.3.3.2で並べたい(数牌の種類を意識して)
    public List<String> arrange(List<String> apiCodeRequestList){

        List<String> sumList = new ArrayList<>();
        sumList.addAll(charactersList.arrange(apiCodeRequestList));
        sumList.addAll(bamboosList.arrange(apiCodeRequestList));
        sumList.addAll(circleList.arrange(apiCodeRequestList));

        return sumList;
    }
}

package com.example.mahjong.domain;

import com.example.mahjong.domain.tile.suits.*;
import com.example.mahjong.domain.tile.valuetiles.Dragons;
import com.example.mahjong.domain.tile.valuetiles.Winds;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class Arrange {

    /**
     * @param apiCodeRequestList
     * @return
     */
    public List<String> arrange(List<String> apiCodeRequestList){

        List<String> arrangeList = new ArrayList<>();
        arrangeList.addAll(Winds.extraction(apiCodeRequestList));
        arrangeList.addAll(Dragons.extraction(apiCodeRequestList));
        arrangeList.addAll(Characters.extraction(apiCodeRequestList));
        arrangeList.addAll(Bamboos.extraction(apiCodeRequestList));
        arrangeList.addAll(Circles.extraction(apiCodeRequestList));

        if (!(is上がった牌があっているか(arrangeList))){
            throw new RuntimeException("適切な牌をRequestしてくれ！！！");
        }
        return arrangeList;

    }

    private boolean is上がった牌があっているか(List<String> list){
        return list.size() == 14;
    }
}

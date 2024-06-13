package com.example.mahjong.domain;

import com.example.mahjong.domain.tile.suits.*;
import com.example.mahjong.domain.tile.valuetiles.Dragons;
import com.example.mahjong.domain.tile.valuetiles.Winds;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@AllArgsConstructor
/**
 * 並べる君
 */
public class Arrange {

    /**
     * @param apiCodeRequestList
     * @return 風牌(東、南、西、北)、三元牌(白、發、中)、萬子(1萬〜9萬)、索子(1索〜9索)、筒子(1筒〜9筒子)の順に並べて返す
     */
    public List<String> arrange(List<String> apiCodeRequestList){

        List<String> arrangeList = new ArrayList<>();
        arrangeList.addAll(Winds.extraction(apiCodeRequestList));
        arrangeList.addAll(Dragons.extraction(apiCodeRequestList));
        arrangeList.addAll(Characters.extraction(apiCodeRequestList));
        arrangeList.addAll(Bamboos.extraction(apiCodeRequestList));
        arrangeList.addAll(Circles.extraction(apiCodeRequestList));

        return arrangeList;

    }
}

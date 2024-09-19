package com.example.mahjong.domain.tile.domainservice;

import com.example.mahjong.domain.tile.Tiles;
import com.example.mahjong.domain.tile.suits.Bamboos;
import com.example.mahjong.domain.tile.suits.Characters;
import com.example.mahjong.domain.tile.suits.Circles;
import com.example.mahjong.domain.tile.valuetiles.Dragons;
import com.example.mahjong.domain.tile.valuetiles.Winds;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Comparator;
import java.util.List;

/**
 * 並べる君
 */
@Component
@AllArgsConstructor
public class Arrange {

    private final List<Tiles> arrangeList;

    /**
     * @return 風牌(東、南、西、北)、三元牌(白、發、中)、萬子(1萬〜9萬)、索子(1索〜9索)、筒子(1筒〜9筒子)の順に並べて返す
     */
    public List<Tiles> 並べる(List<Tiles> tilesList) {

        arrangeList.addAll(Tiles.三元牌を並べる(tilesList));
        arrangeList.addAll(Tiles.風牌を並べる(tilesList));
        arrangeList.addAll(Tiles.萬子を並べる(tilesList));
        arrangeList.addAll(Tiles.索子を並べる(tilesList));
        arrangeList.addAll(Tiles.筒子を並べる(tilesList));

        return arrangeList;
    }
}

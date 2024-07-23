package com.example.mahjong.domain.tile;

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

        arrangeList.addAll(this.三元牌を並べて抽出(tilesList));
        arrangeList.addAll(this.風牌を並べる(tilesList));
        arrangeList.addAll(this.萬子を並べる(tilesList));
        arrangeList.addAll(this.索子を並べる(tilesList));
        arrangeList.addAll(this.筒子を並べる(tilesList));

        return arrangeList;
    }

    private List<Dragons> 三元牌を並べて抽出(List<Tiles> tilesList){
        return tilesList.stream()
                .filter(tiles -> tiles.is三元牌())
                .map(tiles -> (Dragons)tiles)
                .sorted(Comparator.comparingInt(Dragons::三元牌に順序をつける))
                .toList();
    }

    private List<Winds> 風牌を並べる(List<Tiles> tilesList) {
        return tilesList.stream()
                .filter(tiles -> tiles.is風牌())
                .map(tiles -> (Winds) tiles)
                .sorted(Comparator.comparingInt(Winds::風牌に順序をつける))
                .toList();
    }

    private List<Characters> 萬子を並べる(List<Tiles> tilesList) {
        return tilesList.stream()
                .filter(tiles -> tiles.is萬子())
                .map(tiles -> (Characters) tiles)
                .sorted(Comparator.comparingInt(Characters::萬子に順序をつける))
                .toList();
    }

    private List<Bamboos> 索子を並べる(List<Tiles> tilesList){
        return tilesList.stream()
                .filter(tiles -> tiles.is索子())
                .map(tiles -> (Bamboos) tiles)
                .sorted(Comparator.comparingInt(Bamboos::索子に順序をつける))
                .toList();
    }

    private List<Circles> 筒子を並べる(List<Tiles> tilesList){
        return tilesList.stream()
                .filter(tiles -> tiles.is筒子())
                .map(tiles -> (Circles) tiles)
                .sorted(Comparator.comparingInt(Circles::筒子に順序をつける))
                .toList();
    }
}

package com.example.mahjong.domain.set;

import com.example.mahjong.domain.tile.tiles.Tiles;
import com.example.mahjong.domain.tile.tiles.suits.Bamboos;
import com.example.mahjong.domain.tile.tiles.suits.Characters;
import com.example.mahjong.domain.tile.tiles.suits.Circles;
import com.example.mahjong.domain.tile.tiles.valuetiles.Dragons;
import com.example.mahjong.domain.tile.tiles.valuetiles.Winds;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * 対子(トイツ)
 */
@AllArgsConstructor
public enum Pair {
    // 萬子 (Characters)
    一萬(Characters.ONE_CHARACTERS, Characters.ONE_CHARACTERS),
    二萬(Characters.TWO_CHARACTERS, Characters.TWO_CHARACTERS),
    三萬(Characters.THREE_CHARACTERS, Characters.THREE_CHARACTERS),
    四萬(Characters.FOUR_CHARACTERS, Characters.FOUR_CHARACTERS),
    五萬(Characters.FIVE_CHARACTERS, Characters.FIVE_CHARACTERS),
    六萬(Characters.SIX_CHARACTERS, Characters.SIX_CHARACTERS),
    七萬(Characters.SEVEN_CHARACTERS, Characters.SEVEN_CHARACTERS),
    八萬(Characters.EIGHT_CHARACTERS, Characters.EIGHT_CHARACTERS),
    九萬(Characters.NINE_CHARACTERS, Characters.NINE_CHARACTERS),

    // 筒子 (Circles)
    一筒(Circles.ONE_CIRCLES, Circles.ONE_CIRCLES),
    二筒(Circles.TWO_CIRCLES, Circles.TWO_CIRCLES),
    三筒(Circles.THREE_CIRCLES, Circles.THREE_CIRCLES),
    四筒(Circles.FOUR_CIRCLES, Circles.FOUR_CIRCLES),
    五筒(Circles.FIVE_CIRCLES, Circles.FIVE_CIRCLES),
    六筒(Circles.SIX_CIRCLES, Circles.SIX_CIRCLES),
    七筒(Circles.SEVEN_CIRCLES, Circles.SEVEN_CIRCLES),
    八筒(Circles.EIGHT_CIRCLES, Circles.EIGHT_CIRCLES),
    九筒(Circles.NINE_CIRCLES, Circles.NINE_CIRCLES),

    // 索子 (Bamboos)
    一索(Bamboos.ONE_BAMBOOS, Bamboos.ONE_BAMBOOS),
    二索(Bamboos.TWO_BAMBOOS, Bamboos.TWO_BAMBOOS),
    三索(Bamboos.THREE_BAMBOOS, Bamboos.THREE_BAMBOOS),
    四索(Bamboos.FOUR_BAMBOOS, Bamboos.FOUR_BAMBOOS),
    五索(Bamboos.FIVE_BAMBOOS, Bamboos.FIVE_BAMBOOS),
    六索(Bamboos.SIX_BAMBOOS, Bamboos.SIX_BAMBOOS),
    七索(Bamboos.SEVEN_BAMBOOS, Bamboos.SEVEN_BAMBOOS),
    八索(Bamboos.EIGHT_BAMBOOS, Bamboos.EIGHT_BAMBOOS),
    九索(Bamboos.NINE_BAMBOOS, Bamboos.NINE_BAMBOOS),

    // 三元牌(Dragons)
    白(Dragons.WHITE_DRAGON, Dragons.WHITE_DRAGON),
    發(Dragons.GREEN_DRAGON, Dragons.GREEN_DRAGON),
    中(Dragons.RED_DRAGON, Dragons.RED_DRAGON),

    // 風牌(Winds)
    東(Winds.EAST, Winds.EAST),
    南(Winds.SOUTH, Winds.SOUTH),
    西(Winds.WEST, Winds.WEST),
    北(Winds.NORTH, Winds.NORTH);

    public Tiles pair1;

    public Tiles pair2;

    public static List<Pair> whichPairAreIncluded(List<Tiles> list) {
        List<Pair> pairList = new ArrayList<>();

        for(Pair pair : Pair.values()) {
            if (isMatchingPair1(list, pair)) {
                pairList.add(pair);
            }
        }

        return pairList;
    }

    private static boolean isMatchingPair1(List<Tiles> list, Pair pair) {
        return list.stream().filter(tiles -> tiles.equals(pair)).count() == 2;
    }
}

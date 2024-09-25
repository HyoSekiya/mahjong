package com.example.mahjong.domain.tile.tiles;

import com.example.mahjong.domain.tile.tiles.suits.Bamboos;
import com.example.mahjong.domain.tile.tiles.suits.Characters;
import com.example.mahjong.domain.tile.tiles.suits.Circles;
import com.example.mahjong.domain.tile.tiles.valuetiles.Dragons;
import com.example.mahjong.domain.tile.tiles.valuetiles.Winds;
import org.springframework.stereotype.Component;

import java.util.Comparator;
import java.util.List;

/**
 * 牌
 */

@Component
public interface Tiles {

    boolean is役牌();

    boolean is風牌();

    boolean is三元牌();

    boolean is白();

    boolean is發();

    boolean is中();

    boolean is萬子();

    boolean is索子();

    boolean is筒子();

    boolean is19字牌();

    boolean is1or9();

    boolean isNot19字牌();

    static Tiles whichTiles(String value) {

        for(Dragons dragons: Dragons.values()){
            if (dragons.apiCode.equals(value)){
                return dragons;
            }
        }


        for(Winds winds: Winds.values()) {
            if (winds.apiCode.equals(value)) {
                return winds;
            }
        }


        for(Characters characters: Characters.values()){
            if (characters.apiCode.equals(value)) {
                return characters;
            }
        }

        // 索子
        for (Bamboos bamboos: Bamboos.values()){
            if (bamboos.apiCode.equals(value)) {
                return bamboos;
            }
        }

        // 筒子
        for (Circles circles: Circles.values()) {
            if (circles.apiCode.equals(value)) {
                return circles;
            }
        }

        // 予期しないコード値
        return NotTiles.NOT_EXISTS;
    }

    static List<Dragons> 三元牌を並べる(List<Tiles> tilesList){
        return tilesList.stream()
                .filter(tiles -> tiles.is三元牌())
                .map(tiles -> (Dragons)tiles)
                .sorted(Comparator.comparingInt(Dragons::三元牌に順序をつける))
                .toList();
    }

    static List<Winds> 風牌を並べる(List<Tiles> tilesList) {
        return tilesList.stream()
                .filter(tiles -> tiles.is風牌())
                .map(tiles -> (Winds) tiles)
                .sorted(Comparator.comparingInt(Winds::風牌に順序をつける))
                .toList();
    }

    static List<Characters> 萬子を並べる(List<Tiles> tilesList) {
        return tilesList.stream()
                .filter(tiles -> tiles.is萬子())
                .map(tiles -> (Characters) tiles)
                .sorted(Comparator.comparingInt(Characters::萬子に順序をつける))
                .toList();
    }

    static List<Bamboos> 索子を並べる(List<Tiles> tilesList){
        return tilesList.stream()
                .filter(tiles -> tiles.is索子())
                .map(tiles -> (Bamboos) tiles)
                .sorted(Comparator.comparingInt(Bamboos::索子に順序をつける))
                .toList();
    }

    static List<Circles> 筒子を並べる(List<Tiles> tilesList){
        return tilesList.stream()
                .filter(tiles -> tiles.is筒子())
                .map(tiles -> (Circles) tiles)
                .sorted(Comparator.comparingInt(Circles::筒子に順序をつける))
                .toList();
    }
}

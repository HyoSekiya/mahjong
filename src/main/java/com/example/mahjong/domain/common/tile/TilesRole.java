package com.example.mahjong.domain.common.tile;

import com.example.mahjong.domain.tile.NotTiles;
import com.example.mahjong.domain.tile.Tiles;
import com.example.mahjong.domain.tile.suits.Bamboos;
import com.example.mahjong.domain.tile.suits.Characters;
import com.example.mahjong.domain.tile.suits.Circles;
import com.example.mahjong.domain.tile.valuetiles.Dragons;
import com.example.mahjong.domain.tile.valuetiles.Winds;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * 牌に変換くん
 */
@Component
@AllArgsConstructor
public class TilesRole {

    public Tiles 牌に変換(String value) {
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

        for (Bamboos bamboos: Bamboos.values()){
            if (bamboos.apiCode.equals(value)) {
                return bamboos;
            }
        }

        for (Circles circles: Circles.values()) {
            if (circles.apiCode.equals(value)) {
                return circles;
            }
        }

        return NotTiles.NOT_EXISTS;
    }

}

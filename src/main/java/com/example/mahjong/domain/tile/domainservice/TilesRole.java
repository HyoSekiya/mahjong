package com.example.mahjong.domain.tile.domainservice;

import com.example.mahjong.domain.tile.tiles.NotTiles;
import com.example.mahjong.domain.tile.tiles.Tiles;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * 牌に変換くん
 */
@Component
@AllArgsConstructor
public class TilesRole {

    public List<Tiles> 利用者の牌を牌に変換(List<String> playerRequest) {

        List<Tiles> tilesList = new ArrayList<>();

        /**
         * 牌に変換
         */
        for (String playerTile: playerRequest) {
            tilesList.add(this.牌に変換(playerTile));
        }

        if (tilesList.contains(NotTiles.NOT_EXISTS)) {
            throw new RuntimeException("不正の値が入ってる〜");
        }

        return tilesList;
    }

    public Tiles 牌に変換(String value) {

        return Tiles.whichTiles(value);

    }

}

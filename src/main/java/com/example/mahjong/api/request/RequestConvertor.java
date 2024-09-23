package com.example.mahjong.api.request;

import com.example.mahjong.domain.tile.NotTiles;
import com.example.mahjong.domain.tile.Tiles;
import com.example.mahjong.domain.tile.domainservice.TilesRole;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * 利用者のリクエストを牌に変換するくん
 */
@AllArgsConstructor
@Component
public class RequestConvertor {

    private final TilesRole tilesRole;
    public List<Tiles> 利用者の牌を牌に変換(List<String> playerRequest) {

        List<Tiles> tilesList = new ArrayList<>();

        /**
         * 牌に変換
         */
        for (String playerTile: playerRequest) {
            tilesList.add(tilesRole.牌に変換(playerTile));
        }

        if (tilesList.contains(NotTiles.NOT_EXISTS)) {
            throw new RuntimeException("不正の値が入ってる〜");
        }

        return tilesList;
    }

    private boolean is少牌(List<String> playerRequest){
        return playerRequest.size() < 14;
    }

    private boolean is多牌(List<String> playerRequest){
        return playerRequest.size() > 14;
    }


}

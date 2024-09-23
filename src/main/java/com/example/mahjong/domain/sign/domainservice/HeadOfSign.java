package com.example.mahjong.domain.sign.domainservice;

import com.example.mahjong.domain.sign.signs.Sign;
import com.example.mahjong.domain.tile.tiles.Tiles;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 符計算における雀頭の判定
 */
@AllArgsConstructor
@Component
public class HeadOfSign {

    public Sign judgement (List<Tiles> tileList) {

        return null;
    }

}

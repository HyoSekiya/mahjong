package com.example.mahjong.domain.tile;

import com.example.mahjong.domain.tile.Tiles;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum NotTiles implements Tiles {

    NOT_EXISTS("知らない値");

    public final String label;

    @Override
    public boolean is風牌() {
        return false;
    }

    @Override
    public boolean is三元牌() {
        return false;
    }

    @Override
    public boolean is中() {
        return false;
    }

    @Override
    public boolean is萬子() {
        return false;
    }

    @Override
    public boolean is索子() {
        return false;
    }

    @Override
    public boolean is筒子() {
        return false;
    }
}

package com.example.mahjong.domain.tile.tiles;

import lombok.AllArgsConstructor;


/**
 * 定義されてない牌
 */
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
    public boolean is白() {
        return false;
    }

    @Override
    public boolean is發() {
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

    @Override
    public boolean is19字牌() {
        return false;
    }

    @Override
    public boolean isNot19字牌() {
        return false;
    }
}

package com.example.mahjong.domain.tile.tiles.valuetiles;

import com.example.mahjong.domain.tile.tiles.Tiles;
import lombok.AllArgsConstructor;


/**
 * Winds(風牌)
 */
@AllArgsConstructor
public enum Winds implements Tiles {
    EAST("東","east"),
    SOUTH("南","south"),
    WEST("西","west"),
    NORTH("北","north")

    ;

    public final String label;

    public final String apiCode;

    @Override
    public boolean is風牌() {
        return true;
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
        return true;
    }

    public int 風牌に順序をつける(){
        return switch (this) {
            case EAST -> 1;
            case SOUTH -> 2;
            case WEST -> 3;
            case NORTH -> 4;
        };
    }
}

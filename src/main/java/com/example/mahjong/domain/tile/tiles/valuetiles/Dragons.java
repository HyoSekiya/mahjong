package com.example.mahjong.domain.tile.tiles.valuetiles;

import com.example.mahjong.domain.tile.tiles.Tiles;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Dragons(三元牌)
 */
@AllArgsConstructor
public enum Dragons implements Tiles {

    WHITE_DRAGON("白","white_dragon"),
    GREEN_DRAGON("發","green_dragon"),
    RED_DRAGON("中","red_dragon")

    ;

    public final String label;

    @Getter
    public final String apiCode;

//    @Override
//    public Tiles whichTiles(String value) {
//
//        // 三元牌
//        for(Dragons dragons: Dragons.values()){
//            if (dragons.apiCode.equals(value)){
//                return dragons;
//            }
//        }
//
//        return NotTiles.NOT_EXISTS;
//    }

    @Override
    public String getLabel() {
        return this.label;
    }

    @Override
    public boolean is役牌() {
        return true;
    }

    @Override
    public boolean is風牌() {
        return false;
    }

    @Override
    public boolean is三元牌() {
        return true;
    }

    @Override
    public boolean is白() {
        return this.equals(WHITE_DRAGON);
    }

    @Override
    public boolean is發() {
        return this.equals(GREEN_DRAGON);
    }

    @Override
    public boolean is中() {
        return this.equals(RED_DRAGON);
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
        return true;
    }

    @Override
    public boolean is1or9() {
        return false;
    }

    @Override
    public boolean isNot19字牌() {
        return true;
    }

    public int 三元牌に順序をつける(){
        return switch (this) {
            case WHITE_DRAGON -> 1;
            case GREEN_DRAGON -> 2;
            case RED_DRAGON -> 3;
        };
    }
}

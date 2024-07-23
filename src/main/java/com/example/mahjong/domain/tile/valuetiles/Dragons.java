package com.example.mahjong.domain.tile.valuetiles;

import com.example.mahjong.domain.tile.Tiles;
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

    @Override
    public boolean is風牌() {
        return false;
    }

    @Override
    public boolean is三元牌() {
        return true;
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
    public boolean is中() {
        return this.equals(RED_DRAGON);
    }

    public static int 三元牌に順序をつける(Dragons tiles){
        return switch (tiles) {
            case WHITE_DRAGON -> 1;
            case GREEN_DRAGON -> 2;
            case RED_DRAGON -> 3;
        };
    }
}

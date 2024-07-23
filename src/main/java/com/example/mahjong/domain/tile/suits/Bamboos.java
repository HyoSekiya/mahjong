package com.example.mahjong.domain.tile.suits;

import com.example.mahjong.domain.tile.Tiles;
import lombok.AllArgsConstructor;

/**
 *　索子
 */
@AllArgsConstructor
public enum Bamboos implements Tiles {

    ONE_BAMBOOS("1索", "one_bamboo"),
    TWO_BAMBOOS("2索", "two_bamboo"),
    THREE_BAMBOOS("3索", "three_bamboo"),
    FOUR_BAMBOOS("4索", "four_bamboo"),
    FIVE_BAMBOOS("5索", "five_bamboo"),
    SIX_BAMBOOS("6索", "six_bamboo"),
    SEVEN_BAMBOOS("7索", "seven_bamboo"),
    EIGHT_BAMBOOS("8索", "eight_bamboo"),
    NINE_BAMBOOS("9索", "nine_bamboo"),
    ;


    public final String level;

    public final String apiCode;

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
        return true;
    }

    @Override
    public boolean is筒子() {
        return false;
    }

    public static int 索子に順序をつける(Bamboos tiles) {
        return switch (tiles) {
            case ONE_BAMBOOS -> 1;
            case TWO_BAMBOOS -> 2;
            case THREE_BAMBOOS -> 3;
            case FOUR_BAMBOOS -> 4;
            case FIVE_BAMBOOS -> 5;
            case SIX_BAMBOOS -> 6;
            case SEVEN_BAMBOOS -> 7;
            case EIGHT_BAMBOOS -> 8;
            case NINE_BAMBOOS -> 9;
        };
    }
}

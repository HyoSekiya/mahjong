package com.example.mahjong.domain.tile.suits;

import com.example.mahjong.domain.tile.Tiles;
import com.example.mahjong.domain.tile.valuetiles.Winds;
import lombok.AllArgsConstructor;

/**
 * 萬子
 */
@AllArgsConstructor
public enum Characters implements Tiles {

    ONE_CHARACTERS("1萬", "one_character"),
    TWO_CHARACTERS("2萬", "two_character"),
    THREE_CHARACTERS("3萬", "three_character"),
    FOUR_CHARACTERS("4萬", "four_character"),
    FIVE_CHARACTERS("5萬", "five_character"),
    SIX_CHARACTERS("6萬", "six_character"),
    SEVEN_CHARACTERS("7萬", "seven_character"),
    EIGHT_CHARACTERS("8萬", "eight_character"),
    NINE_CHARACTERS("9萬", "nine_character"),
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
        return true;
    }

    @Override
    public boolean is索子() {
        return false;
    }

    @Override
    public boolean is筒子() {
        return false;
    }

    public static int 萬子に順序をつける(Characters tiles){
        return switch (tiles) {
            case ONE_CHARACTERS -> 1;
            case TWO_CHARACTERS -> 2;
            case THREE_CHARACTERS -> 3;
            case FOUR_CHARACTERS -> 4;
            case FIVE_CHARACTERS -> 5;
            case SIX_CHARACTERS -> 6;
            case SEVEN_CHARACTERS -> 7;
            case EIGHT_CHARACTERS -> 8;
            case NINE_CHARACTERS -> 9;
        };
    }
}

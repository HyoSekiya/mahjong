package com.example.mahjong.domain.tile.suits;

import lombok.AllArgsConstructor;

/**
 * 萬子
 */
@AllArgsConstructor
public enum Characters{

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

    public static boolean is萬子(String apiCode) {
        for (Characters characters: Characters.values()){
            if(apiCode.equals(characters.apiCode)){
                return true;
            }
        }

        return false;
    }
}

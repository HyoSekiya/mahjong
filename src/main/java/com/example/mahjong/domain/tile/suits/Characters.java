package com.example.mahjong.domain.tile.suits;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 萬子
 */
@AllArgsConstructor
public enum Characters{

    ONE_CHARACTERS("1萬", "one_characters"),
    TWO_CHARACTERS("2萬", "two_characters"),
    THREE_CHARACTERS("3萬", "three_characters"),
    FOUR_CHARACTERS("4萬", "four_characters"),
    FIVE_CHARACTERS("5萬", "five_characters"),
    SIX_CHARACTERS("6萬", "six_characters"),
    SEVEN_CHARACTERS("7萬", "seven_characters"),
    EIGHT_CHARACTERS("8萬", "eight_characters"),
    NINE_CHARACTERS("9萬", "nine_characters"),
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

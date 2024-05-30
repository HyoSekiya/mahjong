package com.example.mahjong.domain.tile.suits;

import lombok.AllArgsConstructor;

/**
 *　索子
 */
@AllArgsConstructor
public enum Bamboos {

    ONE_BAMBOOS("1索", "one_bamboos"),
    TWO_BAMBOOS("2索", "two_bamboos"),
    THREE_BAMBOOS("3索", "three_bamboos"),
    FOUR_BAMBOOS("4索", "four_bamboos"),
    FIVE_BAMBOOS("5索", "five_bamboos"),
    SIX_BAMBOOS("6索", "six_bamboos"),
    SEVEN_BAMBOOS("7索", "seven_bamboos"),
    EIGHT_BAMBOOS("8索", "eight_bamboos"),
    NINE_BAMBOOS("9索", "nine_bamboos"),
    ;

    public final String level;

    public final String apiCode;

    public static boolean is索子(String apiCode) {
        for (Bamboos bamboos: Bamboos.values()) {
            if (bamboos.apiCode.equals(apiCode)){
                return true;
            }
        }
        return false;
    }
}

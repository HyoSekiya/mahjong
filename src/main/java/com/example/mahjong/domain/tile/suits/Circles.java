package com.example.mahjong.domain.tile.suits;

import lombok.AllArgsConstructor;

/**
 * 筒子
 */
@AllArgsConstructor
public enum Circles {

    ONE_CIRCLES("1筒", "one_circles"),
    TWO_CIRCLES("2筒", "two_circles"),
    THREE_CIRCLES("3筒", "three_circles"),
    FOUR_CIRCLES("4筒", "four_circles"),
    FIVE_CIRCLES("5筒", "five_circles"),
    SIX_CIRCLES("6筒", "six_circles"),
    SEVEN_CIRCLES("7筒", "seven_circles"),
    EIGHT_CIRCLES("8筒", "eight_circles"),
    NINE_CIRCLES("9筒", "nine_circles")
    ;

    public final String level;
    public final String apiCode;

    public static boolean is筒子(String apiCode) {
        for(Circles circles: Circles.values()){
            return apiCode.equals(circles.apiCode);
        }

        return false;
    }
}

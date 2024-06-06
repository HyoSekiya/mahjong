package com.example.mahjong.domain.tile.suits;

import lombok.AllArgsConstructor;

import java.util.List;

/**
 * 筒子
 */
@AllArgsConstructor
public enum Circles {

    ONE_CIRCLES("1筒", "one_circle"),
    TWO_CIRCLES("2筒", "two_circle"),
    THREE_CIRCLES("3筒", "three_circle"),
    FOUR_CIRCLES("4筒", "four_circle"),
    FIVE_CIRCLES("5筒", "five_circle"),
    SIX_CIRCLES("6筒", "six_circle"),
    SEVEN_CIRCLES("7筒", "seven_circle"),
    EIGHT_CIRCLES("8筒", "eight_circle"),
    NINE_CIRCLES("9筒", "nine_circle")
    ;

    public final String level;
    public final String apiCode;

    private static boolean is筒子(String apiCode) {
        for(Circles circles: Circles.values()){
            return apiCode.equals(circles.apiCode);
        }

        return false;
    }

    public static List<String> extraction(List<String> apiCodeList){
        return apiCodeList.stream()
                .filter(Circles::is筒子)
                .toList();
    }
}

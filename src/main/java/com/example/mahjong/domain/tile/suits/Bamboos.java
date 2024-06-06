package com.example.mahjong.domain.tile.suits;

import lombok.AllArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

/**
 *　索子
 */
@AllArgsConstructor
public enum Bamboos {

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

    private static boolean is索子(String apiCode) {
        for (Bamboos bamboos: Bamboos.values()) {
            if (bamboos.apiCode.equals(apiCode)){
                return true;
            }
        }
        return false;
    }

    public static List<String> extraction(List<String> apiCodeList){
        return apiCodeList.stream()
                .filter(Bamboos::is索子)
                .collect(Collectors.toList());
    }
}

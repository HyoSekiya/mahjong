package com.example.mahjong.domain.tile.suits;

import lombok.AllArgsConstructor;

import java.util.Comparator;
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
                .sorted(Comparator.comparingInt(apiCode -> arrange(convertBamboos(apiCode))))
                .collect(Collectors.toList());
    }

    public static boolean is19字牌(String apiCode){
        return apiCode.equals(ONE_BAMBOOS.apiCode) || apiCode.equals(NINE_BAMBOOS.apiCode);
    }

    public static int arrange (Bamboos bamboos){
        return switch (bamboos){
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

    public static Bamboos convertBamboos(String apiCode){
        for (Bamboos bamboos: Bamboos.values()){
            if (bamboos.apiCode.equals(apiCode)){
                return bamboos;
            }
        }
        throw new RuntimeException(apiCode + "は索子ではないので、変換できません");
    }
}

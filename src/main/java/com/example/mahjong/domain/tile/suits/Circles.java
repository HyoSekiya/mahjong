package com.example.mahjong.domain.tile.suits;

import lombok.AllArgsConstructor;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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
            if (circles.apiCode.equals(apiCode)){
                return true;
            }
        }
        return false;
    }

    public static List<String> extraction(List<String> apiCodeList){
        return apiCodeList.stream()
                .filter(Circles::is筒子)
                .sorted(Comparator.comparingInt(apiCode -> arrange(convertCircles(apiCode))))
                .collect(Collectors.toList());
    }

    public static boolean is19字牌(String apiCode){
        return apiCode.equals(ONE_CIRCLES.apiCode) || apiCode.equals(NINE_CIRCLES.apiCode);
    }

    public static int arrange (Circles circles){
        return switch (circles){
            case ONE_CIRCLES -> 1;
            case TWO_CIRCLES -> 2;
            case THREE_CIRCLES -> 3;
            case FOUR_CIRCLES -> 4;
            case FIVE_CIRCLES -> 5;
            case SIX_CIRCLES -> 6;
            case SEVEN_CIRCLES -> 7;
            case EIGHT_CIRCLES -> 8;
            case NINE_CIRCLES -> 9;
        };
    }

    public static Circles convertCircles(String apiCode){
        for (Circles circles: Circles.values()){
            if (circles.apiCode.equals(apiCode)){
                return circles;
            }
        }
        throw new RuntimeException(apiCode + "は筒子ではないので、変換できません");
    }
}

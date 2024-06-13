package com.example.mahjong.domain.tile.valuetiles;

import lombok.AllArgsConstructor;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Winds(風牌)
 */
@AllArgsConstructor
public enum Winds {
    East("東","east"),
    South("南","south"),
    West("西","west"),
    North("北","north")
    ;

    private final String label;

    private final String apiCode;

    public static boolean is風牌(String apiCode){
        for(Winds winds: Winds.values()){
            if (apiCode.equals(winds.apiCode)){
                return true;
            }
        }
        return false;
    }

    public static List<String> extraction(List<String> apiCodeList){
        return apiCodeList.stream()
                .filter(Winds::is風牌)
                .sorted(Comparator.comparingInt(apiCode -> arrange(convertWinds(apiCode))))
                .collect(Collectors.toList());
    }

    public static int arrange(Winds winds){
        return switch(winds) {
            case East -> 1;
            case South -> 2;
            case West -> 3;
            case North -> 4;
        };
    }

    public static Winds convertWinds(String apiCode){
        for (Winds winds: Winds.values()){
            if (winds.apiCode.equals(apiCode)){
                return winds;
            }
        }
        throw new RuntimeException(apiCode + "は風牌ではないので、変換できません");
    }
}

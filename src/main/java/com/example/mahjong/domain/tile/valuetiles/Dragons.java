package com.example.mahjong.domain.tile.valuetiles;

import lombok.AllArgsConstructor;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Dragons(三元牌)
 */
@AllArgsConstructor
public enum Dragons {

    WHITE_DRAGON("白","white_dragon"),
    GREEN_DRAGON("發","green_dragon"),
    RED_DRAGON("中","red_dragon")

    ;

    public final String label;

    public final String apiCode;

    private static boolean is三元牌(String apiCode){
        for(Dragons dragons: Dragons.values()){
            if (apiCode.equals(dragons.apiCode)){
                return true;
            }
        }
        return false;
    }

    public static List<String> extraction(List<String> apiCodeList){
        return apiCodeList.stream()
                .filter(Dragons::is三元牌)
                .sorted(Comparator.comparingInt(apiCode -> Dragons.arrange(convertDragons(apiCode))))
                .collect(Collectors.toList());
    }

    public static Dragons convertDragons(String apiCode){
        for (Dragons dragons: Dragons.values()){
            if (dragons.apiCode.equals(apiCode)){
                return dragons;
            }
        }
        throw new RuntimeException(apiCode + "は三元牌ではないので、変換できません");
    }

    public static boolean is白(String apiCode){
        return apiCode.equals(WHITE_DRAGON.apiCode);
    }

    public static boolean is發(String apiCode){
        return apiCode.equals(GREEN_DRAGON.apiCode);
    }

    public static boolean is中(String apiCode){
        return apiCode.equals(RED_DRAGON.apiCode);
    }

    public static int arrange(Dragons dragons){
        return switch (dragons) {
            case  WHITE_DRAGON -> 1;
            case GREEN_DRAGON -> 2;
            case RED_DRAGON -> 3;
        };
    }
}

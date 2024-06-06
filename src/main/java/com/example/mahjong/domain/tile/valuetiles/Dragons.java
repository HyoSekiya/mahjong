package com.example.mahjong.domain.tile.valuetiles;

import lombok.AllArgsConstructor;

import java.util.List;
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
                    .collect(Collectors.toList());
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
}

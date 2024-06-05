package com.example.mahjong.domain.tile.valuetiles;

import lombok.AllArgsConstructor;

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
}

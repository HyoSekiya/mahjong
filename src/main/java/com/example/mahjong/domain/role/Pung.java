package com.example.mahjong.domain.role;

import com.example.mahjong.domain.tile.Tiles;
import com.example.mahjong.domain.tile.suits.Bamboos;
import com.example.mahjong.domain.tile.suits.Characters;
import com.example.mahjong.domain.tile.suits.Circles;

import java.util.ArrayList;
import java.util.List;

/**
 * 刻子（コーツ）
 */
public enum Pung {

    萬子111,
    萬子222,
    萬子333,
    萬子444,
    萬子555,
    萬子666,
    萬子777,
    萬子888,
    萬子999,
    筒子111,
    筒子222,
    筒子333,
    筒子444,
    筒子555,
    筒子666,
    筒子777,
    筒子888,
    筒子999,
    索子111,
    索子222,
    索子333,
    索子444,
    索子555,
    索子666,
    索子777,
    索子888,
    索子999
    ;

    /**
     * 配牌の中にどの組み合わせの刻子が含まれているか
     */
    public static List<Pung> whichPungsAreIncluded(List<Tiles> list) {
        List<Pung> pungList = new ArrayList<>();

        // 萬子の刻子判定
        if (is萬子111(list)) {
            pungList.add(萬子111);
        }

        if (is萬子222(list)) {
            pungList.add(萬子111);
        }

        if (is萬子333(list)) {
            pungList.add(萬子111);
        }

        if (is萬子444(list)) {
            pungList.add(萬子111);
        }

        if (is萬子555(list)) {
            pungList.add(萬子111);
        }

        if (is萬子666(list)) {
            pungList.add(萬子111);
        }

        if (is萬子777(list)) {
            pungList.add(萬子111);
        }

        if (is萬子888(list)) {
            pungList.add(萬子111);
        }

        if (is萬子999(list)) {
            pungList.add(萬子111);
        }

        // 筒子の刻子判定
        if (is筒子111(list)) {
            pungList.add(Pung.筒子111);
        }
        if (is筒子222(list)) {
            pungList.add(Pung.筒子222);
        }
        if (is筒子333(list)) {
            pungList.add(Pung.筒子333);
        }
        if (is筒子444(list)) {
            pungList.add(Pung.筒子444);
        }
        if (is筒子555(list)) {
            pungList.add(Pung.筒子555);
        }
        if (is筒子666(list)) {
            pungList.add(Pung.筒子666);
        }
        if (is筒子777(list)) {
            pungList.add(Pung.筒子777);
        }
        if (is筒子888(list)) {
            pungList.add(Pung.筒子888);
        }
        if (is筒子999(list)) {
            pungList.add(Pung.筒子999);
        }

        // 索子の刻子判定
        if (is索子111(list)) {
            pungList.add(Pung.索子111);
        }
        if (is索子222(list)) {
            pungList.add(Pung.索子222);
        }
        if (is索子333(list)) {
            pungList.add(Pung.索子333);
        }
        if (is索子444(list)) {
            pungList.add(Pung.索子444);
        }
        if (is索子555(list)) {
            pungList.add(Pung.索子555);
        }
        if (is索子666(list)) {
            pungList.add(Pung.索子666);
        }
        if (is索子777(list)) {
            pungList.add(Pung.索子777);
        }
        if (is索子888(list)) {
            pungList.add(Pung.索子888);
        }
        if (is索子999(list)) {
            pungList.add(Pung.索子999);
        }


        return pungList;
    }

    private static boolean is萬子111(List<Tiles> list) {
        if (刻子共通ロジック(list, Characters.ONE_CHARACTERS)){
            return true;
        }
        return false;
    }

    private static boolean is萬子222(List<Tiles> list) {
        if (刻子共通ロジック(list, Characters.TWO_CHARACTERS)){
            return true;
        }
        return false;
    }
    private static boolean is萬子333(List<Tiles> list) {
        return 刻子共通ロジック(list, Characters.THREE_CHARACTERS);
    }

    private static boolean is萬子444(List<Tiles> list) {
        return 刻子共通ロジック(list, Characters.FOUR_CHARACTERS);
    }

    private static boolean is萬子555(List<Tiles> list) {
        return 刻子共通ロジック(list, Characters.FIVE_CHARACTERS);
    }

    private static boolean is萬子666(List<Tiles> list) {
        return 刻子共通ロジック(list, Characters.SIX_CHARACTERS);
    }

    private static boolean is萬子777(List<Tiles> list) {
        return 刻子共通ロジック(list, Characters.SEVEN_CHARACTERS);
    }

    private static boolean is萬子888(List<Tiles> list) {
        return 刻子共通ロジック(list, Characters.EIGHT_CHARACTERS);
    }

    private static boolean is萬子999(List<Tiles> list) {
        return 刻子共通ロジック(list, Characters.NINE_CHARACTERS);
    }

    private static boolean is筒子111(List<Tiles> list) {
        return 刻子共通ロジック(list, Circles.ONE_CIRCLES);
    }

    private static boolean is筒子222(List<Tiles> list) {
        return 刻子共通ロジック(list, Circles.TWO_CIRCLES);
    }

    private static boolean is筒子333(List<Tiles> list) {
        return 刻子共通ロジック(list, Circles.THREE_CIRCLES);
    }

    private static boolean is筒子444(List<Tiles> list) {
        return 刻子共通ロジック(list, Circles.FOUR_CIRCLES);
    }

    private static boolean is筒子555(List<Tiles> list) {
        return 刻子共通ロジック(list, Circles.FIVE_CIRCLES);
    }

    private static boolean is筒子666(List<Tiles> list) {
        return 刻子共通ロジック(list, Circles.SIX_CIRCLES);
    }

    private static boolean is筒子777(List<Tiles> list) {
        return 刻子共通ロジック(list, Circles.SEVEN_CIRCLES);
    }

    private static boolean is筒子888(List<Tiles> list) {
        return 刻子共通ロジック(list, Circles.EIGHT_CIRCLES);
    }

    private static boolean is筒子999(List<Tiles> list) {
        return 刻子共通ロジック(list, Circles.NINE_CIRCLES);
    }


    private static boolean is索子111(List<Tiles> list) {
        return 刻子共通ロジック(list, Bamboos.ONE_BAMBOOS);
    }

    private static boolean is索子222(List<Tiles> list) {
        return 刻子共通ロジック(list, Bamboos.TWO_BAMBOOS);
    }

    private static boolean is索子333(List<Tiles> list) {
        return 刻子共通ロジック(list, Bamboos.THREE_BAMBOOS);
    }

    private static boolean is索子444(List<Tiles> list) {
        return 刻子共通ロジック(list, Bamboos.FOUR_BAMBOOS);
    }

    private static boolean is索子555(List<Tiles> list) {
        return 刻子共通ロジック(list, Bamboos.FIVE_BAMBOOS);
    }

    private static boolean is索子666(List<Tiles> list) {
        return 刻子共通ロジック(list, Bamboos.SIX_BAMBOOS);
    }

    private static boolean is索子777(List<Tiles> list) {
        return 刻子共通ロジック(list, Bamboos.SEVEN_BAMBOOS);
    }

    private static boolean is索子888(List<Tiles> list) {
        return 刻子共通ロジック(list, Bamboos.EIGHT_BAMBOOS);
    }

    private static boolean is索子999(List<Tiles> list) {
        return 刻子共通ロジック(list, Bamboos.NINE_BAMBOOS);
    }

    private static boolean 刻子共通ロジック(List<Tiles> list, Tiles tiles) {
        int count = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(tiles)) {
                count ++;
            }
        }

        return count == 3;
    }





}

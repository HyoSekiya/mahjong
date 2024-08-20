package com.example.mahjong.domain.role.face;

import com.example.mahjong.domain.tile.Tiles;
import com.example.mahjong.domain.tile.suits.Bamboos;
import com.example.mahjong.domain.tile.suits.Characters;
import com.example.mahjong.domain.tile.suits.Circles;
import com.example.mahjong.domain.tile.valuetiles.Dragons;
import com.example.mahjong.domain.tile.valuetiles.Winds;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * 刻子（コーツ）
 */
@AllArgsConstructor
public enum Pung {

    萬子111(Characters.ONE_CHARACTERS, Characters.ONE_CHARACTERS, Characters.ONE_CHARACTERS),
    萬子222(Characters.TWO_CHARACTERS, Characters.TWO_CHARACTERS, Characters.TWO_CHARACTERS),
    萬子333(Characters.THREE_CHARACTERS, Characters.THREE_CHARACTERS, Characters.THREE_CHARACTERS),
    萬子444(Characters.FOUR_CHARACTERS, Characters.FOUR_CHARACTERS, Characters.FOUR_CHARACTERS),
    萬子555(Characters.FIVE_CHARACTERS, Characters.FIVE_CHARACTERS, Characters.FIVE_CHARACTERS),
    萬子666(Characters.SIX_CHARACTERS, Characters.SIX_CHARACTERS, Characters.SIX_CHARACTERS),
    萬子777(Characters.SEVEN_CHARACTERS, Characters.SEVEN_CHARACTERS, Characters.SEVEN_CHARACTERS),
    萬子888(Characters.EIGHT_CHARACTERS, Characters.EIGHT_CHARACTERS, Characters.EIGHT_CHARACTERS),
    萬子999(Characters.NINE_CHARACTERS, Characters.NINE_CHARACTERS, Characters.NINE_CHARACTERS),

    筒子111(Circles.ONE_CIRCLES, Circles.ONE_CIRCLES, Circles.ONE_CIRCLES),
    筒子222(Circles.TWO_CIRCLES, Circles.TWO_CIRCLES, Circles.TWO_CIRCLES),
    筒子333(Circles.THREE_CIRCLES, Circles.THREE_CIRCLES, Circles.THREE_CIRCLES),
    筒子444(Circles.FOUR_CIRCLES, Circles.FOUR_CIRCLES, Circles.FOUR_CIRCLES),
    筒子555(Circles.FIVE_CIRCLES, Circles.FIVE_CIRCLES, Circles.FIVE_CIRCLES),
    筒子666(Circles.SIX_CIRCLES, Circles.SIX_CIRCLES, Circles.SIX_CIRCLES),
    筒子777(Circles.SEVEN_CIRCLES, Circles.SEVEN_CIRCLES, Circles.SEVEN_CIRCLES),
    筒子888(Circles.EIGHT_CIRCLES, Circles.EIGHT_CIRCLES, Circles.EIGHT_CIRCLES),
    筒子999(Circles.NINE_CIRCLES, Circles.NINE_CIRCLES, Circles.NINE_CIRCLES),

    索子111(Bamboos.ONE_BAMBOOS, Bamboos.ONE_BAMBOOS, Bamboos.ONE_BAMBOOS),
    索子222(Bamboos.TWO_BAMBOOS, Bamboos.TWO_BAMBOOS, Bamboos.TWO_BAMBOOS),
    索子333(Bamboos.THREE_BAMBOOS, Bamboos.THREE_BAMBOOS, Bamboos.THREE_BAMBOOS),
    索子444(Bamboos.FOUR_BAMBOOS, Bamboos.FOUR_BAMBOOS, Bamboos.FOUR_BAMBOOS),
    索子555(Bamboos.FIVE_BAMBOOS, Bamboos.FIVE_BAMBOOS, Bamboos.FIVE_BAMBOOS),
    索子666(Bamboos.SIX_BAMBOOS, Bamboos.SIX_BAMBOOS, Bamboos.SIX_BAMBOOS),
    索子777(Bamboos.SEVEN_BAMBOOS, Bamboos.SEVEN_BAMBOOS, Bamboos.SEVEN_BAMBOOS),
    索子888(Bamboos.EIGHT_BAMBOOS, Bamboos.EIGHT_BAMBOOS, Bamboos.EIGHT_BAMBOOS),
    索子999(Bamboos.NINE_BAMBOOS, Bamboos.NINE_BAMBOOS, Bamboos.NINE_BAMBOOS),
    WHITE_DRAGON(Dragons.WHITE_DRAGON, Dragons.WHITE_DRAGON, Dragons.WHITE_DRAGON),
    GREEN_DRAGON(Dragons.GREEN_DRAGON, Dragons.GREEN_DRAGON, Dragons.GREEN_DRAGON),
    RED_DRAGON(Dragons.RED_DRAGON, Dragons.RED_DRAGON, Dragons.RED_DRAGON),
    EAST(Winds.EAST, Winds.EAST, Winds.EAST),
    SOUTH(Winds.SOUTH, Winds.SOUTH, Winds.SOUTH),
    WEST(Winds.SOUTH, Winds.SOUTH, Winds.SOUTH),
    NORTH(Winds.NORTH, Winds.NORTH, Winds.NORTH)
    ;

    public Tiles pung1;
    public Tiles pung2;
    public Tiles pung3;

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

        // 風牌の刻子判定
        if (isEastWind(list)) {
            pungList.add(Pung.EAST);
        }
        if (isSouthWind(list)) {
            pungList.add(Pung.SOUTH);
        }
        if (isWestWind(list)) {
            pungList.add(Pung.WEST);
        }
        if (isNorthWind(list)) {
            pungList.add(Pung.NORTH);
        }

        // 三元牌の刻子判定
        if (isWhiteDragon(list)) {
            pungList.add(Pung.WHITE_DRAGON);
        }
        if (isGreenDragon(list)) {
            pungList.add(Pung.GREEN_DRAGON);
        }
        if (isRedDragon(list)) {
            pungList.add(Pung.RED_DRAGON);
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

    private static boolean isWhiteDragon(List<Tiles> list) {
        return 刻子共通ロジック(list, Dragons.WHITE_DRAGON);
    }

    private static boolean isGreenDragon(List<Tiles> list) {
        return 刻子共通ロジック(list, Dragons.GREEN_DRAGON);
    }

    private static boolean isRedDragon(List<Tiles> list) {
        return 刻子共通ロジック(list, Dragons.RED_DRAGON);
    }

    private static boolean isEastWind(List<Tiles> list) {
        return 刻子共通ロジック(list, Winds.EAST);
    }

    private static boolean isSouthWind(List<Tiles> list) {
        return 刻子共通ロジック(list, Winds.SOUTH);
    }

    private static boolean isWestWind(List<Tiles> list) {
        return 刻子共通ロジック(list, Winds.WEST);
    }

    private static boolean isNorthWind(List<Tiles> list) {
        return 刻子共通ロジック(list, Winds.NORTH);
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

package com.example.mahjong.domain.role;

import com.example.mahjong.domain.tile.Tiles;
import com.example.mahjong.domain.tile.suits.Bamboos;
import com.example.mahjong.domain.tile.suits.Characters;
import com.example.mahjong.domain.tile.suits.Circles;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * 順子（シュンツ）
 */
public enum Chow {

    /*
    萬子（1, 2, 3）、筒子（1, 2, 3）、索子（1, 2, 3）
    萬子（2, 3, 4）、筒子（2, 3, 4）、索子（2, 3, 4）
    萬子（3, 4, 5）、筒子（3, 4, 5）、索子（3, 4, 5）
    萬子（4, 5, 6）、筒子（4, 5, 6）、索子（4, 5, 6）
    萬子（5, 6, 7）、筒子（5, 6, 7）、索子（5, 6, 7）
    萬子（6, 7, 8）、筒子（6, 7, 8）、索子（6, 7, 8）
    萬子（7, 8, 9）、筒子（7, 8, 9）、索子（7, 8, 9）
     */

    萬子123,
    萬子234,
    萬子345,
    萬子456,
    萬子567,
    萬子678,
    萬子789,

    索子123,
    索子234,
    索子345,
    索子456,
    索子567,
    索子678,
    索子789,

    筒子123,
    筒子234,
    筒子345,
    筒子456,
    筒子567,
    筒子678,
    筒子789;

    /**
     * 配牌の中にどの組み合わせの順子が含まれているか
     */
    public static List<Chow> whichChowsAreIncluded(List<Tiles> tiles) {
        List<Chow> list = new ArrayList<>();

        // 萬子の順子判定
        if (is123_萬子(tiles)) {
            list.add(Chow.萬子123);
        }
        if (is234_萬子(tiles)) {
            list.add(Chow.萬子234);
        }
        if (is345_萬子(tiles)) {
            list.add(Chow.萬子345);
        }
        if (is456_萬子(tiles)) {
            list.add(Chow.萬子456);
        }
        if (is567_萬子(tiles)) {
            list.add(Chow.萬子567);
        }
        if (is678_萬子(tiles)) {
            list.add(Chow.萬子678);
        }
        if (is789_萬子(tiles)) {
            list.add(Chow.萬子789);
        }

        // 筒子の順子判定
        if (is123_筒子(tiles)) {
            list.add(Chow.筒子123);
        }
        if (is234_筒子(tiles)) {
            list.add(Chow.筒子234);
        }
        if (is345_筒子(tiles)) {
            list.add(Chow.筒子345);
        }
        if (is456_筒子(tiles)) {
            list.add(Chow.筒子456);
        }
        if (is567_筒子(tiles)) {
            list.add(Chow.筒子567);
        }
        if (is678_筒子(tiles)) {
            list.add(Chow.筒子678);
        }
        if (is789_筒子(tiles)) {
            list.add(Chow.筒子789);
        }

        // 索子の順子判定
        if (is123_索子(tiles)) {
            list.add(Chow.索子123);
        }
        if (is234_索子(tiles)) {
            list.add(Chow.索子234);
        }
        if (is345_索子(tiles)) {
            list.add(Chow.索子345);
        }
        if (is456_索子(tiles)) {
            list.add(Chow.索子456);
        }
        if (is567_索子(tiles)) {
            list.add(Chow.索子567);
        }
        if (is678_索子(tiles)) {
            list.add(Chow.索子678);
        }
        if (is789_索子(tiles)) {
            list.add(Chow.索子789);
        }

        return list;
    }

    private static boolean is123_萬子(List<Tiles> tilesList) {
        return 順子共通判断メソッド(tilesList,Characters.ONE_CHARACTERS, Characters.TWO_CHARACTERS, Characters.THREE_CHARACTERS);
    }
    private static boolean is234_萬子(List<Tiles> tilesList) {
        return 順子共通判断メソッド(tilesList, Characters.TWO_CHARACTERS, Characters.THREE_CHARACTERS, Characters.FOUR_CHARACTERS);
    }
    private static boolean is345_萬子(List<Tiles> tilesList) {
        return 順子共通判断メソッド(tilesList, Characters.THREE_CHARACTERS, Characters.FOUR_CHARACTERS, Characters.FIVE_CHARACTERS);
    }
    private static boolean is456_萬子(List<Tiles> tilesList) {
        return 順子共通判断メソッド(tilesList, Characters.FOUR_CHARACTERS, Characters.FIVE_CHARACTERS, Characters.SIX_CHARACTERS);
    }
    private static boolean is567_萬子(List<Tiles> tilesList) {
        return 順子共通判断メソッド(tilesList, Characters.FIVE_CHARACTERS, Characters.SIX_CHARACTERS, Characters.SEVEN_CHARACTERS);
    }
    private static boolean is678_萬子(List<Tiles> tilesList) {
        return 順子共通判断メソッド(tilesList, Characters.SIX_CHARACTERS, Characters.SEVEN_CHARACTERS, Characters.EIGHT_CHARACTERS);
    }
    private static boolean is789_萬子(List<Tiles> tilesList) {
        return 順子共通判断メソッド(tilesList, Characters.SEVEN_CHARACTERS, Characters.EIGHT_CHARACTERS, Characters.NINE_CHARACTERS);
    }

    private static boolean is123_筒子(List<Tiles> tilesList) {
        return 順子共通判断メソッド(tilesList, Circles.ONE_CIRCLES, Circles.TWO_CIRCLES, Circles.THREE_CIRCLES);
    }

    private static boolean is234_筒子(List<Tiles> tilesList) {
        return 順子共通判断メソッド(tilesList, Circles.TWO_CIRCLES, Circles.THREE_CIRCLES, Circles.FOUR_CIRCLES);
    }

    private static boolean is345_筒子(List<Tiles> tilesList) {
        return 順子共通判断メソッド(tilesList, Circles.THREE_CIRCLES, Circles.FOUR_CIRCLES, Circles.FIVE_CIRCLES);
    }

    private static boolean is456_筒子(List<Tiles> tilesList) {
        return 順子共通判断メソッド(tilesList, Circles.FOUR_CIRCLES, Circles.FIVE_CIRCLES, Circles.SIX_CIRCLES);
    }

    private static boolean is567_筒子(List<Tiles> tilesList) {
        return 順子共通判断メソッド(tilesList, Circles.FIVE_CIRCLES, Circles.SIX_CIRCLES, Circles.SEVEN_CIRCLES);
    }

    private static boolean is678_筒子(List<Tiles> tilesList) {
        return 順子共通判断メソッド(tilesList, Circles.SIX_CIRCLES, Circles.SEVEN_CIRCLES, Circles.EIGHT_CIRCLES);
    }

    private static boolean is789_筒子(List<Tiles> tilesList) {
        return 順子共通判断メソッド(tilesList, Circles.SEVEN_CIRCLES, Circles.EIGHT_CIRCLES, Circles.NINE_CIRCLES);
    }
    private static boolean is123_索子(List<Tiles> tilesList) {
        return 順子共通判断メソッド(tilesList, Bamboos.ONE_BAMBOOS, Bamboos.TWO_BAMBOOS, Bamboos.THREE_BAMBOOS);
    }

    private static boolean is234_索子(List<Tiles> tilesList) {
        return 順子共通判断メソッド(tilesList, Bamboos.TWO_BAMBOOS, Bamboos.THREE_BAMBOOS, Bamboos.FOUR_BAMBOOS);
    }

    private static boolean is345_索子(List<Tiles> tilesList) {
        return 順子共通判断メソッド(tilesList, Bamboos.THREE_BAMBOOS, Bamboos.FOUR_BAMBOOS, Bamboos.FIVE_BAMBOOS);
    }

    private static boolean is456_索子(List<Tiles> tilesList) {
        return 順子共通判断メソッド(tilesList, Bamboos.FOUR_BAMBOOS, Bamboos.FIVE_BAMBOOS, Bamboos.SIX_BAMBOOS);
    }

    private static boolean is567_索子(List<Tiles> tilesList) {
        return 順子共通判断メソッド(tilesList, Bamboos.FIVE_BAMBOOS, Bamboos.SIX_BAMBOOS, Bamboos.SEVEN_BAMBOOS);
    }

    private static boolean is678_索子(List<Tiles> tilesList) {
        return 順子共通判断メソッド(tilesList, Bamboos.SIX_BAMBOOS, Bamboos.SEVEN_BAMBOOS, Bamboos.EIGHT_BAMBOOS);
    }

    private static boolean is789_索子(List<Tiles> tilesList) {
        return 順子共通判断メソッド(tilesList, Bamboos.SEVEN_BAMBOOS, Bamboos.EIGHT_BAMBOOS, Bamboos.NINE_BAMBOOS);
    }



    private static boolean 順子共通判断メソッド(List<Tiles> tilesList, Tiles tiles1, Tiles tiles2, Tiles tiles3){
        boolean result1 = false;
        boolean result2 = false;
        boolean result3 = false;

        if (tilesList.contains(tiles1)) {
            result1 = true;
        }
        if (tilesList.contains(tiles2)) {
            result2 = true;
        }
        if (tilesList.contains(tiles3)) {
            result3 = true;
        }

        return result1 && result2 && result3;
    }




}

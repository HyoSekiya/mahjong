package com.example.mahjong.domain.role.set;

import com.example.mahjong.domain.tile.Tiles;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * 面子判定くん
 */
@Component
public class Win {

    public boolean is33332(List<Tiles> tilesList) {

        List<Tiles> tiles = new ArrayList<Tiles>(tilesList);



        // 配牌の中にどの組み合わせの順子が含まれているか
        List<Chow> chowList = Chow.whichChowsAreIncluded(tiles);

        // 配牌の中にどの組み合わせの刻子が含まれているか
        List<Pung> pungList = Pung.whichPungsAreIncluded(tiles);

        // 配牌の中にどの組み合わせの対子が含まれているか
        List<Pair> pairsList = Pair.whichPairAreIncluded(tiles);

        // 刻子も順子もない場合、false
        if (chowList.isEmpty() && pungList.isEmpty()){
            return false;
        }

        // 順子を消す
        for (Chow chow: chowList) {
            System.out.println("Removing chow: " + chow);
            tiles.remove(chow.chow1);
            tiles.remove(chow.chow2);
            tiles.remove(chow.chow3);
            System.out.println("Removing tilesList: " + tilesList);
        }

        // 刻子を消す
        for (Pung pung: pungList) {
            tiles.remove(pung.pung1);
            tiles.remove(pung.pung2);
            tiles.remove(pung.pung3);
        }

//        // 和了牌から、順子と刻子を抜いた上で、頭(対子)があれば、true
//        return whichPairAreIncluded(tilesList).size() == 2;

        System.out.println("chowList" + chowList);
        System.out.println("pungList" + pungList);
        System.out.println("tilesList" + tiles);

        return tiles.size() == 2;
    }

//    public boolean isNot33332(List<Tiles> tilesList) {
//        return !(is33332(tilesList));
//    }

//    public static List<Chow> whichChowsAreIncluded(List<Tiles> tilesList) {
//        return Chow.whichChowsAreIncluded(tilesList);
//    }
//
//    public static List<Pung> whichPungsAreIncluded(List<Tiles> tilesList) {
//        return Pung.whichPungsAreIncluded(tilesList);
//    }
//
//    public static List<Pair> whichPairAreIncluded(List<Tiles> tilesList) {
//        return Pair.whichPairAreIncluded(tilesList);
//    }
}

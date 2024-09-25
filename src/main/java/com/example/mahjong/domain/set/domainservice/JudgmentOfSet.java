package com.example.mahjong.domain.set.domainservice;

import com.example.mahjong.domain.set.*;
import com.example.mahjong.domain.tile.tiles.Tiles;
import com.example.mahjong.domain.tile.tiles.suits.Characters;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * 面子判定くん
 */
@Component
@RequestScope
public class JudgmentOfSet {

    public boolean is33332(List<Tiles> tilesList) {

        List<Tiles> tiles = new ArrayList<Tiles>(tilesList);

        // 配牌の中にどの組み合わせの順子が含まれているか
        List<Chow> chowList = whichChowsAreIncluded(tilesList);

        // 配牌の中にどの組み合わせの刻子が含まれているか
        List<Pung> pungList = whichPungsAreIncluded(tilesList);

        // 配牌の中にどの組み合わせの対子が含まれているか
        Optional<Pair> pair = whichPairAreIncluded(tilesList);

        // 刻子も順子もない場合、false
        if (chowList.isEmpty() && pungList.isEmpty()) {
            return false;
        }

        // 順子を消す
        for (Chow chow : chowList) {
            System.out.println("Removing chow: " + chow);
            tiles.remove(chow.chow1);
            tiles.remove(chow.chow2);
            tiles.remove(chow.chow3);
            System.out.println("Removing tilesList: " + tilesList);
        }

        // 刻子を消す
        for (Pung pung : pungList) {
            tiles.remove(pung.pung1);
            tiles.remove(pung.pung2);
            tiles.remove(pung.pung3);
        }

//        // 和了牌から、順子と刻子を抜いた上で、頭(対子)があれば、true
//        return whichPairAreIncluded(tilesList).size() == 2;

        System.out.println("chowList:" + chowList);
        System.out.println("pungList:" + pungList);
        System.out.println("tilesList:" + tiles);
        System.out.println("pairsList:" + pair);

        if (tiles.size() == 2) {
            tiles.clear();
            return true;
        }

        tiles.clear();
        return false;
    }

    public List<Chow> whichChowsAreIncluded(List<Tiles> tilesList) {
        return Chow.whichChowsAreIncluded(tilesList);
    }

    public List<Pung> whichPungsAreIncluded(List<Tiles> tilesList) {
        return Pung.whichPungsAreIncluded(tilesList);
    }

    public Optional<Pair> whichPairAreIncluded(List<Tiles> tilesList) {
        return Pair.whichPairAreIncluded(tilesList);
    }
}


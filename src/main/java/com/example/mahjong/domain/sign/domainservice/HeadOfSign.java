package com.example.mahjong.domain.sign.domainservice;

import com.example.mahjong.domain.set.Chow;
import com.example.mahjong.domain.set.Pair;
import com.example.mahjong.domain.set.Pung;
import com.example.mahjong.domain.set.domainservice.JudgmentOfSet;
import com.example.mahjong.domain.sign.signs.Head;
import com.example.mahjong.domain.sign.signs.Sign;
import com.example.mahjong.domain.tile.tiles.Tiles;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * 符計算における雀頭の判定
 */
@AllArgsConstructor
@Component
public class HeadOfSign {

    private final JudgmentOfSet judgmentOfSet;

    public Sign judgement (List<Tiles> tileList) {

        Optional<Pair> pairOptional = 雀頭を返す(tileList);

        if (is役牌(pairOptional)) {
            return Head.役牌;
        }

        return Head.その他;

    }

    public Optional<Pair> 雀頭を返す(List<Tiles> tilesList) {
        List<Tiles>  tiles = new ArrayList<Tiles>(tilesList);

        // 配牌の中にどの組み合わせの順子が含まれているか
        List<Chow> chowList = judgmentOfSet.whichChowsAreIncluded(tilesList);

        // 配牌の中にどの組み合わせの刻子が含まれているか
        List<Pung> pungList = judgmentOfSet.whichPungsAreIncluded(tilesList);

        // 刻子も順子もない場合、空を返す
        if (chowList.isEmpty() && pungList.isEmpty()){
            return Optional.empty();
        }

        // 順子を消す
        for (Chow chow: chowList) {
            tiles.remove(chow.chow1);
            tiles.remove(chow.chow2);
            tiles.remove(chow.chow3);
        }

        // 刻子を消す
        for (Pung pung: pungList) {
            tiles.remove(pung.pung1);
            tiles.remove(pung.pung2);
            tiles.remove(pung.pung3);
        }

        // 雀頭があれば返す
        return judgmentOfSet.whichPairAreIncluded(tiles);
    }

    private boolean is役牌(Optional<Pair> pair) {
        return pair.map(Pair::is役牌).orElse(false);

    }

}

package com.example.mahjong.domain.sign.domainservice;

import com.example.mahjong.domain.set.Chow;
import com.example.mahjong.domain.set.Pung;
import com.example.mahjong.domain.set.domainservice.JudgmentOfSet;
import com.example.mahjong.domain.sign.signs.Sign;
import com.example.mahjong.domain.tile.tiles.Tiles;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import com.example.mahjong.domain.sign.signs.Set;


/**
 * 符計算における面子の判定
 */
@Component
@AllArgsConstructor
public class SignOfSet {

    private final JudgmentOfSet judgmentOfSet;

    public List<Sign> judgement(List<Tiles> tilesList) {
        List<Sign> signList = new ArrayList<>();

        // 配牌の中にどの組み合わせの順子が含まれているか
        List<Chow> chowList = judgmentOfSet.whichChowsAreIncluded(tilesList);

        // 配牌の中にどの組み合わせの刻子が含まれているか
        List<Pung> pungList = judgmentOfSet.whichPungsAreIncluded(tilesList);

        // 順子を返す
        if (!(chowList.isEmpty())) {
            for (Chow chow: chowList) {
                signList.add(Set.順子);
            }
        }

        //　TODO: "鳴き"という概念をシステムに取り込み、明刻と暗刻（明槓と暗槓）を識別する。暫定では、"刻子かつ19字牌"の場合、"暗刻_19字牌"を返す
        //　TODO: "槓子"という概念をシステムに取り込み、槓子があった際、符計算をする
        if (!(pungList.isEmpty())) {
            for (Pung pung : pungList) {
                if (is暗刻_19字牌(pung)) {
                    signList.add(Set.暗刻_19字牌);
                }
                if (is暗刻_19字牌ではない(pung)) {
                    signList.add(Set.暗刻_19字牌ではない);
                }
            }
        }

        if (signList.isEmpty()) {
            signList.add(Set.該当なし);
        }

        return signList;
    }

    private boolean is暗刻_19字牌(Pung pung) {
        return pung.is19字牌();
    }

    private boolean is暗刻_19字牌ではない(Pung pung) {
        return !(pung.is19字牌());
    }
}

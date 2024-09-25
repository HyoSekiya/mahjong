package com.example.mahjong.domain.sign.domainservice;

import com.example.mahjong.domain.set.*;
import com.example.mahjong.domain.set.domainservice.JudgmentOfSet;
import com.example.mahjong.domain.sign.signs.Sign;
import com.example.mahjong.domain.sign.signs.Wait;
import com.example.mahjong.domain.tile.tiles.Tiles;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * 待ちの形判定
 */
@AllArgsConstructor
@Component
public class WaitOfSign {

    private final JudgmentOfSet judgmentOfSet;

    public Sign judgement (List<Tiles> tilesList) {

        // 配牌のリストをコピーして新しいリストを作成
        List<Tiles> tilesWithoutWaitingTile = new ArrayList<>(tilesList);

        // 待ち牌（14個目の牌）を取得
        // TODO: 待ち牌（14個目の牌）を定義して、引数で受け取った際、is待ち牌()などで、区別できるようにする。
        Tiles waitingTile = tilesWithoutWaitingTile.get(13);

        if (isペンチャン(tilesWithoutWaitingTile, waitingTile)) {
            return Wait.ペンチャン;
        }

//        if (isカンチャン(set)) {
//            return Wait.カンチャン;
//        }
//
//        if (isタンキ(set)) {
//            return Wait.カンチャン;
//        }
//
//        if (isノべタン(set)) {
//            return Wait.ノべタン;
//        }

        return Wait.該当なし;
    }

    private boolean isカンチャン(Set set) {
        return true;
    }

    private boolean isタンキ(Set set) {
        return true;
    }

    private boolean isノべタン(Set set) {
        return true;
    }

    /**
     * 待ち牌がどの面子かを判定
     */
    private Set whichChowsIncludeWaitingTile(List<Tiles> tiles) {

        // 配牌のリストをコピーして新しいリストを作成
        List<Tiles> tilesWithoutWaitingTile = new ArrayList<>(tiles);

        // 待ち牌（14個目の牌）を取得
        // TODO: 待ち牌（14個目の牌）を定義して、引数で受け取った際、is待ち牌()などで、区別できるようにする。
        Tiles waitingTile = tilesWithoutWaitingTile.get(13);

        // 順子を取得
        List<Chow> candidateChows = judgmentOfSet.whichChowsAreIncluded(tilesWithoutWaitingTile);

        // 刻子を取得
        List<Pung> candidatePung = judgmentOfSet.whichPungsAreIncluded(tilesWithoutWaitingTile);

        // 対子を取得
        Optional<Pair> candidatePair = judgmentOfSet.whichPairAreIncluded(tilesWithoutWaitingTile);

        // 各候補順子が待ち牌を含むか確認
        for (Chow chow : candidateChows) {
            if (isWaitingTileForChow(chow, waitingTile)) {
                return chow;
            }
        }

        // 各候補刻子が待ち牌を含むか確認
        for (Pung pung : candidatePung) {
            if (isWaitingTileForPung(pung, waitingTile)) {
                return pung;
            }
        }

        // 各候補対子が待ち牌を含むか確認
        if (candidatePair.isPresent()) {
            if (isWaitingTileForPair(candidatePair.get(), waitingTile)) {
                return candidatePair.get();
            }
        }

        return NotSet.知らない面子;

    }

    /**
     * 指定された順子に待ち牌が含まれているかを判定する
     *
     * @param chow        順子
     * @param waitingTile 待ち牌
     * @return true: 順子に待ち牌が含まれている, false: 含まれていない
     */
    private boolean isWaitingTileForChow(Chow chow, Tiles waitingTile) {
        return chow.chow1.equals(waitingTile) || chow.chow2.equals(waitingTile) || chow.chow3.equals(waitingTile);
    }

    /**
     * 指定された刻子に待ち牌が含まれているかを判定する
     *
     * @param pung        刻子
     * @param waitingTile 待ち牌
     * @return true: 刻子に待ち牌が含まれている, false: 含まれていない
     */
    private boolean isWaitingTileForPung(Pung pung, Tiles waitingTile) {
        return pung.pung1.equals(waitingTile) || pung.pung2.equals(waitingTile) || pung.pung3.equals(waitingTile);
    }

    /**
     * 指定された刻子に待ち牌が含まれているかを判定する
     *
     * @param pair        対子
     * @param waitingTile 待ち牌
     * @return true: 対子に待ち牌が含まれている, false: 含まれていない
     */
    private boolean isWaitingTileForPair(Pair pair, Tiles waitingTile) {
        return pair.pair1.equals(waitingTile) || pair.pair2.equals(waitingTile);
    }

    /**
     * ペンチャン判定メソッド
     */
    private boolean isペンチャン(List<Tiles> tilesList, Tiles waitingTile) {

        // TODO: 汚いから直す....街のパターンを定義貸して、他でも流用できるようにする。もしくは、仮のリストを用意してあげて、判定する。

        Set set = whichChowsIncludeWaitingTile(tilesList);

        if (!(set.isChow())) {
            return false;
        }

        // 順子にcast
        Chow chow = (Chow) set;

        // 1,2待ちの3
        if (chow.equals(Chow.萬子123) || chow.equals(Chow.索子123) || chow.equals(Chow.筒子123)) {
            if (chow.chow3.equals(waitingTile)) {
                return true;
            }
        }

        // 7,8待ちの9
        if (chow.equals(Chow.萬子789) || chow.equals(Chow.索子789) || chow.equals(Chow.筒子789)) {
            if (chow.chow3.equals(waitingTile)) {
                return true;
            }
        }

        return false;
    }
}

package com.example.mahjong.domain.role.set;

import com.example.mahjong.domain.tile.Tiles;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Win {

    private final int WIN_TILES_LIST = 14;

    public boolean is33332(List<Tiles> tilesList, List<Chow> chowList, List<Pung> pungList) {

        if (!(tilesList.size() == WIN_TILES_LIST)) {
            return false;
        }

        // 刻子も順子もない場合、false
        if (chowList.isEmpty() && pungList.isEmpty()){
            return false;
        }

        // 順子を消す
        for (Chow chow: chowList) {
            tilesList.remove(chow.chow1);
            tilesList.remove(chow.chow2);
            tilesList.remove(chow.chow3);
        }

        // 刻子を消す
        for (Pung pung: pungList) {
            tilesList.remove(pung.pung1);
            tilesList.remove(pung.pung2);
            tilesList.remove(pung.pung3);
        }

        // TODO: 頭のサイズはターツクラスを作成して、定義する。
        // 和了牌から、順子と刻子を抜いた上で、頭があれば、true
        return tilesList.size() == 2;
    }

    public boolean isNot33332(List<Tiles> tilesList, List<Chow> chowList, List<Pung> pungList) {
        return !(is33332(tilesList, chowList, pungList));
    }
}

package com.example.mahjong.domain.role.unit;

import com.example.mahjong.domain.common.ReachFlag;
import com.example.mahjong.domain.sign.signs.Win;
import com.example.mahjong.domain.tile.tiles.Tiles;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OneRole {

    private final int 和了牌の数 = 14;

    public boolean is白(List<Tiles> list){
        return list.stream().filter(Tiles::is白).count() == 3;
    }

    public boolean is發(List<Tiles> list){
        return list.stream().filter(Tiles::is發).count() == 3;
    }

    public boolean is中(List<Tiles> list){
        return list.stream().filter(Tiles::is中).count() == 3;
    }

    public boolean isタンヤオ(List<Tiles> list){

        return list.stream().
                filter(Tiles::isNot19字牌)
                .count() == 和了牌の数;
    }

    public boolean isリーチ(ReachFlag reachFlag) {
        return reachFlag.isリーチ();
    }

    public boolean isメンゼンツモ(Win win) {
        return win.isメンゼンツモ();
    }
}

package com.example.mahjong.domain.role.unit;

import com.example.mahjong.domain.tile.Tiles;
import com.example.mahjong.domain.tile.suits.Bamboos;
import com.example.mahjong.domain.tile.suits.Characters;
import com.example.mahjong.domain.tile.suits.Circles;
import com.example.mahjong.domain.tile.valuetiles.Dragons;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

        if (!this.is33332(list)){
            return false;
        }

        return list.stream().
                filter(Tiles::isNot19字牌)
                .count() == 和了牌の数;
    }

    public boolean is33332(List<Tiles> list){
        return true;
    }
}

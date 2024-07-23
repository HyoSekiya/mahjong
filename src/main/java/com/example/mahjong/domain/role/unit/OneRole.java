package com.example.mahjong.domain.role.unit;

import com.example.mahjong.domain.tile.Tiles;
import com.example.mahjong.domain.tile.suits.Bamboos;
import com.example.mahjong.domain.tile.suits.Characters;
import com.example.mahjong.domain.tile.suits.Circles;
import com.example.mahjong.domain.tile.valuetiles.Dragons;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class OneRole {

    public boolean is白(List<Tiles> list){
        return list.stream().filter(Tiles::is白).count() == 3;
    }

    public boolean is發(List<Tiles> list){
        return list.stream().filter(Tiles::is發).count() == 3;
    }

    public boolean is中(List<Tiles> list){
        return list.stream().filter(Tiles::is中).count() == 3;
    }

//    public boolean isタンヤオ(List<String> list){
//
//        if (!this.is33332(list)){
//            return false;
//        }
//
//        List<String> resultList = new ArrayList<>();
//
//        List<String> bamboosList = list.stream().filter(Bamboos::is19字牌).toList();
//        List<String> charactersList = list.stream().filter(Characters::is19字牌).toList();
//        List<String> circlesList = list.stream().filter(Circles::is19字牌).toList();
//
//        resultList.addAll(bamboosList);
//        resultList.addAll(charactersList);
//        resultList.addAll(circlesList);
//
//        return resultList.isEmpty();
//    }
//
//    public boolean is33332(List<String> list){
//        return true;
//    }
}

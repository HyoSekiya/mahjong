package com.example.mahjong.domain.role.unit;

import com.example.mahjong.domain.tile.tiles.Tiles;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class Yakuman {

    public boolean is大三元(List<Tiles> list){
        return list.stream().filter(Tiles::is中).count() == 3 &&
                list.stream().filter(Tiles::is發).count() == 3 &&
                list.stream().filter(Tiles::is白).count() == 3
                ;
    }


}

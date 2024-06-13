package com.example.mahjong.domain.role.unit;

import com.example.mahjong.domain.tile.suits.Bamboos;
import com.example.mahjong.domain.tile.valuetiles.Dragons;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class Yakuman {
    private Bamboos bamboos;


    public boolean is大三元(List<String> list){
        return list.stream().filter(Dragons::is中).count() == 3 &&
                list.stream().filter(Dragons::is發).count() == 3 &&
                list.stream().filter(Dragons::is白).count() == 3
                ;
    }


}

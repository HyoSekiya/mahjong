package com.example.mahjong.domain.role.unit;

import com.example.mahjong.domain.tile.Tiles;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TwoRole {
    public boolean is三色同順(List<Tiles> list){
        return list.stream()
                .filter(Tiles::is順子)
                .count() == 4;
    }
}

package com.example.mahjong.domain.role.Dragons;

import com.example.mahjong.domain.tile.valuetiles.Dragons;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class DragonsRole {

    public boolean is白(List<String> list){
        return list.stream().filter(Dragons::is白).count() == 3;
    }

    public boolean is發(List<String> list){
        return list.stream().filter(Dragons::is發).count() == 3;
    }

    public boolean is中(List<String> list){
        return list.stream().filter(Dragons::is中).count() == 3;
    }
}

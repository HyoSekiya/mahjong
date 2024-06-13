package com.example.mahjong.api.request;


import com.example.mahjong.domain.tile.valuetiles.Winds;
import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@ToString(includeFieldNames = false)
public class MahjongRequest {

    private String one;
    private String two;
    private String three;
    private String four;
    private String five;
    private String six;
    private String seven;
    private String eight;
    private String nine;
    private String ten;
    private String eleven;
    private String twelve;
    private String thirteen;
    private String fourteen;

    public List<String> create(){
        List<String> list = new ArrayList<>();

        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
        list.add(five);
        list.add(six);
        list.add(seven);
        list.add(eight);
        list.add(nine);
        list.add(ten);
        list.add(eleven);
        list.add(twelve);
        list.add(thirteen);
        list.add(fourteen);

        return list;
    }
}

package com.example.mahjong.api.request;


import com.example.mahjong.domain.common.ParentOrChild;
import com.example.mahjong.domain.common.ReachFlag;
import com.example.mahjong.domain.sign.signs.Win;
import com.example.mahjong.domain.tile.tiles.NotTiles;
import com.example.mahjong.domain.tile.tiles.Tiles;
import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@ToString(includeFieldNames = false)
public class PlayerRequest {

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
    // 和了方
    private String howToWin;
    // 親or子
    private String parentOrChild;
    // リーチの有無
    private String reachFlag;

    public List<Tiles> 利用者の牌を牌に変換() {

        List <String> playerRequest = create();

        List<Tiles> tilesList = new ArrayList<>();

        /**
         * 牌に変換
         */
        for (String playerTile: playerRequest) {
            tilesList.add(this.牌に変換(playerTile));
        }

        if (tilesList.contains(NotTiles.NOT_EXISTS)) {
            throw new RuntimeException("不正の値が入ってる〜");
        }

        return tilesList;
    }

    /**
     * リクエストフォーム
     */
    private List<String> create(){
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


    public Tiles 牌に変換(String value) {
        return Tiles.whichTiles(value);
    }

    public Win 和了方を定義 () {
        return Win.whichWin(howToWin);
    }

    public ParentOrChild 親子を定義() {
        return ParentOrChild.which(parentOrChild);
    }

    public ReachFlag リーチの有無() {
        return ReachFlag.which(reachFlag);
    }
}

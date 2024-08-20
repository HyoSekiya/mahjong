package com.example.mahjong.service;

import com.example.mahjong.api.response.Response;
import com.example.mahjong.domain.role.JudgmentOfRole;
import com.example.mahjong.domain.role.WinningRole;
import com.example.mahjong.domain.tile.Arrange;
import com.example.mahjong.domain.tile.Tiles;
import lombok.AllArgsConstructor;

import java.util.List;

@org.springframework.stereotype.Service
@AllArgsConstructor
public class Service {

    /**
     * 並べるくん
     */
    private final Arrange arrange;

    /**
     * 役の判定くん
     */
    private final JudgmentOfRole judgmentOfRole;

    public List<WinningRole> 和了役と飜数を返す(List<Tiles> tilesList){

        // 利用者の配牌を並べる
        List<Tiles> arrangeList = arrange.並べる(tilesList);
         // 並べたRequestの役を判定して返す
        List<WinningRole> list = judgmentOfRole.和了役と和飜数を判定(arrangeList);

        if (list.isEmpty()){
            throw new RuntimeException("役無し！！！チョンボ！！！");
        }

        return list;

    }

    public List<Tiles> 並べる(List<Tiles> tilesList){

        // 利用者の配牌を並べる
        List<Tiles> arrangeList = arrange.並べる(tilesList);

        return arrangeList;

    }
}

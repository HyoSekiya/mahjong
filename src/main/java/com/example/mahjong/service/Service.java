package com.example.mahjong.service;

import com.example.mahjong.domain.calculation.WinEntity;
import com.example.mahjong.domain.calculation.WinScore;
import com.example.mahjong.domain.calculation.domaiservice.Calculation;
import com.example.mahjong.domain.role.domainservice.JudgmentOfRole;
import com.example.mahjong.domain.role.WinningRole;
import com.example.mahjong.domain.sign.SumSign;
import com.example.mahjong.domain.sign.domainservice.JudgmentOfSign;
import com.example.mahjong.domain.sign.signs.Win;
import com.example.mahjong.domain.tile.domainservice.Arrange;
import com.example.mahjong.domain.tile.tiles.Tiles;
import lombok.AllArgsConstructor;
import org.springframework.web.context.annotation.RequestScope;

import java.util.List;

@org.springframework.stereotype.Service
@AllArgsConstructor
@RequestScope
public class Service {

    /**
     * 並べるくん
     */
    private final Arrange arrange;

    /**
     * 役の判定くん
     */
    private final JudgmentOfRole judgmentOfRole;

    /**
     * 和了点数計算くん
     */
    private final Calculation calculation;

    /**
     * 合計符計算くん
     */
    private final JudgmentOfSign judgmentOfSign;

    public List<WinningRole> 和了役と飜数を返す(List<Tiles> tilesList){

         // 並べたRequestの役を判定して返す
        List<WinningRole> list = judgmentOfRole.和了役と和飜数を判定(tilesList);

        // 利用者の配牌を並べる
        List<Tiles> arrangeList = arrange.並べる(tilesList);

        if (list.isEmpty()){
            throw new RuntimeException("役無し！！！チョンボ！！！");
        }

        return list;

    }

    public WinEntity 点数計算(List<Tiles> tilesList, Win win){

        // 和了点数
        final WinScore winScore = calculation.calc(tilesList, win);

        // 和了役と和了飜数
        final List<WinningRole> roles = judgmentOfRole.和了役と和飜数を判定(tilesList);

        // 合計符
        final SumSign sumSign = judgmentOfSign.sumSign(tilesList, win);

        // 利用者の配牌を並べる
        List<Tiles> arrangeList = arrange.並べる(tilesList);

        return new WinEntity(arrangeList, roles, winScore, sumSign).create();

    }
}

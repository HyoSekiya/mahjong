package com.example.mahjong.service;

import com.example.mahjong.domain.calculation.WinEntity;
import com.example.mahjong.domain.calculation.domaiservice.Calculation;
import com.example.mahjong.domain.calculation.score.Score;
import com.example.mahjong.domain.common.ParentOrChild;
import com.example.mahjong.domain.common.ReachFlag;
import com.example.mahjong.domain.role.Role;
import com.example.mahjong.domain.role.domainservice.JudgmentOfRole;
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

    public WinEntity 点数計算(List<Tiles> tilesList, Win win, ParentOrChild parentOrChild, ReachFlag reachFlag){

        // 和了点数
        final Score winScore = calculation.calc(tilesList, win, parentOrChild, reachFlag);

        // 和了役と和了飜数
        final List<Role> roles = judgmentOfRole.和了役を返す(tilesList, reachFlag, win);

        // 合計符
        final SumSign sumSign = judgmentOfSign.合計符を返す(tilesList, win);

        // 利用者の配牌を並べる
        final List<Tiles> arrangeList = arrange.並べる(tilesList);

        return new WinEntity(arrangeList, roles, winScore, sumSign, win);

    }
}

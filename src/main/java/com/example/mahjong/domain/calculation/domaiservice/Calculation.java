package com.example.mahjong.domain.calculation.domaiservice;

import com.example.mahjong.domain.calculation.WinEntity;
import com.example.mahjong.domain.calculation.WinScore;
import com.example.mahjong.domain.role.Role;
import com.example.mahjong.domain.role.WinningRole;
import com.example.mahjong.domain.role.domainservice.JudgmentOfRole;
import com.example.mahjong.domain.sign.SumSign;
import com.example.mahjong.domain.sign.domainservice.JudgmentOfSign;
import com.example.mahjong.domain.sign.signs.Win;
import com.example.mahjong.domain.tile.tiles.Tiles;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 和了点数計算くん
 */
@AllArgsConstructor
@Component
public class Calculation {

    private final JudgmentOfRole judgmentOfRole;
    private final JudgmentOfSign judgmentOfSign;

    public WinScore calc(List<Tiles> tilesList, Win win) {
        // TODO:

        final List<WinningRole> roles = judgmentOfRole.和了役と和飜数を判定(tilesList);

        final SumSign sumSign = judgmentOfSign.sumSign(tilesList, win);

        return new WinScore(100);
    }
}

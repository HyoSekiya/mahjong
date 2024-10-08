package com.example.mahjong.domain.sign.domainservice;

import com.example.mahjong.domain.sign.SumSign;
import com.example.mahjong.domain.sign.signs.Sign;
import com.example.mahjong.domain.sign.signs.Win;
import com.example.mahjong.domain.tile.tiles.Tiles;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 合計符計算くん
 */
@Component
@AllArgsConstructor
public class JudgmentOfSign {

    private final SignOfBasic signOfBasic;

    private final SignOfWin signOfWin;

    private final SignOfSet signOfSet;

    private final HeadOfSign headOfSign;

    private final WaitOfSign waitOfSign;

    public SumSign 合計符を返す(List<Tiles> tilesList, Win win) {

        // 基本符
        Sign 基本符 = signOfBasic.judgement();

        // 和了方
        Sign 和了方 = signOfWin.judgement(win);

        // 面子
        List<Sign> 面子 = signOfSet.judgement(tilesList);

        // 面子の符を計算する
        int 面子得点合計 = 0;
        for (Sign 面子サイン : 面子) {
            面子得点合計 += 面子サイン.getScore();
        }

        // 雀頭
        Sign 雀頭 = headOfSign.judgement(tilesList);

        // 待の形
        // TODO:待ちの形ができてない
        Sign 待ちの形 = waitOfSign.judgement(tilesList);

        int sum = (基本符.getScore() + 和了方.getScore() + 面子得点合計 + 雀頭.getScore() + 待ちの形.getScore());

        // 符計算では、１の位を切り上げるらしい
        sum = (int) Math.ceil(sum / 10.0) * 10;

        return new SumSign(sum);

    }
}

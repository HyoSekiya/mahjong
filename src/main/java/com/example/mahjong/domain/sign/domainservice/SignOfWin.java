package com.example.mahjong.domain.sign.domainservice;

import com.example.mahjong.domain.sign.signs.Sign;
import com.example.mahjong.domain.sign.signs.Win;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * 和了の判定くん
 */
@Component
@AllArgsConstructor
public class SignOfWin {

    public Sign judgement (Win win) {

        if (win.isメンゼンロン()) {
            return Win.メンゼンロン;
        }

        if (win.is鳴き有りロン()) {
            return Win.鳴き有りロン;
        }

        if (win.isメンゼンツモ()) {
            return Win.メンゼンツモ;
        }

        if (win.is鳴き有りツモ()) {
            return Win.鳴き有りツモ;
        }

        throw new RuntimeException("和了方を設定しろ！！！！！");
    }

}

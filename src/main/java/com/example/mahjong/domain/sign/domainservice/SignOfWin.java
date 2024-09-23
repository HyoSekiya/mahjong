package com.example.mahjong.domain.sign.domainservice;

import com.example.mahjong.domain.sign.signs.Sign;
import com.example.mahjong.domain.sign.signs.Win;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class SignOfWin {

    public Sign judgement (Win win) {

        if (win.isRon()) {
            return Win.メンゼンロン;
        }

        if (win.isTsumo()) {
            return Win.ツモ;
        }

        return Win.その他;

    }

}

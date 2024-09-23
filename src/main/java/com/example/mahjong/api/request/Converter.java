package com.example.mahjong.api.request;

import com.example.mahjong.domain.sign.signs.Win;
import org.springframework.stereotype.Component;

@Component
public class Converter {

    public Win winCreate (String howToWin) {
        return Win.whichWin(howToWin);
    }
}

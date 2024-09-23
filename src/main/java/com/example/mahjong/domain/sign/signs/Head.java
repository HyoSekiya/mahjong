package com.example.mahjong.domain.sign.signs;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Head implements Sign{

    役牌("役牌",2),
    その他("その他",0);


    public String label;

    public int score;

    @Override
    public String getLabel() {
        return this.label;
    }

    @Override
    public int getScore() {
        return this.score;
    }
}

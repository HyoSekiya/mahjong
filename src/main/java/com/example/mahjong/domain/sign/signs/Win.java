package com.example.mahjong.domain.sign.signs;

import lombok.AllArgsConstructor;


/**
 * 和了方
 */
@AllArgsConstructor
public enum Win implements Sign{

    メンゼンロン("メンゼンロン", 10, "ron"),
    ツモ("ツモ", 2, "tsumo"),
    その他("その他", 0, "others");


    public final String label;

    public final int score;

    public final String apiCode;

    @Override
    public String getLabel() {
        return this.label;
    }

    @Override
    public int getScore () {
        return this.score;
    }

    public boolean isRon() {
        return this.equals(メンゼンロン);
    }

    public boolean isTsumo() {
        return this.equals(ツモ);
    }

    public static Win whichWin (String value) {
        for (Win win: Win.values()) {
            if (win.apiCode.equals(value)) {
                return win;
            }
        }

        throw new RuntimeException("和了方を決めてくれ！！！！");
    }
}

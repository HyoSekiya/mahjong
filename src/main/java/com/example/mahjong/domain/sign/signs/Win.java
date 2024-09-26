package com.example.mahjong.domain.sign.signs;

import lombok.AllArgsConstructor;


/**
 * 和了方
 */
@AllArgsConstructor
public enum Win implements Sign{

    メンゼンロン("メンゼンロン", 10, "menzen_ron"),
    鳴き有りロン("ロン", 0, "not_menzen_ron"),
    メンゼンツモ("メンゼンツモ", 0, "menzen_tsumo"),
    鳴き有りツモ("ツモ", 2, "not_menzen_tsumo"),
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

    public boolean isメンゼンロン() {
        return this.equals(メンゼンロン);
    }

    public boolean is鳴き有りロン() {
        return this.equals(鳴き有りロン);
    }

    public boolean isメンゼンツモ() {
        return this.equals(メンゼンツモ);
    }

    public boolean is鳴き有りツモ() {
        return this.equals(鳴き有りツモ);
    }

    public boolean isツモ() {
        return isメンゼンツモ() || is鳴き有りツモ();
    }

    public boolean isロン() {
        return is鳴き有りロン() || isメンゼンロン();
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

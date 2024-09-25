package com.example.mahjong.domain.sign.signs;

import lombok.AllArgsConstructor;

/**
 * 待ちの形
 */
@AllArgsConstructor
public enum Wait implements Sign{
    ペンチャン("ペンチャン", 2),
    カンチャン("カンチャン", 2),
    タンキ("タンキ", 2),
    ノべタン("ノべタン", 2),
    該当なし("該当なし", 0)
    ;

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

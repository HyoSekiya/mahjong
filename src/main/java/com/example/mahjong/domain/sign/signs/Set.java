package com.example.mahjong.domain.sign.signs;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Set implements Sign{

    順子("順子", 0),
    明刻_19字牌ではない("明刻_19字牌ではない", 2),
    暗刻_19字牌ではない("暗刻_19字牌ではない", 4),
    明槓_19字牌ではない("暗刻_19字牌ではない", 8),
    暗槓_19字牌ではない("暗刻_19字牌ではない", 16),
    明刻_19字牌("明刻_19字牌", 4),
    暗刻_19字牌("暗刻_19字牌", 8),
    明槓_19字牌("明槓_19字牌", 16),
    暗槓_19字牌("暗槓_19字牌", 32),
    該当なし("その他", 0);

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

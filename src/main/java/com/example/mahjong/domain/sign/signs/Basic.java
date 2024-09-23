package com.example.mahjong.domain.sign.signs;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum Basic implements Sign {
    副底("副底", 20);

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

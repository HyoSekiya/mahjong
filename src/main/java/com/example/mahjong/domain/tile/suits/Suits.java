package com.example.mahjong.domain.tile.suits;

import com.example.mahjong.domain.tile.Tiles;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * 数牌interface
 */

public interface Suits extends Tiles {
    boolean is数牌();

    boolean is萬子(String value);

    boolean is索子(String value);

    boolean is筒子(String value);

    Suits is数牌のうちどれか(String apiConde);

    String getLabel();
}

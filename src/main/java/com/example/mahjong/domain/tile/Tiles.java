package com.example.mahjong.domain.tile;

import org.springframework.stereotype.Component;

/**
 * 牌
 */

@Component
public interface Tiles {

    boolean is風牌();

    boolean is三元牌();

    boolean is中();

    boolean is萬子();

    boolean is索子();

    boolean is筒子();

}

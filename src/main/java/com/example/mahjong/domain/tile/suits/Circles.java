package com.example.mahjong.domain.tile.suits;

import com.example.mahjong.domain.tile.Tiles;
import lombok.AllArgsConstructor;

/**
 * 筒子
 */
@AllArgsConstructor
public enum Circles implements Tiles {

    ONE_CIRCLES("1筒", "one_circle"),
    TWO_CIRCLES("2筒", "two_circle"),
    THREE_CIRCLES("3筒", "three_circle"),
    FOUR_CIRCLES("4筒", "four_circle"),
    FIVE_CIRCLES("5筒", "five_circle"),
    SIX_CIRCLES("6筒", "six_circle"),
    SEVEN_CIRCLES("7筒", "seven_circle"),
    EIGHT_CIRCLES("8筒", "eight_circle"),
    NINE_CIRCLES("9筒", "nine_circle")
    ;

    public final String level;
    public final String apiCode;

    @Override
    public boolean is風牌() {
        return false;
    }

    @Override
    public boolean is三元牌() {
        return false;
    }

    @Override
    public boolean is白() {
        return false;
    }

    @Override
    public boolean is發() {
        return false;
    }

    @Override
    public boolean is中() {
        return false;
    }

    @Override
    public boolean is萬子() {
        return false;
    }

    @Override
    public boolean is索子() {
        return false;
    }

    @Override
    public boolean is筒子() {
        return true;
    }

    public static int 筒子に順序をつける(Circles tiles) {
        return switch (tiles) {
            case ONE_CIRCLES -> 1;
            case TWO_CIRCLES -> 2;
            case THREE_CIRCLES -> 3;
            case FOUR_CIRCLES -> 4;
            case FIVE_CIRCLES -> 5;
            case SIX_CIRCLES -> 6;
            case SEVEN_CIRCLES -> 7;
            case EIGHT_CIRCLES -> 8;
            case NINE_CIRCLES -> 9;
        };
    }
}

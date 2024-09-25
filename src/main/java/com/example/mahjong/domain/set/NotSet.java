package com.example.mahjong.domain.set;

public enum NotSet implements Set{
    知らない面子();

    @Override
    public boolean isSet() {
        return false;
    }

    @Override
    public boolean isChow() {
        return false;
    }
}

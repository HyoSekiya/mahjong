package com.example.mahjong.domain.common;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum ReachFlag {
    リーチ有り("reach"),
    リーチ無し("not_reach")
    ;

    public String apiCode;

    public static ReachFlag which(String value) {
        if (value.equals(リーチ有り.apiCode)) {
            return リーチ有り;
        }

        if (value.equals(リーチ無し.apiCode)) {
            return リーチ無し;
        }

        throw new RuntimeException("リーチの有無を入力しろ！！！");
    }

    public boolean isリーチ() {
        return this.equals(リーチ有り);
    }
}

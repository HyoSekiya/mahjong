package com.example.mahjong.domain.common;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum ParentOrChild {
    親("parent"),
    子("child")
    ;

    public String apiCode;

    public boolean is親 () {
        return this.equals(親);
    }

    public boolean is子() {
        return this.equals(子);
    }

    public static ParentOrChild which(String value) {
        if (value.equals(親.apiCode)) {
            return 親;
        }
        if (value.equals(子.apiCode)) {
            return 子;
        }

        throw new RuntimeException("あなたは親ですか？子ですか？");
    }


}

package com.example.mahjong.domain.sign.domainservice;

import com.example.mahjong.domain.sign.signs.Basic;
import com.example.mahjong.domain.sign.signs.Sign;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;


/**
 * 符計算における基本符の判定
 */
@AllArgsConstructor
@Component
public class SignOfBasic {

    public Sign judgement () {

        return Basic.副底;
    }
}

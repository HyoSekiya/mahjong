package com.example.mahjong.domain.role;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

/**
 * 和了役と和飜数
 */
public class WinningRole {

    @Getter
    private final Map<String,String> returnList;

    public WinningRole(Map<String,String> returnList) {
        this.returnList = returnList;
    }

    public static WinningRole toWinningRole(Role role){
        Map<String,String> winningRole = new HashMap<>();

        winningRole.put(role.getRoleName(), role.getWindshieldName());

        return new WinningRole(winningRole);
    }
}

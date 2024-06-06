package com.example.mahjong.domain.role;

import com.example.mahjong.domain.tile.valuetiles.Dragons;
import lombok.AllArgsConstructor;
import lombok.Getter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@AllArgsConstructor
public enum Role {

    VAVUE_TIES_WHITE("白",1,"1飜"),
    VAVUE_TIES_GREEN("發",1,"1飜"),
    VAVUE_TIES_RED("中",1,"1飜")
    ;

    @Getter
    public final String roleName;

    /**
     * 飜数(int)
     * あとで修正しろ！(名前仮置き)
     */
    public final int windshield;

    /**
     * 飜数(string)
     * あとで修正しろ！(名前仮置き)
     */
    @Getter
    public final String windshieldName;

    public static Map<String, String> createRoleMap(Role role) {
        Map<String, String> map = new HashMap<>();
        map.put(role.getRoleName(), role.windshieldName);
        return map;
    }
}
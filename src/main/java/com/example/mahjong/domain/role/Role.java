package com.example.mahjong.domain.role;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 　役一覧
 */
@AllArgsConstructor
public enum Role {

    VAVUE_TIES_WHITE("白",1,"1飜"),
    VAVUE_TIES_GREEN("發",1,"1飜"),
    VAVUE_TIES_RED("中",1,"1飜"),
    All_SIMPLES("タンヤオ", 1, "1飜"),
    THREE_CONCEALED_TRIPLES("三色同順", 2, "2飜"),
    BIG_DRAGONS("大三元", 13, "13飜"),
    REACH("リーチ", 1, "1飜"),
    MENZEN_TSUMO("メンゼンツモ", 1, "1飜")


    ;

    @Getter
    public final String roleName;

    /**
     * 飜数(int)
     * あとで修正しろ！(名前仮置き)
     */
    @Getter
    public final int windshield;

    /**
     * 飜数(string)
     * あとで修正しろ！(名前仮置き)
     */
    @Getter
    public final String windshieldName;

//    public static Role createRoleMap(Role role) {
//        Map<String, String> map = new HashMap<>();
//        map.put(role.getRoleName(), role.windshieldName);
//        return map;
//    }
}
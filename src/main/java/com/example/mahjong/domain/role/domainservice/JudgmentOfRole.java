package com.example.mahjong.domain.role.domainservice;

import com.example.mahjong.domain.common.ReachFlag;
import com.example.mahjong.domain.role.Role;
import com.example.mahjong.domain.role.RoleList;
import com.example.mahjong.domain.role.unit.OneRole;
import com.example.mahjong.domain.role.unit.TwoRole;
import com.example.mahjong.domain.role.unit.Yakuman;
import com.example.mahjong.domain.set.domainservice.JudgmentOfSet;
import com.example.mahjong.domain.sign.signs.Win;
import com.example.mahjong.domain.tile.tiles.Tiles;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.List;

/**
 * 役の判定くん
 */
@Component
@AllArgsConstructor
public class  JudgmentOfRole{

    private final JudgmentOfSet judgmentOfSet;

    private final Yakuman yakuman;

    private final OneRole oneRole;

    private final TwoRole twoRole;

    /**
     * 役の判定をして、Map<String,String>で返す
     *  ex)Map<大三元、13飜>
     *
     * @param tilesList
     * @return 和了内容List
     */

    public List<Role> 和了役を返す(List<Tiles> tilesList, ReachFlag reachFlag, Win win) {
        List<Role> roleList = new ArrayList<>();

        // 3,3,3,2ではないとダメ！！そうではないやつは上記に書くこと（チートイ、中連頭）
        if (!(judgmentOfSet.is33332(tilesList))) {
            return roleList;
        }

        if (yakuman.is大三元(tilesList)){
            roleList.add(Role.BIG_DRAGONS);
            // 役満なので、早期リターン
            return roleList;
        }

        if (oneRole.isリーチ(reachFlag)) {
            roleList.add(Role.REACH);
        }

        if (oneRole.isメンゼンツモ(win)) {
            roleList.add(Role.MENZEN_TSUMO);
        }

        if (oneRole.is白(tilesList)){
            roleList.add(Role.VAVUE_TIES_WHITE);
        }

        if (oneRole.is發(tilesList)){
            roleList.add(Role.VAVUE_TIES_GREEN);
        }

        if (oneRole.is中(tilesList)){
            roleList.add(Role.VAVUE_TIES_RED);
        }

        if (oneRole.isタンヤオ(tilesList)){
            roleList.add(Role.All_SIMPLES);
        }

        if (twoRole.is三色同順(tilesList)){
            roleList.add(Role.THREE_CONCEALED_TRIPLES);
        }

        if (roleList.isEmpty()){
            throw new RuntimeException("役無し！！！チョンボ！！！");
        }

        return roleList;
    }

    private RoleList addRoleList(Role role) {
        return RoleList.toWinningRole(role);
    }
}

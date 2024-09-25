package com.example.mahjong.domain.role.domainservice;

import com.example.mahjong.domain.role.Role;
import com.example.mahjong.domain.role.WinningRole;
import com.example.mahjong.domain.role.unit.OneRole;
import com.example.mahjong.domain.role.unit.TwoRole;
import com.example.mahjong.domain.role.unit.Yakuman;
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

    public List<WinningRole> 和了役と和飜数を判定(List<Tiles> tilesList) {
        List<WinningRole> roleList = new ArrayList<>();

        if (yakuman.is大三元(tilesList)){
            roleList.add(addWinningRole(Role.BIG_DRAGONS));
            // 役満なので、早期リターン
            return roleList;
        }

        if (oneRole.is白(tilesList)){
            roleList.add(addWinningRole(Role.VAVUE_TIES_WHITE));
        }

        if (oneRole.is發(tilesList)){
            roleList.add(addWinningRole(Role.VAVUE_TIES_GREEN));
        }

        if (oneRole.is中(tilesList)){
            roleList.add(addWinningRole(Role.VAVUE_TIES_RED));
        }

        if (oneRole.isタンヤオ(tilesList)){
            roleList.add(addWinningRole(Role.All_SIMPLES));
        }

        if (twoRole.is三色同順(tilesList)){
            roleList.add(addWinningRole(Role.THREE_CONCEALED_TRIPLES));
        }

        if (roleList.isEmpty()){
            throw new RuntimeException("役無し！！！チョンボ！！！");
        }

        return roleList;
    }

    private WinningRole addWinningRole(Role role) {
        return WinningRole.toWinningRole(role);
    }
}

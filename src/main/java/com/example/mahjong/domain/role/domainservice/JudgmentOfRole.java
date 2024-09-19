package com.example.mahjong.domain.role.domainservice;

import com.example.mahjong.domain.role.Role;
import com.example.mahjong.domain.role.WinningRole;
import com.example.mahjong.domain.role.set.Win;
import com.example.mahjong.domain.role.unit.OneRole;
import com.example.mahjong.domain.role.unit.TwoRole;
import com.example.mahjong.domain.role.unit.Yakuman;
import com.example.mahjong.domain.tile.Tiles;
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

    private final Win win;

    private final Yakuman yakuman;

    private final OneRole oneRole;

    private final TwoRole twoRole;

    /**
     * 役の判定をして、Map<String,String>で返す
     *  ex)Map<大三元、13飜>
     *
     * @param arrangeList
     * @return
     */

    public List<WinningRole> 和了役と和飜数を判定(List<Tiles> arrangeList) {
        List<WinningRole> roleList = new ArrayList<>();

        if (yakuman.is大三元(arrangeList)){
            roleList.add(addWinningRole(Role.BIG_DRAGONS));
            // 役満なので、早期リターン
            return roleList;
        }

        if (oneRole.is白(arrangeList)){
            roleList.add(addWinningRole(Role.VAVUE_TIES_WHITE));
        }

        if (oneRole.is發(arrangeList)){
            roleList.add(addWinningRole(Role.VAVUE_TIES_GREEN));
        }

        if (oneRole.is中(arrangeList)){
            roleList.add(addWinningRole(Role.VAVUE_TIES_RED));
        }

        if (oneRole.isタンヤオ(arrangeList)){
            roleList.add(addWinningRole(Role.All_SIMPLES));
        }

        if (twoRole.is三色同順(arrangeList)){
            roleList.add(addWinningRole(Role.THREE_CONCEALED_TRIPLES));
        }

        return roleList;
    }

    private WinningRole addWinningRole(Role role) {
        return WinningRole.toWinningRole(role);
    }

}

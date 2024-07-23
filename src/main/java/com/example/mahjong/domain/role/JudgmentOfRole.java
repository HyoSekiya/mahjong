package com.example.mahjong.domain.role;

import com.example.mahjong.domain.role.unit.OneRole;
import com.example.mahjong.domain.role.unit.Yakuman;
import com.example.mahjong.domain.tile.Tiles;
import jakarta.servlet.annotation.WebInitParam;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
@AllArgsConstructor
/**
 * 役の判定くん
 */
public class  JudgmentOfRole{

    private final Yakuman yakuman;

    private final OneRole oneRole;

    /**
     * 役の判定をして、Map<String,String>で返す
     *  ex)Map<大三元、13飜>
     *
     * @param arrangeList
     * @return
     */
    public List<WinningRole> 和了役と和飜数を判定(List<Tiles> arrangeList) {
        List<WinningRole> roleList = new ArrayList<>();

//        if (yakuman.is大三元(arrangeList)){
//            roleList.add(new WinningRole(Role.BIG_DRAGONS.getRoleName(), Role.BIG_DRAGONS.getWindshieldName()));
//            // 役満なので、早期リターン
//            return roleList;
//        }
//
//        if (oneRole.is白(arrangeList)){
//            roleList.add(Role.createRoleMap(Role.VAVUE_TIES_WHITE));
//        }
//
//        if (oneRole.is發(arrangeList)){
//            roleList.add(Role.createRoleMap(Role.VAVUE_TIES_GREEN));
//        }

        if (oneRole.is中(arrangeList)){
            roleList.add(WinningRole.toWinningRole(Role.VAVUE_TIES_RED));
        }
//
//        if (oneRole.isタンヤオ(arrangeList)){
//            roleList.add(Role.createRoleMap(Role.All_SIMPLES));
//        }

        return roleList;
    }


}

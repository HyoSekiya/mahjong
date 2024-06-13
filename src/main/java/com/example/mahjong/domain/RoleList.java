package com.example.mahjong.domain;

import com.example.mahjong.domain.role.unit.Yakuman;
import com.example.mahjong.domain.role.Role;
import com.example.mahjong.domain.role.unit.OneRole;
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
public class RoleList {

    private final Yakuman yakuman;

    private final OneRole oneRole;

    /**
     * 役の判定をして、Map<String,String>で返す
     *  ex)Map<大三元、13飜>
     *
     * @param arrangeList
     * @return
     */
    public List<Map<String,String>> roleList(List<String> arrangeList) {
        List<Map<String,String>> roleList = new ArrayList<>();

        if (yakuman.is大三元(arrangeList)){
            roleList.add(Role.createRoleMap(Role.BIG_DRAGONS));
            // 役満なので、早期リターン
            return roleList;
        }

        if (oneRole.is白(arrangeList)){
            roleList.add(Role.createRoleMap(Role.VAVUE_TIES_WHITE));
        }

        if (oneRole.is發(arrangeList)){
            roleList.add(Role.createRoleMap(Role.VAVUE_TIES_GREEN));
        }

        if (oneRole.is中(arrangeList)){
            roleList.add(Role.createRoleMap(Role.VAVUE_TIES_RED));
        }

        if (oneRole.isタンヤオ(arrangeList)){
            roleList.add(Role.createRoleMap(Role.All_SIMPLES));
        }

        return roleList;
    }


}

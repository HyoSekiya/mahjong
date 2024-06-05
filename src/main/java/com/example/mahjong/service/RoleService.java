package com.example.mahjong.service;

import com.example.mahjong.domain.role.Dragons.DragonsRole;
import com.example.mahjong.domain.role.Role;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
@AllArgsConstructor
public class RoleService {

    private final DragonsRole dragonsRole;
    public List<Map<String,String>> roleList(List<String> arrangeList) {
        List<Map<String,String>> roleList = new ArrayList<>();

        if (dragonsRole.is白(arrangeList)){
            roleList.add(Role.createRoleMap(Role.VAVUE_TIES_WHITE));
        }

        if (dragonsRole.is發(arrangeList)){
            roleList.add(Role.createRoleMap(Role.VAVUE_TIES_GREEN));
        }

        if (dragonsRole.is中(arrangeList)){
            roleList.add(Role.createRoleMap(Role.VAVUE_TIES_RED));
        }

        return roleList;
    }
}

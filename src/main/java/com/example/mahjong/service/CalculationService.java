package com.example.mahjong.service;

import com.example.mahjong.domain.Arrange;
import com.example.mahjong.domain.RoleList;
import com.example.mahjong.domain.role.Role;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
@AllArgsConstructor
public class CalculationService {

    private final Arrange arrange;

    private final RoleList roleList;

    public List<Map<String,String>> calculate(List<String> apiCodeList){

        // Requestを並べる
        List<String> list = arrange.arrange(apiCodeList);

        // 並べたRequestの役を判定して返す
        return roleList.roleList(list);
    }
}

package com.example.mahjong.api.request;

import com.example.mahjong.domain.RoleList;
import com.example.mahjong.service.CalculationService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("mahjong")
public class MahjongApi {

    @Autowired
    private final CalculationService calculationService;

    @Autowired
    private  final RoleList roleService;

    @PostMapping("/sum")
    public List<Map<String,String>> sum(@RequestBody MahjongRequest request){

        List<Map<String,String>> list = calculationService.calculate(request.create());

        if (list.isEmpty()){
            throw new RuntimeException("役無し！！！チョンボ！！！");
        }

        return list;
     }
}

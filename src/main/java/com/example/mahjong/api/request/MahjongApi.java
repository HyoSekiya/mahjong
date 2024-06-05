package com.example.mahjong.api.request;

import com.example.mahjong.service.ArrangeService;
import com.example.mahjong.service.RoleService;
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
    private final ArrangeService arrangeService;

    // TODO:計算用のServiceクラス（仮）
//    @Autowired
//    private final CaluculateService caluculateService;

    @Autowired
    private  final RoleService roleService;

    @PostMapping("/arrange")
    public List<Map<String,String>> invoke(@RequestBody MahjongRequest request){

        List<Map<String,String>> list = roleService.roleList(arrangeService.arrange(request.create()));

        if (list.isEmpty()){
            throw new RuntimeException("役無し！！！チョンボ！！！");
        }

        return list;
     }
}

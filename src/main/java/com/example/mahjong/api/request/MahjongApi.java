package com.example.mahjong.api.request;

import com.example.mahjong.service.ArrangeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("mahjong")
public class MahjongApi {

    @Autowired
    private final ArrangeService check;

    @PostMapping("/arrange")
    public List<String> invoke(@RequestBody MahjongRequest request){

        List<String> list = check.arrange(request.create());

        if(list.size() == 14){
            return list;
        } else {
            return list;
        }
    }
}

package com.example.mahjong.api.request;

import com.example.mahjong.api.response.Response;
import com.example.mahjong.domain.tile.Tiles;
import com.example.mahjong.service.Service;
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
    private final Service service;

    /**
     * 利用者のリクエストを牌に変換するくん
     */
    @Autowired
    private final RequestConvertor convertor;

    @PostMapping("/list")
    public List<Tiles> List(@RequestBody PlayerRequest request){

        List<Tiles> 利用者の配牌 = this.利用者の配牌に変換(request.create());

        List<Tiles> 並べる = service.並べる(利用者の配牌);

        return 並べる;
    }

    @PostMapping("/sum")
    public List<Map<String, String>> mahjong(@RequestBody PlayerRequest request){

        List<Tiles> 利用者の配牌 = this.利用者の配牌に変換(request.create());

        Response response = service.和了役と飜数を返す(利用者の配牌);

        return response.getResponse();
    }

    private List<Tiles> 利用者の配牌に変換(List<String> playerRequest) {

        return convertor.利用者の牌を牌に変換(playerRequest);
    }
}
package com.example.mahjong.api.request;

import com.example.mahjong.api.response.Response;
import com.example.mahjong.domain.tile.domainservice.TilesRole;
import com.example.mahjong.domain.role.WinningRole;
import com.example.mahjong.service.Service;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.RequestScope;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("mahjong")
@RequestScope
public class MahjongApi {


    /**
     * ApplicationService
     */
    private final Service service;

    /**
     * 利用者のリクエストを牌に変換するくん
     */
    private final TilesRole tilesRole;

    @PostMapping("/sum")
    public List<Map<String, String>> mahjong(@RequestBody PlayerRequest request){

        // 利用者の和了と飜数を返却
        List<WinningRole> response = service.和了役と飜数を返す(tilesRole.利用者の牌を牌に変換(request.create()));

        return Response.toResponse(response);
    }

    @PostMapping("/sum2")
    public List<Map<String, String>> mahjong2(@RequestBody PlayerRequest request){

        // 利用者の和了と飜数を返却
        List<WinningRole> response = service.和了役と飜数を返す(tilesRole.利用者の牌を牌に変換(request.create()));

        return Response.toResponse(response);
    }
}
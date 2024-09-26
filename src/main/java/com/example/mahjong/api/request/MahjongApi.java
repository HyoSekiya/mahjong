package com.example.mahjong.api.request;

import com.example.mahjong.api.response.Response;
import com.example.mahjong.domain.calculation.WinEntity;
import com.example.mahjong.domain.calculation.score.Score;
import com.example.mahjong.domain.role.Role;
import com.example.mahjong.service.Service;
import lombok.RequiredArgsConstructor;
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

    @PostMapping("/sum2")
    public Map<String, Object> mahjong(@RequestBody PlayerRequest request){

        // 利用者の和了と飜数を返却
        WinEntity winEntity = service.点数計算(
                request.利用者の牌を牌に変換(),
                request.和了方を定義(),
                request.親子を定義(),
                request.リーチの有無()
        );

        return Response.toResponse(
                winEntity.getTilesList(),
                winEntity.getRoles(),
                winEntity.getWinScore(),
                winEntity.getSumSign(),
                winEntity.getWin()
        );
    }
}
package com.example.mahjong.api.request;

import com.example.mahjong.api.response.Response;
import com.example.mahjong.domain.calculation.WinEntity;
import com.example.mahjong.domain.sign.SumSign;
import com.example.mahjong.domain.role.WinningRole;
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

    @PostMapping("/sum")
    public List<Map<String, String>> mahjong(@RequestBody PlayerRequest request){

        // 利用者の和了と飜数を返却
        List<WinningRole> response = service.和了役と飜数を返す(
                request.利用者の牌を牌に変換()
        );

        return Response.toResponse(response);
    }

    @PostMapping("/sum2")
    public int mahjong2(@RequestBody PlayerRequest request){

        // 利用者の和了と飜数を返却
        WinEntity winEntity = service.点数計算(
                request.利用者の牌を牌に変換(),
                request.和了方を定義()
        );

        // TODO: ResoponseクラスでWinEnityから整形して、出力
        return winEntity.getWinScore().getValue();
    }
}
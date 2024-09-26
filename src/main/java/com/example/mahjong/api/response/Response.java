package com.example.mahjong.api.response;

import com.example.mahjong.domain.calculation.score.ChildScore;
import com.example.mahjong.domain.calculation.score.ParentScore;
import com.example.mahjong.domain.calculation.score.Score;
import com.example.mahjong.domain.role.Role;
import com.example.mahjong.domain.sign.SumSign;
import com.example.mahjong.domain.sign.signs.Win;
import com.example.mahjong.domain.tile.tiles.Tiles;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.*;
import java.util.stream.Collectors;

@AllArgsConstructor
@Getter
public class Response {

    private final List<String> tilesList;
    private final List<String> roleList;
    private final Score winScore;
    private final int sumSign;

    // 各オブジェクトを受け取り、レスポンスオブジェクトを作成
    public static Map<String, Object> toResponse(List<Tiles> tilesList, List<Role> roleList, Score winScore, SumSign sumSign, Win win) {

        Map<String, Object> responseMap = new LinkedHashMap<>();

        // 和了牌を変換
        final Map<String, String> tileStrings = new LinkedHashMap<>();
        for (int i = 0; i < tilesList.size(); i++) {
            tileStrings.put((i + 1) + "つ目", tilesList.get(i).getLabel());
        }

        // 和了役を変換
        final List<String> roleStrings = roleList.stream()
                .map(Role::getRoleName)
                .collect(Collectors.toList());

        // 和了点数
        final String winScoreString = scoreString(winScore, win);

        // 合計符を取得
        final String sumSignValue = String.valueOf(sumSign.getValue());

        responseMap.put("和了牌", tileStrings);
        responseMap.put("和了役", roleStrings);
        responseMap.put("和了内容", winScore);
        responseMap.put("和了点数", winScoreString);
//        responseMap.put("和了符", sumSignValue);

        return responseMap;
    }

    // 点数変換
    private static String scoreString(Score score, Win win) {
        if (score.is子()) {
            ChildScore childScore = (ChildScore) score;
            if (win.isツモ()) {
                return String.format("子から:%d点 親から:%d点",childScore.getツモ子点数(), childScore.getツモ親点数());
            }
            if (win.isロン()) {
                return String.format("ロンした相手から: %d + 点", childScore.getロン点数());
            }
        }
        if (score.is親()) {
            ParentScore parentScore = (ParentScore) score;
            if (win.isツモ()) {
                return String.format("全員から: %d + 点", parentScore.getツモ支払点数());
            }
            if (win.isロン()) {
                return String.format("ロンした相手から: %d + 点", parentScore.getロン点数());
            }
        }

        throw new RuntimeException("点数変換がうまくいかない！！！！");
    }
}
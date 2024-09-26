package com.example.mahjong.domain.calculation;

import com.example.mahjong.domain.calculation.score.Score;
import com.example.mahjong.domain.role.Role;
import com.example.mahjong.domain.sign.SumSign;
import com.example.mahjong.domain.sign.signs.Win;
import com.example.mahjong.domain.tile.tiles.Tiles;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

/**
 * 和了内容
 */
@AllArgsConstructor
@Getter
public class WinEntity {
    private final List<Tiles> tilesList;

    private final List<Role> roles;

    private final Score winScore;

    private final SumSign sumSign;

    private final Win win;


}

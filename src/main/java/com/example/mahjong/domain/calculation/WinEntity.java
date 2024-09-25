package com.example.mahjong.domain.calculation;

import com.example.mahjong.domain.role.Role;
import com.example.mahjong.domain.role.WinningRole;
import com.example.mahjong.domain.sign.SumSign;
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

    private final List<WinningRole> roles;

    private final WinScore winScore;

    private final SumSign sumSign;

    public WinEntity create(){
        return new WinEntity(
                tilesList,
                roles,
                winScore,
                sumSign
        );
    }


}

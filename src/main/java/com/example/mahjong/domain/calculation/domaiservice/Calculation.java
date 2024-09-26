package com.example.mahjong.domain.calculation.domaiservice;

import com.example.mahjong.domain.calculation.score.ChildScore;
import com.example.mahjong.domain.calculation.score.ParentScore;
import com.example.mahjong.domain.calculation.score.Score;
import com.example.mahjong.domain.common.ParentOrChild;
import com.example.mahjong.domain.common.ReachFlag;
import com.example.mahjong.domain.role.Role;
import com.example.mahjong.domain.role.domainservice.JudgmentOfRole;
import com.example.mahjong.domain.sign.SumSign;
import com.example.mahjong.domain.sign.domainservice.JudgmentOfSign;
import com.example.mahjong.domain.sign.signs.Win;
import com.example.mahjong.domain.tile.tiles.Tiles;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 和了点数計算くん
 */
@AllArgsConstructor
@Component
public class Calculation {

    private final JudgmentOfRole judgmentOfRole;
    private final JudgmentOfSign judgmentOfSign;

    public Score calc(List<Tiles> tilesList, Win win, ParentOrChild parentOrChild, ReachFlag reachFlag) {

        // 和了役を取得
        final List<Role> roleList = judgmentOfRole.和了役を返す(tilesList, reachFlag, win);

        // 合計符を取得
        final SumSign sumSign = judgmentOfSign.合計符を返す(tilesList, win);

        return _calc(roleList, sumSign, parentOrChild);
    }

    private Score _calc(List<Role> roleList, SumSign sumSign, ParentOrChild parentOrChild) {
        // 飜数を集計
        int 合計飜数 = roleList.stream()
                .mapToInt(Role::getWindshield)
                .sum();

        // 符を取得
        int 合計符 = sumSign.getValue();

        if (parentOrChild.is子()) {
            return calculateScoreForChild(合計飜数, 合計符);
        }
        if (parentOrChild.is親()) {
            return calculateScoreForParent(合計飜数, 合計符);
        }

        throw new RuntimeException("点数できない状況！！！！なんかおかしい");
    }

    /**
     * 子の点数を計算するメソッド
     */
    private Score calculateScoreForChild(int 合計飜数, int 合計符) {
        switch (合計飜数) {
            case 1:
                if (合計符 <= 30) {
                    return ChildScore.一飜_30符;
                } else if (合計符 == 40) {
                    return ChildScore.一飜_40符;
                } else if (合計符 == 50) {
                    return ChildScore.一飜_50符;
                } else if (合計符 == 60) {
                    return ChildScore.一飜_60符;
                } else if (合計符 == 70) {
                    return ChildScore.一飜_70符;
                }
            case 2:
                if (合計符 == 30) {
                    return ChildScore.二飜_30符;
                } else if (合計符 == 40) {
                    return ChildScore.二飜_40符;
                } else if (合計符 == 50) {
                    return ChildScore.二飜_50符;
                } else if (合計符 == 60) {
                    return ChildScore.二飜_60符;
                } else if (合計符 >= 70) {
                    return ChildScore.二飜_70符;
                }
                break;
            case 3:
                if (合計符 == 30) {
                    return ChildScore.三飜_30符;
                } else if (合計符 == 40) {
                    return ChildScore.三飜_40符;
                } else if (合計符 == 50) {
                    return ChildScore.三飜_50符;
                } else if (合計符 >= 60) {
                    return ChildScore.三飜_60符;
                }
            case 4:
                if (合計符 == 30) {
                    return ChildScore.四飜_30符;
                } else if (合計符 == 40) {
                    return ChildScore.四飜_40符;
                } else if (合計符 == 50) {
                    return ChildScore.四飜_50符;
                } else if (合計符 >= 60) {
                    return ChildScore.四飜_60符;
                }
            case 5:
                return ChildScore.満貫;
            case 6:
                return ChildScore.跳満;
            case 7:
                return ChildScore.跳満;
            case 8:
                return ChildScore.倍満;
            case 9:
                return ChildScore.倍満;
            case 10:
                return ChildScore.倍満;
            case 11:
                return ChildScore.三倍満;
            case 12:
                return ChildScore.三倍満;
            case 13:
                return ChildScore.役満;
        }

        throw new RuntimeException("子の点数計算がおかしい！！！！");

    }

    /**
     * 親の点数を計算するメソッド
     */
    private Score calculateScoreForParent(int 合計飜数, int 合計符) {
        switch (合計飜数) {
            case 1:
                if (合計符 <= 30) {
                    return ParentScore.一飜_30符;
                } else if (合計符 == 40) {
                    return ParentScore.一飜_40符;
                } else if (合計符 == 50) {
                    return ParentScore.一飜_50符;
                } else if (合計符 == 60) {
                    return ParentScore.一飜_60符;
                } else if (合計符 == 70) {
                    return ParentScore.一飜_70符;
                }
                break;
            case 2:
                if (合計符 == 20) {
                    return ParentScore.二飜_20符;
                } else if (合計符 == 30) {
                    return ParentScore.二飜_30符;
                } else if (合計符 == 40) {
                    return ParentScore.二飜_40符;
                } else if (合計符 == 50) {
                    return ParentScore.二飜_50符;
                } else if (合計符 == 60) {
                    return ParentScore.二飜_60符;
                } else if (合計符 >= 70) {
                    return ParentScore.二飜_70符;
                }
                break;
            case 3:
                if (合計符 == 20) {
                    return ParentScore.三飜_20符;
                } else if (合計符 == 30) {
                    return ParentScore.三飜_30符;
                } else if (合計符 == 40) {
                    return ParentScore.三飜_40符;
                } else if (合計符 == 50) {
                    return ParentScore.三飜_50符;
                } else if (合計符 >= 60) {
                    return ParentScore.三飜_60符;
                }
                break;
            case 4:
                if (合計符 == 20) {
                    return ParentScore.四飜_20符;
                } else if (合計符 == 30) {
                    return ParentScore.四飜_30符;
                } else if (合計符 == 40) {
                    return ParentScore.四飜_40符;
                } else if (合計符 == 50) {
                    return ParentScore.四飜_50符;
                } else if (合計符 >= 60) {
                    return ParentScore.四飜_60符;
                }
                break;
            case 5:
                return ParentScore.満貫;
            case 6:
                return ParentScore.跳満;
            case 7:
                return ParentScore.跳満;
            case 8:
                return ParentScore.倍満;
            case 9:
                return ParentScore.倍満;
            case 10:
                return ParentScore.倍満;
            case 11:
                return ParentScore.三倍満;
            case 12:
                return ParentScore.三倍満;
            case 13:
                return ParentScore.役満;
        }

        throw new RuntimeException("親の点数計算がおかしい！！！！");
    }
}

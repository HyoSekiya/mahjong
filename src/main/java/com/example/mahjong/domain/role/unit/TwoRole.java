package com.example.mahjong.domain.role.unit;

import com.example.mahjong.domain.role.Chow;
import com.example.mahjong.domain.tile.Tiles;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class TwoRole {

    public boolean is三色同順(List<Tiles> list){
        List<Chow> chowList = Chow.whichChowsAreIncluded(list);

        // 順子がなかったら、false
        if (chowList.isEmpty()){
            return false;
        }

        if (is三色同順(chowList, Chow.三色同順_123())) {
            return true;
        } else if (is三色同順(chowList, Chow.三色同順_234())) {
            return true;
        } else if (is三色同順(chowList, Chow.三色同順_345())) {
            return true;
        } else if (is三色同順(chowList, Chow.三色同順_456())) {
            return true;
        } else if (is三色同順(chowList, Chow.三色同順_567())) {
            return true;
        } else if (is三色同順(chowList, Chow.三色同順_678())) {
            return true;
        } else if (is三色同順(chowList, Chow.三色同順_789())) {
            return true;
        } else {
            return false;
        }
    }

    private boolean is三色同順(List<Chow> resultList, List<Chow> subjectList){

        for(Chow subject : subjectList){
            if (!(resultList.contains(subject))) {
                return false;
            }
        }

        return true;
    }
}

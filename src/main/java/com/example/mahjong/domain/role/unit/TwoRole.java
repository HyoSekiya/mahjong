package com.example.mahjong.domain.role.unit;

import com.example.mahjong.domain.role.set.Chow;
import com.example.mahjong.domain.role.set.Pung;
import com.example.mahjong.domain.role.set.Win;
import com.example.mahjong.domain.tile.Tiles;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class TwoRole {

    private final Win win;

    public boolean is三色同順(List<Tiles> list){
        List<Chow> chowList = Chow.whichChowsAreIncluded(list);
        List<Pung> pungList = Pung.whichPungsAreIncluded(list);

        // 順子がなかったら、false
        if (chowList.isEmpty()){
            return false;
        }

        // 3,3,3,3,2ではに場合、false
        if (win.isNot33332(list, chowList, pungList)){
            return false;
        }

        if (is三色同順(chowList, 三色同順_123())) {
            return true;
        } else if (is三色同順(chowList, 三色同順_234())) {
            return true;
        } else if (is三色同順(chowList, 三色同順_345())) {
            return true;
        } else if (is三色同順(chowList, 三色同順_456())) {
            return true;
        } else if (is三色同順(chowList, 三色同順_567())) {
            return true;
        } else if (is三色同順(chowList, 三色同順_678())) {
            return true;
        } else if (is三色同順(chowList, 三色同順_789())) {
            return true;
        } else {
            return false;
        }
    }

    public static List<Chow> 三色同順_123(){
        List<Chow> chowslist = List.of(
                Chow.萬子123, Chow.索子123, Chow.索子123
        );

        return chowslist;
    }

    public static List<Chow> 三色同順_234(){
        List<Chow> chowslist = List.of(
                Chow.萬子234, Chow.索子234, Chow.索子234
        );

        return chowslist;
    }
    public static List<Chow> 三色同順_345(){
        List<Chow> chowslist = List.of(
                Chow.萬子345, Chow.索子345, Chow.索子345
        );

        return chowslist;
    }
    public static List<Chow> 三色同順_456(){
        List<Chow> chowslist = List.of(
                Chow.萬子456, Chow.索子456, Chow.索子456
        );

        return chowslist;
    }
    public static List<Chow> 三色同順_567(){
        List<Chow> chowslist = List.of(
                Chow.萬子567, Chow.索子567, Chow.索子567
        );

        return chowslist;
    }
    public static List<Chow> 三色同順_678(){
        List<Chow> chowslist = List.of(
                Chow.萬子678, Chow.索子678, Chow.索子678
        );

        return chowslist;
    }
    public static List<Chow> 三色同順_789(){
        List<Chow> chowslist = List.of(
                Chow.萬子789, Chow.索子789, Chow.索子789
        );

        return chowslist;
    }

    private boolean is三色同順(List<Chow> chowList, List<Chow> subjectList){

        for(Chow subject : subjectList){
            if (!(chowList.contains(subject))) {
                return false;
            }
        }

        return true;
    }
}

package com.example.mahjong.domain.tile.suits;

import jdk.jshell.spi.ExecutionControl;
import lombok.AllArgsConstructor;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 萬子
 */
@AllArgsConstructor
public enum Characters{

    ONE_CHARACTERS("1萬", "one_character"),
    TWO_CHARACTERS("2萬", "two_character"),
    THREE_CHARACTERS("3萬", "three_character"),
    FOUR_CHARACTERS("4萬", "four_character"),
    FIVE_CHARACTERS("5萬", "five_character"),
    SIX_CHARACTERS("6萬", "six_character"),
    SEVEN_CHARACTERS("7萬", "seven_character"),
    EIGHT_CHARACTERS("8萬", "eight_character"),
    NINE_CHARACTERS("9萬", "nine_character"),
    ;

    public final String level;
    public final String apiCode;

    private static boolean is萬子(String apiCode) {
        for (Characters characters: Characters.values()){
            if(apiCode.equals(characters.apiCode)){
                return true;
            }
        }

        return false;
    }

    public static List<String> extraction(List<String> apicodeList){
        return apicodeList.stream()
                .filter(Characters::is萬子)
                .sorted(Comparator.comparingInt(apiCode -> arrange(convertCharacters(apiCode))))
                .collect(Collectors.toList());
    }

    public static boolean is19字牌(String apiCode){
        return apiCode.equals(ONE_CHARACTERS.apiCode) || apiCode.equals(NINE_CHARACTERS.apiCode);
    }

    public static int arrange (Characters characters){
        return switch (characters){
            case ONE_CHARACTERS -> 1;
            case TWO_CHARACTERS -> 2;
            case THREE_CHARACTERS -> 3;
            case FOUR_CHARACTERS -> 4;
            case FIVE_CHARACTERS -> 5;
            case SIX_CHARACTERS -> 6;
            case SEVEN_CHARACTERS -> 7;
            case EIGHT_CHARACTERS -> 8;
            case NINE_CHARACTERS -> 9;
        };
    }

    public static Characters convertCharacters(String apiCode){
        for (Characters characters: Characters.values()){
            if (characters.apiCode.equals(apiCode)){
                return characters;
            }
        }
        throw new RuntimeException(apiCode + "は萬子ではないので、変換できません");
    }
}

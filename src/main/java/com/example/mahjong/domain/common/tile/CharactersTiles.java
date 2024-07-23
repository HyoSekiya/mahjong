//package com.example.mahjong.domain.common.tile;
//
//import com.example.mahjong.domain.tile.Tiles;
//
//public interface CharactersTiles extends Tiles {
//
//    default boolean is風牌(){
//        return false;
//    }
//
//    default boolean is三元牌(){
//        return false;
//    }
//
////    public CharactersTiles(String tilesName) {
////        super(tilesName);
////    }
////
////    public boolean is萬子() {
////        for (Characters characters: Characters.values()){
////            if(this.getTilesName().equals(characters.apiCode)){
////                return true;
////            }
////        }
////
////        return false;
////    }
////    public List<CharactersTiles> 萬子を並べて抽出(List<Tiles> tilesList){
////        return tilesList.stream()
////                .filter(tiles -> tiles instanceof CharactersTiles)
////                .map(tiles -> (CharactersTiles) tiles)
////                .filter(CharactersTiles::is萬子)
////                .sorted(Comparator.comparingInt(this::萬子に順序をつける))
////                .toList();
////    }
////
////    private int 萬子に順序をつける(Tiles tiles){
////        return switch (tiles.getTilesName()) {
////            case "one_character" -> 1;
////            case "two_character" -> 2;
////            case "three_character" -> 3;
////            case "four_character" -> 4;
////            case "five_character" -> 5;
////            case "six_character" -> 6;
////            case "seven_character" -> 7;
////            case "eight_character" -> 8;
////            case "nine_character" -> 9;
////            default -> throw new IllegalStateException("ダメ！");
////        };
////    }
//}

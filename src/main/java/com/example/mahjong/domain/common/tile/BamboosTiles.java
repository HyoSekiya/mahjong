//package com.example.mahjong.domain.common.tile;
//
//import com.example.mahjong.domain.tile.Tiles;
//
//public interface BamboosTiles extends Tiles {
//
//    default boolean is風牌(){
//        return false;
//    }
//
//    default boolean is三元牌(){
//        return false;
//    }
//
////    public BamboosTiles(String tilesName) {
////        super(tilesName);
////    }
////
////    public boolean is索子() {
////        for (Bamboos bamboos: Bamboos.values()) {
////            if (this.getTilesName().equals(bamboos.apiCode)){
////                return true;
////            }
////        }
////        return false;
////    }
////
////    public List<BamboosTiles> 索子を並べて抽出(List<Tiles> tilesList){
////        return tilesList.stream()
////                .filter(tiles -> tiles instanceof BamboosTiles)
////                .map(tiles -> (BamboosTiles) tiles)
////                .filter(BamboosTiles::is索子)
////                .sorted(Comparator.comparingInt(this::索子に順序をつける))
////                .toList();
////    }
////
////    private int 索子に順序をつける(Tiles tiles){
////        return switch (tiles.getTilesName()) {
////            case "one_bamboo" -> 1;
////            case "two_bamboo" -> 2;
////            case "three_bamboo" -> 3;
////            case "four_bamboo" -> 4;
////            case "five_bamboo" -> 5;
////            case "six_bamboo" -> 6;
////            case "seven_bamboo" -> 7;
////            case "eight_bamboo" -> 8;
////            case "nine_bamboo" -> 9;
////            default -> throw new IllegalStateException("ダメ！");
////        };
////    }
//}

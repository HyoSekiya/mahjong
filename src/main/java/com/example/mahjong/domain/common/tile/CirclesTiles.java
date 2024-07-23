//package com.example.mahjong.domain.common.tile;
//
//import com.example.mahjong.domain.tile.Tiles;
//
//public interface CirclesTiles extends Tiles {
//
//    default boolean is風牌(){
//        return false;
//    }
//
//    default boolean is三元牌(){
//        return false;
//    }
////    public CirclesTiles(String tilesName) {
////        super(tilesName);
////    }
////
////    public boolean is筒子() {
////        for(Circles circles: Circles.values()){
////            if (this.getTilesName().equals(circles.apiCode)){
////                return true;
////            }
////        }
////        return false;
////    }
////
////    public List<CirclesTiles> 筒子を並べて抽出(List<Tiles> tilesList){
////        return tilesList.stream()
////                .filter(tiles -> tiles instanceof CirclesTiles)
////                .map(tiles -> (CirclesTiles) tiles)
////                .filter(CirclesTiles::is筒子)
////                .sorted(Comparator.comparingInt(this::筒子に順序をつける))
////                .toList();
////    }
////
////    private int 筒子に順序をつける(Tiles tiles){
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

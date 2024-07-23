//package com.example.mahjong.domain.common.tile;
//
//import com.example.mahjong.domain.tile.Tiles;
//
//public interface WindsTiles extends Tiles {
//
//    default boolean is萬子(){
//        return false;
//    }
//
//    default boolean is索子(){
//        return false;
//    }
//
//    default boolean is筒子(){
//        return false;
//    }
//
////    public WindsTiles(String tilesName) {
////        super(tilesName);
////    }
////
////
////    public List<WindsTiles> 風牌を並べて抽出(List<Tiles> tilesList){
////        return tilesList.stream()
////                .filter(tiles -> tiles instanceof DragonsTiles)
////                .map(tiles -> (WindsTiles) tiles)
////                .filter(WindsTiles::is風牌)
////                .sorted(Comparator.comparingInt(this::風牌に順序をつける))
////                .toList();
////    }
////
////    private int 風牌に順序をつける(Tiles tiles){
////        return switch (tiles.getTilesName()) {
////            case "east" -> 1;
////            case "south" -> 2;
////            case "west" -> 3;
////            case "north" -> 4;
////            default -> throw new IllegalStateException("ダメ！");
////        };
////    }
//}

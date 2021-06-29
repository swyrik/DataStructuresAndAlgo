package com.rtc.leetcode;
/*
 * @Author Swyrik Thupili
 */

public class DungeonGame {

    public static void main(String[] args) {
//        int[][] dung = new int[][]{{-2,-3,3},{-5,-10,1},{10,30,-5}};
        int[][] dung = new int[][]{{-200}};
        System.out.println(calculateMinimumHP(dung));
    }

    public static int calculateMinimumHP(int[][] dungeon) {
        if(dungeon.length == 0 || dungeon[0].length == 0){
            return 0;
        }

        if(dungeon.length ==1 && dungeon[0].length == 1){
            if(dungeon[0][0]>0){
                return 1;
            }else{
                return Math.abs(dungeon[0][0]) + 1;
            }

        }
        int x = dungeon.length;
        int y = dungeon[0].length;

        Integer[][] sum = new Integer[x][y];

        sum[0][0] = dungeon[0][0];

        for(int i =0; i<x; i++){
            for(int j=0;j<y; j++){
                if(i ==0 && j == 0) continue;

                Integer topVal = Integer.MIN_VALUE;
                if(i>0){

                    topVal = sum[i-1][j] + dungeon[i][j];

                }


                Integer leftVal = Integer.MIN_VALUE;
                if(j > 0){

                    leftVal = sum[i][j-1] + dungeon[i][j];

                }
                if(i == x-1 && j == y-1){
                    int min = Math.min(topVal, leftVal);
                    sum [i][j] = Math.abs(min) + 1;
                }

                if( i!= x-1 || j != y-1)
                    sum[i][j] = Math.max(topVal, leftVal);
            }
        }


        return sum[x-1][y-1];

    }

}

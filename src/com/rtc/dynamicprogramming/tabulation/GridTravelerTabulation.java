package com.rtc.dynamicprogramming.tabulation;

public class GridTravelerTabulation {
    public static void main(String[] args) {
        System.out.println(gridTravel(30,30));
        System.out.println(gridTravel(3,3));System.out.println(gridTravel(18,18));

    }

    private static long gridTravel(int m, int n){
        long[][] table = new long[m+1][n+1];
        table[0][0] = 0;
        table[1][1] = 1;
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if(j+1<=n){
                    table[i][j+1] += table[i][j];
                }
                if(i+1<=m){
                    table[i+1][j] += table[i][j];
                }
            }
        }
        return table[m][n];

    }

}

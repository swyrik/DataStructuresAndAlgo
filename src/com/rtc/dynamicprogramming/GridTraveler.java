package com.rtc.dynamicprogramming;

public class GridTraveler {
    public static void main(String[] args) {
        System.out.println(ways(0,0));
        System.out.println(ways(1,1));
        System.out.println(ways(3,3));
        System.out.println(ways(18,18));
    }

    private static double ways(int m, int n){

        if(m == 0 || n == 0){
            return 0;
        }

        if(m ==1 || n==1){
            return 1;
        }

        return ways(m-1, n) + ways(m, n-1);
    }
}

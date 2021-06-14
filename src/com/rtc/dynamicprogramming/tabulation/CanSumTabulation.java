package com.rtc.dynamicprogramming.tabulation;

public class CanSumTabulation {
    public static void main(String[] args) {
        System.out.println(canSum(7, new int[]{5,3,4}));
        System.out.println(canSum(7, new int[]{2,3,7}));
        System.out.println(canSum(300, new int[]{7,14}));
    }

    private static boolean canSum(int n, int[] arr){
        boolean[] table= new boolean[n+1];
        table[0] = true;
        for (int i = 0; i <= n; i++) {
            for (int num: arr){
                if(i+num <= n && table[i]){
                    table[i+num] = true;
                }
            }
            // this piece of logic is just to improve the code performance
            if(table[n]){
                break;
            }
            // the above solution may not be valid for the other variants of the problem
        }

        return table[n];
    }
}


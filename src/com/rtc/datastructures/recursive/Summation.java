package com.rtc.datastructures.recursive;

public class Summation {

    public static void main(String[] args) {
        int z = sum(9);
        System.out.println(z);
    }

    public static int sum(int n){
        if(n==0){
            return 0;
        }
        return n+ sum(n-1);
    }
}

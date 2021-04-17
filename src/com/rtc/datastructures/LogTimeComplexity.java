package com.rtc.datastructures;

public class LogTimeComplexity {
    // time complexity of the below method is logN
    private static void doubleLoopingVariable(int n){
        for (int i=1;i<n;i=i*2){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        doubleLoopingVariable(10);
    }
}

package com.rtc.datastructures;

public class QuadraticTimeComplexity {

    public static void main(String[] args) {
        quadriticLoop(3);
    }

    // the below method has a complexity of O(N2)
    public static void quadriticLoop(int n){
        for (int i = 0; i < n*n; i++) {
            System.out.println(i);
        }
    }

}

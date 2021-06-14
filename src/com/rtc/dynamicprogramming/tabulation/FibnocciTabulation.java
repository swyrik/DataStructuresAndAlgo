package com.rtc.dynamicprogramming.tabulation;

public class FibnocciTabulation {

    public static void main(String[] args) {
        System.out.println(fib(6));
        System.out.println(fib(8));
        System.out.println(fib(50));
    }

    private static double fib(int n){
        double[] array = new double[n+1];
        array[0] = 0;
        array[1] = 1;
        for (int i = 0; i < n; i++) {
            if(i + 1 <= n){
                array[i+1] += array[i];
            }
            if(i+2 <= n){
                array[i+2] += array[i];
            }
        }
        return array[n];
    }
}

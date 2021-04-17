package com.rtc.datastructures;

public class ConstantTimeComplexity {

    public static void main(String[] args) {
        simpleFunction(new int[]{1, 2, 3, 4});
    }

    public static void simpleFunction(int[] arr){
        for (int i = 0; i < 3; i++) {


            System.out.print(arr[i]);
        }
    }

}

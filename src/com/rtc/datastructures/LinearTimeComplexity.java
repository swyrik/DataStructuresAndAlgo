package com.rtc.datastructures;

public class LinearTimeComplexity {
    // linear time complexity O(N). because it is running for length of array
    public static void main(String[] args) {
        simpleFunction(new int[]{1, 2, 3, 4,7,8,3,34,5,5});
    }

    public static void simpleFunction(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +",");
        }
    }

}




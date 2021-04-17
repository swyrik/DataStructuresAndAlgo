package com.rtc.datastructures;

public class MaxElement {

    public static void main(String[] args) {
        int arr[] = {4,5,2,4,22,436,8,45,3,-1};
        int max = maxOfArray(arr);
        System.out.println(max);
    }

    private static int maxOfArray(int[] arr) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }

        }
        System.out.println("Min Val : " + min);
    return max;
    }
}

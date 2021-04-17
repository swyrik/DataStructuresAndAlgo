package com.rtc.datastructures;

import java.util.Arrays;

public class SecondDistinctMaxElement {

    public static void main(String[] args) {
        int arr[] = {3,3,4,5,6,77,8,88,88};
        int ele = secondDistMaxEle(arr);
        System.out.println(ele);
    }

    private static int secondDistMaxEle(int[] arr) {

        Arrays.sort(arr);

        int max = arr[arr.length-1];
        for (int i = arr.length-1; i >=0 ; i--) {
            if(max != arr[i]){
                return arr[i];
            }
        }

        return 0;
    }
}

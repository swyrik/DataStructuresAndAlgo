package com.rtc.datastructures.searching;

public class LinearSearch {

    public static void main(String[] args) {
        String[] strings = new String[]{"black widow","bucky","captain america","ironman","ms marvel","panther","sam","spiderman","strange"};
        System.out.println(linearSearch(strings, "sam"));
    }

    private static <T extends Comparable> int linearSearch(T[] arr, T data) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].compareTo(data) == 0){
                return i;
            }
        }
        return -1;
    }
}

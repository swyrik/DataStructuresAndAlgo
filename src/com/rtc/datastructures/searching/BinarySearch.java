package com.rtc.datastructures.searching;

public class BinarySearch {

    public static void main(String[] args) {
        String[] strings = new String[]{"black widow","bucky","captain america","ironman","ms marvel","panther","sam","spiderman","strange"};
        System.out.println(binarySearch(strings, "strange", 0 , strings.length-1));
    }

    private static <T extends Comparable> Integer binarySearch(T[] arr,T data , int firstIndex, int lastIndex){
        if(firstIndex > lastIndex){
            return -1;
        }
        int midIndex = (lastIndex+firstIndex)/2;
        int compareValue = arr[midIndex].compareTo(data);
        if(compareValue == 0){
            return midIndex;
        }else if(compareValue > 0){
           return binarySearch(arr, data, firstIndex, midIndex-1);
        }else if(compareValue < 0){
           return binarySearch(arr, data, midIndex+1, lastIndex);
        }

        return -1;
    }
}

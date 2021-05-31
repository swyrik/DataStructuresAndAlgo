package com.rtc.datastructures.sorting;

public class ShellSort {

    private static <T> void swap(T[] arr, int iIndex, int jIndex){
        T temp = arr[jIndex];
        arr[jIndex] = arr[iIndex];
        arr[iIndex] = temp;
    }

    private static <T extends Comparable> void shellSort(T  [] arr){
        for (int interval = arr.length/2; interval > 0 ; interval = interval/2) {
            for(int j = interval; j< arr.length; j++){
                for (int i = 0;i + interval < arr.length; i++){
                    if(arr[i].compareTo(arr[i + interval]) > 0){
                        swap(arr, i+interval, i);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer[] integers = new Integer[]{23, 29, 15, 19, 31, 7, 9, 5, 2};
        shellSort(integers);
        printArr(integers);

        String[] marvelHeroes = new String[]{"ironman","captain america","black widow","ms marvel","panther","spiderman","strange","bucky","sam"};
        shellSort(marvelHeroes);
        printArr(marvelHeroes);
    }

    private static <T> void printArr(T[] integers) {
        for (T str: integers) {
            System.out.print(str+", ");
        }
        System.out.println();
    }

}

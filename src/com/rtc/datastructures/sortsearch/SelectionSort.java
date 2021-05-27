package com.rtc.datastructures.sortsearch;

public class SelectionSort {

    private static <T> void swap(T[] arr, int iIndex, int jIndex){
        T temp = arr[jIndex];
        arr[jIndex] = arr[iIndex];
        arr[iIndex] = temp;
    }

    private static  <T extends  Comparable> void selectionSort(T[] list){

        for (int i = 0; i < list.length; i++) {
            for (int j = i; j < list.length; j++) {

                if(list[i].compareTo(list[j])>0){
                    swap(list, i ,j );
                }

            }
        }

    }

    public static void main(String[] args) {
        String[] marvelHeroes = new String[]{"ironman","captain america","black widow","ms marvel","panther","spiderman","strange","bucky","sam"};
        selectionSort(marvelHeroes);
        for (String str: marvelHeroes) {
            System.out.print(str+", ");
        }
    }

}

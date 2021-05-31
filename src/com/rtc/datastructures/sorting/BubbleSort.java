package com.rtc.datastructures.sorting;

public class BubbleSort {

    private static <T> void swap(T[] data, int iIndex, int jIndex){
        T temp = data[iIndex];
        data[iIndex] = data[jIndex];
        data[jIndex] = temp;
    }

    private static <T extends Comparable> void bubblesort(T[] arr){
        int k = 0;

        for(int i=0; i<arr.length-k;i++){
            boolean swapped = false;
            for(int j = i+1; j<arr.length - k; j++){
                if(arr[i].compareTo(arr[j])>0){
                    swap(arr,i,j);
                    swapped = true;
                }
                i++;
            }
            if(!swapped){
                break;
            }
            i = 0;
            k++;
        }
    }

    public static void main(String[] args) {
        String[] marvelHeroes = new String[]{"ironman","captain america","black widow","ms marvel","panther","spiderman","strange","bucky","sam"};
        bubblesort(marvelHeroes);
        for (String str: marvelHeroes) {
            System.out.print(str+", ");
        }
    }

}

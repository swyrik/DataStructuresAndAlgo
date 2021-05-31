package com.rtc.datastructures.sorting;

import java.util.LinkedList;
import java.util.List;

public class InsertionSort {

    private static <T> void swapList(List<T> data, int iIndex, int jIndex){
        T temp = data.get(iIndex);
        data.set(iIndex,data.get(jIndex));
        data.set(jIndex, temp);
    }

    private static <T> void swapArray(T[] arr, int iIndex, int jIndex){
        T temp = arr[jIndex];
        arr[jIndex] = arr[iIndex];
        arr[iIndex] = temp;
    }

    private static <T extends Comparable> void insertionSortMy(T[] arr){
        List<T> list = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
            for(int j = 0; j<list.size(); j++){
                if(list.size()>1 && j< list.size() -1){
                    if(list.get(j).compareTo(list.get(j+1)) >0){
                        swapList(list, j,j+1);
                    }else{
                        break;
                    }
                }
            }
        }
        int count = 0;
        for (T t : list) {
          arr[count++] = t;
        }
    }

    private static <T extends Comparable> void insertionSort(T[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0 ; j--) {
                if(arr[j-1].compareTo(arr[j])>0){
                    swapArray(arr, j-1 , j);
                }else{
                    break;
                }
            }
        }

    }

    public static void main(String[] args) {
        String[] marvelHeroes = new String[]{"ironman","captain america","black widow","ms marvel","panther","spiderman","strange","bucky","sam"};
        insertionSort(marvelHeroes);
        for (String str: marvelHeroes) {
            System.out.print(str+", ");
        }
    }

}

package com.rtc.datastructures.sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {

    public static void main(String[] args) {
        String[] strings = new String[]{"ironman", "captain america", "black widow", "ms marvel", "panther", "spiderman", "strange", "bucky", "sam"};
        mergesort(strings, 0 ,8);
        printArr(strings);
    }

    private static <T extends  Comparable> void printArr(T[] strings){
        for (T str: strings) {
            System.out.print(str + " ");
        }
        System.out.println();
    }

    private static <T extends Comparable> void mergesort(T[] data, int firstIndex, int lastIndex){

        if(firstIndex <lastIndex){

            int midIndex = (firstIndex + lastIndex)/2;

            mergesort(data, firstIndex, midIndex);
            mergesort(data,  midIndex + 1, lastIndex);

            merge(data, firstIndex, midIndex, lastIndex);

        }

    }

    private static <T extends Comparable> void merge(T[] data, int firstIndex, int midIndex, int lastIndex) {


        List<T> firstList = new ArrayList<>();
        List<T> secondList = new ArrayList<>();

        int firstListSize = midIndex - firstIndex + 1;
        int lastListSize = lastIndex - midIndex;

        for (int m=0;m<firstListSize;m++){
            firstList.add(data[firstIndex + m]);
        }

        for (int n=0;n<lastListSize;n++){
            secondList.add(data[midIndex + 1 + n]);
        }

        int i =0, j =0 , k= firstIndex;

        while ( i< firstList.size() && j <secondList.size()){
            if(firstList.get(i).compareTo(secondList.get(j)) <= 0){
                data[k++]= firstList.get(i++);
            }else{
                data[k++]=secondList.get(j++);
            }
        }

        for(; i<firstListSize;){
           data[k++]= firstList.get(i++);
        }

        for(; j<lastListSize;){
            data[k++]= secondList.get(j++);
        }
        printArr(data);
    }

}

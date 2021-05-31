package com.rtc.datastructures.sorting;

public class MergeTwoArrays {

    public static void main(String[] args) {

        Integer[] a = {2, 5, 7, 88, 101};
        Integer[] b = {1, 6, 9, 80, 121};
        Integer[] c = new Integer[10];
        merge(c, a, b);
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }

    }

    private static <T extends Comparable> void merge(T[] finalArray, T[] firstArray, T[] secondArray) {

        int firstLength = firstArray.length;
        int secondLength = secondArray.length;
        int i = 0, j = 0, k = 0;
        while (i < firstLength && j < secondLength) {
            if (firstArray[i].compareTo(secondArray[j]) <= 0) {
                finalArray[k++] = firstArray[i++];
            } else {
                finalArray[k++] = secondArray[j++];
            }
        }


        for (; i < firstLength; i++) {
            finalArray[k] = firstArray[i];
        }


        for (; j < secondLength; j++) {
            finalArray[k] = secondArray[j];
        }

    }

}

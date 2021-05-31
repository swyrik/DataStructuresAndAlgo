package com.rtc.datastructures.sorting;

public class QuickSort {

    public static void main(String[] args) {
        Integer[] integers = new Integer[]{23, 29, 15, 19, 31, 7, 9, 5, 2};
        quicksort(integers, 0, integers.length-1);
        printArr(integers);

        String[] strings = new String[]{"black widow","bucky","captain america","ironman","ms marvel","panther","sam","spiderman","strange","hawkeye","hulk","wanda","vision","nickfury","groot","starloard","gamora","thanos","thor","loki"};
        quicksort(strings, 0 ,strings.length-1);
        printArr(strings);

        Integer[] integers2 = new Integer[]{23, 29, -15, 19, 31, -7, 9, 5, 2};
        quicksort(integers2, 0, integers.length-1);
        printArr(integers2);

    }



    private static <T extends Comparable> void quicksort(T[] arr, int firstindex, int lastindex){
        if(firstindex<lastindex){
            int j = partition(arr, firstindex,lastindex);
            quicksort(arr, firstindex, j-1);
            quicksort(arr,  j + 1, lastindex);
        }
    }

    private static <T extends Comparable> int partition(T[] arr, int firstIndex ,int lastIndex){
        T pivot = arr[firstIndex];

        int i = firstIndex, j = lastIndex;

        while(i<j){
            do{
                i++;
            }while (pivot.compareTo(arr[i]) > 0 && i < j);

            while (pivot.compareTo(arr[j]) <= 0 && j>=i){
                j--;
            }

            if(i < j){
                swap(arr, i , j);
            }
        }

        swap(arr, firstIndex , j);
        return j;
    }

    private static <T> void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static <T> void printArr(T[] integers) {
        StringBuilder sb = new StringBuilder();
        for (T str: integers) {
            sb.append(str+", ");
        }
        sb.delete(sb.length()-2,sb.length());
        System.out.println(sb.toString());
    }
}

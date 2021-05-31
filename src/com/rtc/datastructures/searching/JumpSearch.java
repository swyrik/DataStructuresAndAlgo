package com.rtc.datastructures.searching;

public class JumpSearch {

    public static void main(String[] args) {
        String[] strings = new String[]{"black widow","bucky","captain america","gamora","groot","hawkeye","hulk","ironman","loki","ms marvel","nickfury","panther","sam","spiderman","starloard","strange","thanos","thor","vision","wanda"};
        System.out.println(jumpSearch(strings, "groot", (int) Math.abs(Math.sqrt(strings.length))));
    }

    private static <T extends  Comparable> int jumpSearch(T[] arr, T data, int jumplength) {
        int i = 0;
        while(data.compareTo(arr[i]) <= 0){
            i += jumplength;
            if (i>arr.length){
                break;
            }
        }

        for (int j = jumplength; j <arr.length ; j++) {
            if(data.compareTo(arr[j]) == 0){
                return j;
            }
        }


        return -1;
    }
}

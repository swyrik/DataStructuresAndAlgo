package com.rtc.leetcode;

//https://www.youtube.com/watch?v=fx3pXiZHx3M

import java.util.LinkedHashMap;
import java.util.Map;

public class GoogleHardSolution {

    public static void main(String[] args) {
//        printArray(findTheOriginalArray(new int[]{3,4,3,3,2,1}));
        printArray(findTheOriginalArray(new int[]{4,4,7,2,2,2,2,2,1}));
    }

    private static void printArray(int[] nums) {
        for (int num: nums) {
            System.out.print(num+", ");
        }
        System.out.println();
    }

    private static int[] findTheOriginalArray(int[] ints) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        int i = 1;
        int increment = 1;
        int max = Integer.MAX_VALUE;
        for (int num: ints) {

            int pos = max <= num ? (num + (increment)): num;
            if(max<=num){
                increment = increment + 1;
            }
            while(map.get(pos) != null){
                pos++;
            }
            max = Math.min(max, pos);
            map.put(pos, i++);
        }

        for (Map.Entry<Integer, Integer> entry: map.entrySet()){
            ints[entry.getKey()-1] =  entry.getValue();
        }

        return ints;
    }


}

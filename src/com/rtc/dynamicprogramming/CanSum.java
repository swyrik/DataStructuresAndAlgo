package com.rtc.dynamicprogramming;

import java.util.HashMap;
import java.util.Map;

public class CanSum {

    public static void main(String[] args){
        System.out.println(canSum(7, new int[]{2,3}, new HashMap<>()));
        System.out.println(canSum(7, new int[]{5,3,4,7}, new HashMap<>()));
        System.out.println(canSum(7, new int[]{2,4}, new HashMap<>()));
        System.out.println(canSum(8, new int[]{2,3,5}, new HashMap<>()));
        System.out.println(canSum(300, new int[]{7,14,6,8}, new HashMap<>()));
    }

    private static boolean canSum(int targetNum, int[] arr, Map<Integer, Boolean> map){
        if(map.containsKey(targetNum)){
            return map.get(targetNum);
        }

        if(targetNum == 0){
            return true;
        }

        if(targetNum < 0){
            return false;
        }

        for (int num: arr) {
            int newTargetNum = targetNum - num;
            map.put(newTargetNum, canSum(newTargetNum, arr, map));
            if(map.get(newTargetNum)){
                return true;
            }
        }

        return false;
    }
}

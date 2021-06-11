package com.rtc.dynamicprogramming;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class HowSum {

    public static void main(String[] args){
        System.out.println(canSum(7, new int[]{2,3}, new LinkedList<Integer>(), new HashMap<>()));
        System.out.println(canSum(7, new int[]{5,3,4,7}, new LinkedList<Integer>(), new HashMap<>()));
        System.out.println(canSum(7, new int[]{2,4}, new LinkedList<Integer>(), new HashMap<>()));
        System.out.println(canSum(8, new int[]{5,3,2}, new LinkedList<Integer>(), new HashMap<>()));
        System.out.println(canSum(300, new int[]{7,14}, new LinkedList<Integer>(), new HashMap<>()));
    }

    private static List<Integer> canSum(int targetNum, int[] arr, List<Integer> list, Map<Integer, List<Integer>> map){
        if(map.containsKey(targetNum)){
            list.remove(list.size()-1);
            return map.get(targetNum);
        }

        if(targetNum == 0){
            return list;
        }

        if(targetNum < 0){
            list.remove(list.size()-1);
            return null;
        }

        for (int num: arr) {
            int newTargetNum = targetNum - num;
            list.add(num);
            List<Integer> newList = canSum(newTargetNum, arr, list, map);
            map.put(newTargetNum, newList);
            if(null != newList){
                return newList;
            }
        }
        if(list.size() > 0)
            list.remove(list.size()-1);
        return null;
    }
}

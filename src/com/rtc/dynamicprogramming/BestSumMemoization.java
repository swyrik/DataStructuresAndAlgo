package com.rtc.dynamicprogramming;

import java.util.*;

public class BestSumMemoization {


    public static void main(String[] args) {
        System.out.println(bestSum(7, new Integer[]{5, 3, 4, 7}, new HashMap<>()));
        System.out.println(bestSum(8, new Integer[]{2, 3, 5}, new HashMap<>()));
        System.out.println(bestSum(8, new Integer[]{1, 4, 5}, new HashMap<>()));
        System.out.println(bestSum(100, new Integer[]{25, 5, 2, 1}, new HashMap<>()));

    }

    private static List<Integer> bestSum(int targetNum, Integer[] nums, Map<Integer, List<Integer>> map) {

        if(map.containsKey(targetNum)){
            return map.get(targetNum);
        }

        if (targetNum == 0) {
            return new LinkedList<>();
        }

        if (targetNum < 0) {
            return null;
        }

        List<Integer> shortestList = null;

        for (Integer num : nums) {
            int newTargetNum = targetNum - num;
            List<Integer> newTargetList = bestSum(newTargetNum, nums, map);
            if (null != newTargetList) {
                List<Integer> list = new LinkedList<>();
               list.addAll(newTargetList);
                list.add(num);
                if (null == shortestList || list.size() < shortestList.size()) {
                    shortestList = list;
                }
            }
        }

         map.put(targetNum, shortestList);
            return shortestList;
    }


}

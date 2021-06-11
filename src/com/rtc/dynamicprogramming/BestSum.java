package com.rtc.dynamicprogramming;

import java.util.*;

public class BestSum {


    public static void main(String[] args) {
        System.out.println(bestSum(7, new Integer[]{5,3,4,7}));
        System.out.println(bestSum(8, new Integer[]{2,3,5}));
        System.out.println(bestSum(8, new Integer[]{1,4,5}));
        System.out.println(bestSum(100, new Integer[]{25,5,2,1}));

    }

    private static List<Integer> bestSum(int targetNum, Integer[] nums ){
        if(targetNum == 0){
            return new LinkedList<>();
        }

        if(targetNum < 0){
            return null;
        }

        List<Integer> shortestList = null;

        for (Integer num: nums) {
            int newTargetNum = targetNum - num;
            List<Integer> newTargetList = bestSum(newTargetNum, nums);
            if(null != newTargetList){
                List<Integer> list = new LinkedList<>();
                Collections.copy(list, newTargetList);
                list.add(num);
                if( null == shortestList || list.size() < shortestList.size()){
                    shortestList = list;
                }
            }
        }

        return shortestList;

    }

}

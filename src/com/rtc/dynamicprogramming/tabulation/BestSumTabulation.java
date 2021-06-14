package com.rtc.dynamicprogramming.tabulation;

import java.util.LinkedList;
import java.util.List;

public class BestSumTabulation {
    public static void main(String[] args) {

        System.out.println(bestSum(7, new Integer[]{5,3,4}));
        System.out.println(bestSum(7, new Integer[]{2,3,7}));
        System.out.println(bestSum(300, new Integer[]{7,14}));
        System.out.println(bestSum(8, new Integer[]{2,3,5}));

    }

    private static List<Integer> bestSum(int n, Integer[] nums){
        //initialize array
        List<List<Integer>> table = new LinkedList<>();
        table.add(new LinkedList<>());
        for (int i = 1; i <= n+1 ; i++) {
            table.add(null);
        }

        for (int i = 0; i <= n ; i++) {
            for (Integer num: nums){
                if(null != table.get(i) && i + num <= n){
                    if(null == table.get(i + num)){
                        List<Integer> subList = new LinkedList<>();
                        subList.add(num);
                        subList.addAll(table.get(i));
                        table.set(i+num, subList);
                    }else{
                        List<Integer> integers = table.get(i + num);
                        List<Integer> subList = new LinkedList<>();
                        subList.addAll(table.get(i));
                        subList.add(num);
                        if(integers.size() > subList.size()){
                            table.set(i+num, subList);
                        }
                    }
                }
            }
        }

        return table.get(n);
    }

}

package com.rtc.dynamicprogramming.tabulation;

import java.util.LinkedList;
import java.util.List;

public class HowSumTabulation {
    public static void main(String[] args) {
        System.out.println(howSum(7, new Integer[]{5,3,4}));
        System.out.println(howSum(7, new Integer[]{2,3,7}));
        System.out.println(howSum(300, new Integer[]{7,14}));
        System.out.println(howSum(8, new Integer[]{2,3,5}));
//        0, null, 2,     3,      2,2,      2,3,   null,  7
    }

    private static List<Integer> howSum(int n, Integer[] arr){
        List<List<Integer>> table = new LinkedList<>();
        table.add(new LinkedList<>());
        for (int i = 1; i <=n; i++) {
            table.add(null);
        }
        for (int i = 0; i <= n; i++) {
            for (Integer num: arr) {
                if (null != table.get(i) && i+num <= n ){
                    if(null == table.get(i+num)){
                        List<Integer> subList = new LinkedList<>();
                        subList.add(num);
                        table.set(i+num, subList);
                    }else{
                        List<Integer> subList = table.get(i + num);
                        subList.add(num);
                        table.set(i+num, subList);
                    }
                }
            }

            // this is to break out early
            if(table.get(n) != null && n == table.get(n).stream().reduce(0, (a, b) -> a+b)){
                break;
            }
        }
        return table.get(n);
    }
}

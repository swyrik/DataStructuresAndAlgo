package com.rtc.dynamicprogramming;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
Say I gave you a target of 8 and numbers [5,4,1]. The first solution that a pure depth first would return
would be the sum using [5,1,1,1]. However, the correct answer is [4,4].
What you are suggesting is the largest-first greedy solution, but that is only a winning strategy when
the numbers share a common factor (such as the US coinage [1, 5, 10, 25] that shares a mutual factor of 5).
The greedy solution may not satisfy any arbitrary numbers given. Hope that clarifies! -Alvin
 */

public class BestSumLargestFirstGreedySolution {

        public static void main(String[] args){
        System.out.println(bestSum(7, new int[]{5,3,4,7}, new LinkedList<Integer>(), new HashMap<>()));
        System.out.println(bestSum(8, new int[]{2,3,5}, new LinkedList<Integer>(), new HashMap<>()));
        System.out.println(bestSum(8, new int[]{1,4,5}, new LinkedList<Integer>(), new HashMap<>()));
        System.out.println(bestSum(100, new int[]{1,2,5,25}, new LinkedList<Integer>(), new HashMap<>()));
    }

    private static List<Integer> bestSum(int targetNum, int[] arr, List<Integer> list, Map<Integer, List<Integer>> map){
        Integer[] collect = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(collect, (c1,c2) -> c2.compareTo(c1));
        return bestSumSorted(targetNum, collect, list, map);
    }

        private static List<Integer> bestSumSorted(int targetNum, Integer[] arr, List<Integer> list, Map<Integer, List<Integer>> map){
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
            List<Integer> newList = bestSumSorted(newTargetNum, arr, list, map);
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

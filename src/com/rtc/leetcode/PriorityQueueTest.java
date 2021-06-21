package com.rtc.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTest {


    public static void main(String[] args) {
        printArray(slidingWindowMax(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3));
        printArray(slidingWindowMax(new int[]{1}, 1));
        printArray(slidingWindowMax(new int[]{1,-1}, 1));
        printArray(slidingWindowMax(new int[]{9,11}, 1));
        printArray(slidingWindowMax(new int[]{4,-2}, 2));
        printArray(slidingWindowMax(new int[]{7,2,4}, 2));
        printArray(slidingWindowMax(new int[]{1,3,1,2,0,5}, 3));
    }

    private static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + ", ");
        }
        System.out.println();
    }


    private static int[] slidingWindowMax(int[] nums, int k) {

        if (k > nums.length || null == nums || nums.length == 0) {
            return null;
        }

        if (k == 1) {
            return nums;
        }
        List<Integer> solution = new ArrayList<>();

        PriorityQueue<Integer> pQueue = new PriorityQueue<>((c1,c2) -> c2.compareTo(c1));
        for (int i = 0; i < nums.length; i++) {
            if(i < k - 1){
                pQueue.add(nums[i]);
            }else{
                pQueue.add(nums[i]);
                solution.add(pQueue.peek());
                pQueue.remove(nums[i-k + 1]);
            }

        }

        return solution.stream().mapToInt(i->i).toArray();


    }

}

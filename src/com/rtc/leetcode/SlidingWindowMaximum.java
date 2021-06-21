package com.rtc.leetcode;

public class SlidingWindowMaximum {

    public static void main(String[] args) {
        printArray(slidingWindowMax(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3));
        printArray(slidingWindowMax(new int[]{1}, 1));
        printArray(slidingWindowMax(new int[]{1,-1}, 1));
        printArray(slidingWindowMax(new int[]{9,11}, 1));
        printArray(slidingWindowMax(new int[]{4,-2}, 2));
        printArray(slidingWindowMax(new int[]{7,2,4}, 2));
        printArray(slidingWindowMax(new int[]{1,3,1,2,0,5}, 3));
    }

    private static int[] slidingWindowMax(int[] nums, int k) {

        if (k > nums.length || null == nums || nums.length == 0) {
            return null;
        }

        if (k == 1) {
            return nums;
        }
        int[] solution = new int[nums.length - k + 1];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            max = Math.max(max, nums[i]);
        }
        solution[0] = max;

        for (int i = 1; i <= nums.length - k; i++) {
            int kval = i + k - 1;
            if (max == nums[i - 1]) {
                max = maxOfGivenArr(nums, i, kval);
            } else {
                max = Math.max(max, nums[kval]);
            }
            solution[i] = max;
        }

        return solution;


    }

    private static int maxOfGivenArr(int[] nums, int start, int end) {
        int max = Integer.MIN_VALUE;
        for (int i = start; i <= end; i++) {
            max = Math.max(max, nums[i]);
        }
        return max;
    }


    private static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + ", ");
        }
        System.out.println();
    }

}

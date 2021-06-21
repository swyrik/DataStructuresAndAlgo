package com.rtc.leetcode;

/*
Given an array of integers heights representing the histogram's bar height where the width of each bar is 1, return the area of the largest rectangle in the histogram.

Example 1:

Input: heights = [2,1,5,6,2,3]
Output: 10
Explanation: The above is a histogram where width of each bar is 1.
The largest rectangle is shown in the red area, which has an area = 10 units.

Example 2:

Input: heights = [2,4]
Output: 4

Constraints:

1 <= heights.length <= 105
0 <= heights[i] <= 104
 */

import java.util.Stack;

public class LargestRectangleAreaInHistogram {

    public static void main(String[] args) {
        System.out.println(largestRectangleArea(new int[]{2,1,5,6,2,3})); //10
        System.out.println(largestRectangleArea(new int[]{6,2,5,4,5,2})); //12
        System.out.println(largestRectangleArea(new int[]{2,4})); //4
        System.out.println(largestRectangleArea(new int[]{1, 1})); //2
        System.out.println(largestRectangleArea(new int[]{3,6,5,7,4,8,1,0})); //20
        System.out.println(largestRectangleArea(new int[]{4,2,0,3,2,5})); //6


        System.out.println(largestRectAreaStack(new int[]{2,1,5,6,2,3})); //10
        System.out.println(largestRectAreaStack(new int[]{6,2,5,4,5,2})); //12
        System.out.println(largestRectAreaStack(new int[]{2,4})); //4
        System.out.println(largestRectAreaStack(new int[]{1, 1})); //2
        System.out.println(largestRectAreaStack(new int[]{3,6,5,7,4,8,1,0})); //20
        System.out.println(largestRectAreaStack(new int[]{4,2,0,3,2,5})); //6

    }

    public static int largestRectangleArea(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }
        int[] lessFromLeft = new int[height.length]; // idx of the first bar the left that is lower than current
        int[] lessFromRight = new int[height.length]; // idx of the first bar the right that is lower than current
        lessFromRight[height.length - 1] = height.length;
        lessFromLeft[0] = -1;

        for (int i = 1; i < height.length; i++) {
            int p = i - 1;

            while (p >= 0 && height[p] >= height[i]) {
                p = lessFromLeft[p];
            }
            lessFromLeft[i] = p;
        }

        for (int i = height.length - 2; i >= 0; i--) {
            int p = i + 1;

            while (p < height.length && height[p] >= height[i]) {
                p = lessFromRight[p];
            }
            lessFromRight[i] = p;
        }

        int maxArea = 0;
        for (int i = 0; i < height.length; i++) {
            maxArea = Math.max(maxArea, height[i] * (lessFromRight[i] - lessFromLeft[i] - 1));
        }

        return maxArea;
    }

    public static int largestRectAreaStack(int[] height){
        //base cases
        if(null != height && height.length == 0){
            return 0;
        }

        if(height.length == 1){
            return height[0];
        }

        Stack<Integer> positions = new Stack<>();
        Stack<Integer> heights = new Stack<>();

        int maxArea = Integer.MIN_VALUE;
        int tempPos = Integer.MIN_VALUE;
        int i = 0;
        for (; i < height.length; i++) {
            int currentHeight =height[i];
            if( heights.isEmpty() || currentHeight > heights.peek()){
                positions.push(i);
                heights.push(currentHeight);
            }else if(currentHeight < heights.peek()){
                while( heights.size() > 0 &&  currentHeight < heights.peek()){
                    tempPos = positions.pop();
                    maxArea = Math.max(heights.pop() * ( i - tempPos), maxArea);
                }
                heights.push(currentHeight);
                positions.push(tempPos);
            }

        }

        while(heights.size() > 0){
            tempPos = positions.pop();
            maxArea = Math.max(heights.pop() * ( i - tempPos), maxArea);
        }


        return maxArea;
    }

}

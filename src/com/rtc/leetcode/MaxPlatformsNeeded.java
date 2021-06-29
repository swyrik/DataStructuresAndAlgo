package com.rtc.leetcode;

import java.util.Arrays;

public class MaxPlatformsNeeded {

    public static void main(String[] args) {
        int[] arrivals = new int[]{90, 94, 95 , 110, 150, 180};
        int[] departures = new int[]{91, 120, 112 , 113, 190, 200};
        int platforms = maxPlatformsNeeded(arrivals, departures);
        System.out.println(platforms);

    }

    private static int maxPlatformsNeeded(int[] arrivals, int[] departures) {

        int max = 0;
        int count = 0;
        Arrays.sort(arrivals);
        Arrays.sort(departures);
        int i = 0;
        int j = 0;
        while (i < arrivals.length && j < departures.length){
            if(arrivals[i] <= departures[j]){
                 count++;
                 i++;
            }else{
                count--;
                j++;
            }
            max = Math.max(max, count);
        }
        return max;
    }


}

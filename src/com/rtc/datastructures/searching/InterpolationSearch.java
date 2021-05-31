package com.rtc.datastructures.searching;

public class InterpolationSearch {


        public static void main (String[] args){
        Integer[] strings = new Integer[]{10,20,50,70,80,90,110,120,130,135,140,150,160,175};
        System.out.println(interpolationSearch(strings, 20, 0, strings.length - 1));
    }

        private static Integer interpolationSearch(Integer[] arr, Integer data ,int firstIndex, int lastIndex)
        {
            if (firstIndex > lastIndex) {
                return -1;
            }
            int midIndex = firstIndex + ((data - arr[firstIndex]) * (lastIndex - firstIndex)) / (arr[lastIndex] - arr[firstIndex]);
            if(midIndex > lastIndex){
                return -1;
            }
            int compareValue = arr[midIndex].compareTo(data);
            if (compareValue == 0) {
                return midIndex;
            } else if (compareValue > 0) {
                return interpolationSearch(arr, data, firstIndex, midIndex - 1);
            } else if (compareValue < 0) {
                return interpolationSearch(arr, data, midIndex + 1, lastIndex);
            }

            return -1;

        }
    }

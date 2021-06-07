package com.rtc.datastructures.solutions;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {

    public static void main(String[] args) {
        String str = "I am preethi";
        String[] split = str.split("\\s");
        String collect = Stream.of(split).map(x -> new StringBuilder(x).reverse()).collect(Collectors.joining(" "));
        System.out.println(collect);
    }
}

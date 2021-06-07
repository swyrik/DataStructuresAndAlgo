package com.rtc.datastructures.solutions;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class PrintThirdNonRepeatingCharInString {
    public static void main(String[] args) {
        String str = "preethi";
        Map<Character, Integer> lhm = new LinkedHashMap<>();
        str.chars().mapToObj(x -> (char)x).forEach(ch -> {
            lhm.put(ch, lhm.get(ch) != null ? lhm.get(ch) + 1: 1);
        });
        AtomicInteger index = new AtomicInteger(0);
        lhm.keySet().forEach(x -> {
            if(lhm.get(x) == 1){
                index.incrementAndGet();
            }

            if(index.get()==3){
                System.out.println(x);
            }

        });

    }

}

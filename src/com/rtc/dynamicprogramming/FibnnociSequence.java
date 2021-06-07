package com.rtc.dynamicprogramming;

import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

public class FibnnociSequence {

    public static void main(String[] args) {
        Map<Integer, Double> map = new HashMap<>();
//        System.out.println(fib(6,map));
//        System.out.println(fib(7,map));
//        System.out.println(fib(8,map));
        Instant before = Instant.now();
        System.out.println(fib(99,map));
        Instant after = Instant.now();
        System.out.println(Duration.between(before, after).toMillis());
    }

    public static double fib(int n, Map<Integer, Double> map){
        if(map.containsKey(n)){
            return map.get(n);
        }

        if(n<=2)
            return 1;

        map.put(n, fib(n-1, map)+fib(n-2, map));
        return map.get(n);
    }
}

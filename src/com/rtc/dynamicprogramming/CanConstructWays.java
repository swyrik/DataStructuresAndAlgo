package com.rtc.dynamicprogramming;

import java.util.HashMap;
import java.util.List;

public class CanConstructWays {
    public static void main(String[] args) {
        System.out.println(canConstructWays("purple", new String[]{"purp","p","ur","le","purpl"}, new HashMap<String, Integer>()));
    }

    private static int canConstructWays(String targetString, String[] strings, HashMap<String, Integer> map) {

        if(map.containsKey(targetString)){
            return map.get(targetString);
        }

        if(null != targetString && targetString.isEmpty()){
            return 1;
        }

        int count = 0 ;

        for (String str: strings) {
            String subStr = "";
            if(null != targetString && targetString.startsWith(str)){
                subStr = targetString.substring(str.length(), targetString.length());
                count += canConstructWays(subStr, strings, map);
                map.put(subStr, count);

            }
        }

        return count;

    }
}

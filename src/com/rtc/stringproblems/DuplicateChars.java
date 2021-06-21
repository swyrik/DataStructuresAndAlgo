package com.rtc.stringproblems;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class DuplicateChars {

    public static void main(String[] args) {
        String str = "mahendar";

        char[] chars = str.toCharArray();



        Map<Character, Integer> map = new LinkedHashMap<>();
        for (Character newChar: chars) {
            map.put(newChar, map.get(newChar) != null ? map.get(newChar) + 1 : 1); //a , 1
        }
        for (Map.Entry<Character, Integer> mm: map.entrySet()){
            if(mm.getValue() == 1 ){
                System.out.println(mm.getKey());
                break;
            }
        }

    }
}

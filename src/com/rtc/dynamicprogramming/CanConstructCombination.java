package com.rtc.dynamicprogramming;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class CanConstructCombination {

    public static void main(String[] args) {
        System.out.println(canConstructCombinations("purple", new String[]{"purp","p","ur","le","purpl"},new LinkedList<LinkedList<String>>(), new HashMap<String, List<LinkedList<String>>>(), new LinkedList<String>()));
    }

    private static List<LinkedList<String>> canConstructCombinations(String targetString, String[] strings, LinkedList<LinkedList<String>> lists, HashMap<String, List<LinkedList<String>>> map, LinkedList<String> list) {
        if(map.containsKey(targetString)){
           return map.get(targetString);
        }

        if(null != targetString && targetString.length() == 0){
            lists.add(list);
            return lists;
        }

        for (String str: strings) {
            String subStr = "";
            if (targetString.startsWith(str)){
                subStr = targetString.substring(str.length(), targetString.length());
                list.add(str);
                canConstructCombinations(subStr, strings, lists, map, list);

            }

        }
        map.put(targetString, lists);
        list = new LinkedList<>();

        return lists;
    }
}

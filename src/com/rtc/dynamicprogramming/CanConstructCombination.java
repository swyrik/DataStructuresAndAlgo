package com.rtc.dynamicprogramming;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CanConstructCombination {

    public static void main(String[] args) {

        System.out.println(canConstructCombinations("purple", new String[]{"purp","p","ur","le","purpl"}, new LinkedList<>(), new LinkedList<>(),  new HashMap<>()));
        System.out.println(canConstructCombinations("abcdef", new String[]{"ab","abc","cd","def","abcd","ef","c"}, new LinkedList<>(), new LinkedList<>(), new HashMap<>()));
        System.out.println(canConstructCombinations("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaz", new String[]{"a","aa","aaa","aaaa","aaaaa"}, new LinkedList<>(), new LinkedList<>(), new HashMap<>()));

    }

    private static List<List<String>> canConstructCombinations(String targetString, String[] strings, List<List<String>> list, List<String> tempList, Map<String, List<List<String>>> map) {
        if(map.containsKey(targetString)){
            return map.get(targetString);
        }

        if(targetString == null){
            return null;
        }

        if(targetString.equals("")){
            list.add(tempList);
            tempList = new LinkedList<>();
            return list;
        }

        for (String str: strings) {
            String subStr = "";
            if(targetString != null && targetString.startsWith(str)){
                String newTargetString = targetString.substring(str.length(), targetString.length());
                tempList.add(str);
                canConstructCombinations(newTargetString, strings, list, tempList, map);
                tempList = new LinkedList<>();
            }
        }
        map.put(targetString, list);

        return list;
    }
}

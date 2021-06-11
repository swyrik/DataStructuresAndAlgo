package com.rtc.dynamicprogramming;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CanConstruct {


    public static void main(String[] args){
        System.out.println(canConstruct("abcdef", new String[]{"ab","abc","cd","def","abcd"}, new LinkedList<String>(), new HashMap<>()));
        System.out.println(canConstruct("skateboard", new String[]{"bo","rd","ate","t","ska","sk","boar"}, new LinkedList<String>(), new HashMap<>()));
        System.out.println(canConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee", new String[]{"eeeeeee","ee","eee","eeee","eeeee","eeeeee"}, new LinkedList<String>(), new HashMap<>()));
    }

    private static List<String> canConstruct(String targetString, String[] arr, List<String> list, Map<String, List<String>> map){
        if(map.containsKey(targetString)){
            return map.get(targetString);
        }

        if(null != targetString && targetString.length() == 0){
            return list;
        }

        if(targetString == null){
            if(!list.isEmpty())
                list.remove(list.size()-1);

            return null;
        }

        for (String str: arr) {

            String subStr = null;
            if(targetString.startsWith(str)) {
                list.add(str);
                subStr = targetString.substring(str.length(), targetString.length());
            }

            List<String> newList = canConstruct(subStr, arr, list, map);
            map.put(subStr, newList);
            if(null != newList){
                return newList;
            }
        }

        if(list.size() > 0)
            list.remove(list.size()-1);

        return null;
    }

}

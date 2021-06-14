package com.rtc.dynamicprogramming.tabulation;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class AllConstructTabulation {
    public static void main(String[] args) {
        System.out.println(allConstruct("purple", new String[]{"purp", "p", "ur", "le", "purpl"}));
        System.out.println(allConstruct("abcdef", new String[]{"ab", "abc", "cd", "def", "abcd", "ef", "c"}));
        System.out.println(allConstruct("skateboard", new String[]{"bo", "rd", "ate", "t", "ska", "sk", "boar"})); //adding "a" in to the should give you true as result
    }

    private static List<List<String>> allConstruct(String targetString, String[] strings) {

        List<List<List<String>>> lists = new LinkedList<>();
        lists.add(new LinkedList<>());
        for (int i = 0; i <= targetString.length(); i++) {
            lists.add(null);
        }

        for (int i = 0; i <= targetString.length(); i++) {
            if (null != lists.get(i)) {
                for (String str : strings) {
                    if (targetString.startsWith(str, i) && i + str.length() <= targetString.length()) {
                        if (null != lists.get(i + str.length())) {
                            List<List<String>> preSubList = createlistDeepCopy(lists.get(i));
                            preSubList.stream().map(list -> list.add(str)).collect(Collectors.toList());
                            List<List<String>> lists1 = lists.get(i + str.length());
                            lists1.addAll(preSubList);
                        } else {
                            List<List<String>> preSubList = new LinkedList<>(lists.get(i));
                            if(!preSubList.isEmpty()){
                                preSubList.stream().map(list -> list.add(str)).collect(Collectors.toList());
                            }else{
                                List<String> subList = new LinkedList<>();
                                subList.add(str);
                                preSubList.add(subList);
                            }
                            lists.set(i + str.length(), preSubList);
                        }
                    }
                }
            }

        }
        return lists.get(targetString.length());
    }

    private static List<List<String>> createlistDeepCopy(List<List<String>> lists) {

        List<List<String>> parentList = new LinkedList<>();
        for (List<String> list : lists) {
            List<String> childList = new LinkedList<>();
            for (String str : list) {
                childList.add(str);
            }
            parentList.add(childList);
        }
        return parentList;
    }


}

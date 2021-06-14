package com.rtc.dynamicprogramming.tabulation;


public class CanConstructTabluation {
    public static void main(String[] args) {
        System.out.println(canConstruct("abcdef", new String[]{"ab", "abc", "cd", "def", "abcd"}));
        System.out.println(canConstruct("skateboard", new String[]{"bo", "rd", "ate", "t", "ska", "sk", "boar"})); //adding "a" in to the should give you true as result
        System.out.println(canConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee", new String[]{"eeeeeee", "ee", "eee", "eeee", "eeeee", "eeeeee"}));
    }

    private static boolean canConstruct(String targetString, String[] strs) {


        boolean[] table = new boolean[targetString.length() + 1];
        table[0] = true;

        for (int i = 0; i <= targetString.length(); i++) {
            if (table[i]) {
                for (String str : strs) {
                    if (targetString.substring(i, targetString.length()).startsWith(str)) {
                        table[i + str.length()] = true;
                    }
                }
            }
        }


        return table[targetString.length()];
    }
}

package com.rtc.dynamicprogramming.tabulation;

public class CanConstructWaysTabulation {
    public static void main(String[] args) {
        System.out.println(canConstructWays("purple", new String[]{"purp", "p", "ur", "le", "purpl"}));
        System.out.println(canConstructWays("abcdef", new String[]{"ab", "abc", "cd", "def", "abcd"}));
        System.out.println(canConstructWays("skateboard", new String[]{"bo", "rd", "ate", "t", "ska", "sk", "boar"})); //adding "a" in to the should give you true as result
        System.out.println(canConstructWays("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee", new String[]{"eeeeeee", "ee", "eee", "eeee", "eeeee", "eeeeee"}));
    }

    private static int canConstructWays(String targetString, String[] strings){

        int[] table= new int[targetString.length()+1];
        table[0] = 1;
        for (int i = 0; i <= targetString.length(); i++) {
            if(table[i] > 0){
                for (String str: strings) {
                    if(targetString.substring(i, targetString.length()).startsWith(str) && i + str.length() <= targetString.length()){
                        table[i+str.length()] += table[i];
                    }
                }
            }
        }


        return table[targetString.length()];
    }
}

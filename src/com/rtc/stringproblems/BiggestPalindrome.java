package com.rtc.stringproblems;

public class BiggestPalindrome {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
        System.out.println(longestPalindrome("cbbd"));
        System.out.println(longestPalindrome("a"));
        System.out.println(longestPalindrome("ac"));
    }

    public static String longestPalindrome(String s) {
        if( null == s || s.isEmpty()){
            return null;
        }

        StringBuilder sb = new StringBuilder(""+s.charAt(0));
        if(s.length() == 1){
             return sb.toString();
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int k = i;
            int j = s.indexOf(c, k+1);
            while (j > -1) {

                String substring = s.substring(k, j+1);
                if(substring.equals(new StringBuilder(substring).reverse().toString())){
                    if(sb.length() <= substring.length()){
                        sb = new StringBuilder(substring);
                    }
                }
                j = s.indexOf(j+1, c);
            }


        }

        return sb.toString();

    }

}

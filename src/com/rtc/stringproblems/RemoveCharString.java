package com.rtc.stringproblems;

import java.nio.charset.CharsetEncoder;

public class RemoveCharString {

    public static void main(String[] args) {
        String str = "applea";
        Character ch = 'l';
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == ch){
                System.out.println(str.substring(0, i) + str.substring(i+1));
            }
        }
    }
}

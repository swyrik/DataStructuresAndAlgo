package com.rtc.stringproblems;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RotationChars {

    public static void main(String[] args) {
        String str = "mahendar";
        String str2 = "hendarma";
        char[] chars = str.toCharArray();
        char[] chars1 = str2.toCharArray();

        String st = "123";

        System.out.println(34 + (Integer.parseInt(st) + ""  )+  11);


        Arrays.sort(chars);
        Arrays.sort(chars1);

        Boolean b = new Boolean("asasas");
        System.out.println(b);

        String newStr = new String(chars);
        String newStr1 = new String(chars1);

        if(newStr.equals(newStr1)){
            System.out.println(true);
        }


    }

}

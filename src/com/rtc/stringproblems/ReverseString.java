package com.rtc.stringproblems;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseString {

    public static void main(String[] args) {
        String str = "mahendar";

//        char[] chars = str.toCharArray();// m, a, h, e, n, d, a, r
//
//        for (int i = chars.length -1;  i >= 0 ; i--) {
//            System.out.print(chars[i]);
//        }
//        System.out.println();

        String newString = IntStream.range(0, str.length()).           // create index [0 .. s.length - 1]
                boxed().                               // the next step requires them boxed
                sorted(Collections.reverseOrder()).    // indices in reverse order
                map(i -> String.valueOf(str.charAt(i))). // grab each index's character
                collect(Collectors.joining());


        System.out.println(newString);

    }


}

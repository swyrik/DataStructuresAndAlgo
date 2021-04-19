package com.rtc.datastructures.stacks;

import java.util.*;

public class TestMatchingParanthesis {

    private static final Map<Character, Character> matchingParamMap = new HashMap<>();
    private static final Set<Character> openingParamSet = new HashSet<>();

    static {
        matchingParamMap.put(')','(');
        matchingParamMap.put(']','[');
        matchingParamMap.put('}','{');

        openingParamSet.addAll(matchingParamMap.values());
    }

    private static void checkMatchingParams(String input){
        try{
            Stack<Character> parentStack = new Stack<>();
            for (int i = 0; i <input.length() ; i++) {
                char ch = input.charAt(i);
                if(openingParamSet.contains(ch)){
                    parentStack.push(ch);
                }
                if(matchingParamMap.containsKey(ch)){
                    Character lastSeenParen = parentStack.pop();
                    if(lastSeenParen != matchingParamMap.get(ch)){
                        System.out.println("\nInput : "+input +" contains a mismatched prenthesis at index "+i +"'"+ch+"'");
                        return;
                    }
                }


            }
            if(parentStack.isEmpty()){
                System.out.println("\nInput "+input+" has matching parenthesis");
            }else{
                System.out.println("\nInput "+ input +" has additional opening parenthesis");
            }

        }catch (Exception e){
            System.out.println("\n Input: "+input+" has additional closing parenthesis");
        }
    }

    public static void main(String[] args) {
//        checkMatchingParams("(a + b)");
//        checkMatchingParams("(a + b * {a * b})");
//        checkMatchingParams("(a + (b % d/5 + [a-b])* {a*b})");
        checkMatchingParams("{}({[[}99]})");
    }


}

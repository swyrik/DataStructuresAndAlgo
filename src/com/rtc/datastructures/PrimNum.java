package com.rtc.datastructures;

public class PrimNum {

    public static void main(String[] args) {
        System.out.println(isPrime(3));
        System.out.println(isPrime(39));

        System.out.println(isPrime(43));
    }

    public static boolean isPrime(int num){
        boolean isPrime = true;
        for(int i=2; i<num/2;i++){
            if(num %i == 0){
                return false;
            }
        }
        return isPrime;
    }
}

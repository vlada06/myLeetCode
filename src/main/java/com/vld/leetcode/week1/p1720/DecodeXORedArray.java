package com.vld.leetcode.week1.p1720;

public class DecodeXORedArray {
    public int[] decode(int[] encoded, int first) {
        int[] decoded = new int[encoded.length + 1];
        decoded[0] = first;
        for (int i = 0; i < encoded.length; i++) {
            decoded[i+1] = encoded[i] ^ decoded[i];
        }
        return decoded;
    }
//
//    public static void main(String[] args) {
//        System.out.println("true ^ true: " + (true ^ true));
//        System.out.println("false ^ true: " + (false ^ true));
//        System.out.println("true ^ false: " + (true ^ false));
//        System.out.println("false ^ false: " + (false ^ false));
//
//        System.out.println("1^1: " + (1^1));
//        System.out.println("3^3: " + (3^3));
//        System.out.println("0^3: " + (0^3));
//        System.out.println("0^3: " + (0^3));
//        System.out.println("3^0: " + (3^0));
//        System.out.println("0^0: " + (0^0));
//        System.out.println("3^1: " + (3^1));
//        System.out.println("1^3: " + (1^3));
//
//
//    }
}

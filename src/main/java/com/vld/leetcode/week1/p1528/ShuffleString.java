package com.vld.leetcode.week1.p1528;

public class ShuffleString {
    public String restoreString(String s, int[] indices) {
        char[] shuffled = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            shuffled[indices[i]] = s.charAt(i);
        }   
        return String.valueOf(shuffled);
    }
}

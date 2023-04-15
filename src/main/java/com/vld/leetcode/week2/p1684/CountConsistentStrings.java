package com.vld.leetcode.week2.p1684;

public class CountConsistentStrings {
    String allowed;

    public int countConsistentStrings(String allowed, String[] words) {
        this.allowed = allowed;
        int count = words.length;
        for (String word : words) {
            if (!isConsistent(word)) {
                count--;
            }
        }
        return count;
    }

    private boolean isConsistent(String word) {
        char[] charz = word.toCharArray();
        for (char c : charz) {
            if (!allowed.contains(String.valueOf(c))) {
                return false;
            }
        }
        return true;
    }
}

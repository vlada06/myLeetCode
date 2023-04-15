package com.vld.leetcode.week2.p1221;

/**
 * date: 16/01/2022
 * time: 17:54
 */

public class SplitIntoBalancedStrings {
    public int balancedStringSplit(String s) {
        int balance = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') {
                balance++;
            } else {
                balance--;
            }
            if (balance == 0) {
                count++;
            }
        }
        return count;
    }
}

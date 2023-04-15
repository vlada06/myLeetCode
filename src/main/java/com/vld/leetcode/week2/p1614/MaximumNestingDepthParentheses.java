package com.vld.leetcode.week2.p1614;

/**
 * date: 31/01/2022
 * time: 21:26
 */

public class MaximumNestingDepthParentheses {
    public int maxDepth(String s) {
        int maxDepth = 0;
        int tempDepth = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                tempDepth++;
                if (tempDepth > maxDepth) {
                    maxDepth = tempDepth;
                }
            } else if (chars[i] == ')') {
                if (tempDepth > 0) {
                    tempDepth--;
                }
            }
        }
        return maxDepth;
    }
}

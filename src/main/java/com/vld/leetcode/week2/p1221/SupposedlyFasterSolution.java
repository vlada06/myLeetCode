package com.vld.leetcode.week2.p1221;

/**
 * date: 16/01/2022
 * time: 18:09
 */

public class SupposedlyFasterSolution {
    public int balancedStringSplit(String s) {
        int n = s.length();
        int res = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == 'R')
                count++;
            else
                count--;
            if (count == 0)
                res++;
        }
        return res;
    }
}

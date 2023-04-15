package com.vld.leetcode.week1.p2114;

public class MaximumNumberOfWordsSolution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (String sentence : sentences) {
            max = sentence.split(" ").length > max ? sentence.split(" ").length  : max;
        }
        return max;
    }
}

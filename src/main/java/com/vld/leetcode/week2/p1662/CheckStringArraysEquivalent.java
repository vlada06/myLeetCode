package com.vld.leetcode.week2.p1662;

public class CheckStringArraysEquivalent {

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return concatenate(word1).equals(concatenate(word2));
    }

    private String concatenate(String[] wordz) {
        StringBuilder sb = new StringBuilder();
        for (String s : wordz) {
            sb.append(s);
        }
        return sb.toString();
    }
}

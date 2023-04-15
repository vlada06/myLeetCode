package com.vld.leetcode.week3.p1816;

public class SentenceTruncation {

    public String truncateSentence(String s, int k) {
        String[] tokens = s.split(" ");
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < k; i++) {
            sb.append(tokens[i])
                    .append(" ");

        }
        return sb.toString().trim();
    }

}

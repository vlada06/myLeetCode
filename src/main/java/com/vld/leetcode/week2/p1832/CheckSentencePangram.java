package com.vld.leetcode.week2.p1832;

public class CheckSentencePangram {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length() <26 )
            return false;
        int count = 0;
        for (int i = 97; i < 123; i++) {
            if (sentence.contains(String.valueOf((char) i))) {
                count++;
            }
        }
        return count == 26;
    }
}



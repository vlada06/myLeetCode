package com.vld.leetcode.week2.p1859;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class SortingSentence {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        Map<Integer, String> sortedSentence = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            sortedSentence.put(Integer.parseInt(words[i].substring(words[i].length() - 1)),
                    words[i].substring(0, words[i].length() - 1));
        }

        StringBuilder sb = new StringBuilder();

        for (Map.Entry<Integer, String> word : sortedSentence.entrySet()) {
            sb.append(word.getValue())
                    .append(" ");
        }
        return sb.toString().trim();
    }
}

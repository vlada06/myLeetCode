package com.vld.leetcode.week2.p1773;

import java.util.Arrays;
import java.util.List;

public class ItemsMatchingRule {

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        List<String> keys = Arrays.asList("type", "color", "name");
        int count = 0;

        for (List<String> item : items) {
            for (int i = 0; i < item.size(); i++) {
                if (keys.get(i).equals(ruleKey) && item.get(i).equals(ruleValue)) {
                    count++;
                }
            }
        }
        return count;
    }
}

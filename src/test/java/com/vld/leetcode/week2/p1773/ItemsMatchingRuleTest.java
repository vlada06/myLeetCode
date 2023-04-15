package com.vld.leetcode.week2.p1773;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ItemsMatchingRuleTest {
    ItemsMatchingRule itemsMatchingRule;

    @BeforeEach
    void setup() {
        itemsMatchingRule = new ItemsMatchingRule();
    }

    @Test
    void test1() {
        List<List<String>> inputItems = new ArrayList<>();
        List<String> item0 = Arrays.asList("phone", "blue", "pixel");
        List<String> item1 = Arrays.asList("computer", "silver", "lenovo");
        List<String> item2 = Arrays.asList("phone", "gold", "iphone");
        String ruleKey = "color", ruleValue = "silver";
        int expectedOutput = 1;
        inputItems.add(item0);
        inputItems.add(item1);
        inputItems.add(item2);
        assertEquals(expectedOutput, itemsMatchingRule.countMatches(inputItems, ruleKey, ruleValue));
    }

    @Test
    void test2() {
        List<List<String>> inputItems = new ArrayList<>();
        List<String> item0 = Arrays.asList("phone", "blue", "pixel");
        List<String> item1 = Arrays.asList("computer", "silver", "phone");
        List<String> item2 = Arrays.asList("phone", "gold", "iphone");
        String ruleKey = "type", ruleValue = "phone";
        int expectedOutput = 2;
        inputItems.add(item0);
        inputItems.add(item1);
        inputItems.add(item2);
        assertEquals(expectedOutput, itemsMatchingRule.countMatches(inputItems, ruleKey, ruleValue));
    }
}



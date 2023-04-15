package com.vld.leetcode.week2.p1221;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SplitIntoBalancedStringsTest {
    SplitIntoBalancedStrings splitIntoBalancedStrings;

    @BeforeEach
    void setUp() {
        splitIntoBalancedStrings = new SplitIntoBalancedStrings();
    }

    @Test
    void test1() {
        String input = "RLRRLLRLRL";
        assertEquals(4, splitIntoBalancedStrings.balancedStringSplit(input));
    }

    @Test
    void test2() {
        String input = "RLLLLRRRLR";
        assertEquals(3, splitIntoBalancedStrings.balancedStringSplit(input));
    }

    @Test
    void test3() {
        String input = "LLLLRRRR";
        assertEquals(1, splitIntoBalancedStrings.balancedStringSplit(input));
    }
}


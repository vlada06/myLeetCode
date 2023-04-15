package com.vld.leetcode.week2.p1614;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MaximumNestingDepthParenthesesTest {
    MaximumNestingDepthParentheses maximumNestingDepthParentheses;

    @BeforeEach
    void setUp() {
        maximumNestingDepthParentheses = new MaximumNestingDepthParentheses();
    }

    @Test
    void test1() {
        String input = "(1+(2*3)+((8)/4))+1";
        int expectedOutput = 3;
        assertEquals(expectedOutput, maximumNestingDepthParentheses.maxDepth(input));
    }

    @Test
    void test2() {
        String input = "(1)+((2))+(((3)))";
        int expectedOutput = 3;
        assertEquals(expectedOutput, maximumNestingDepthParentheses.maxDepth(input));
    }

    @Test
    void test3() {
        String input = "";
        int expectedOutput = 0;
        assertEquals(expectedOutput, maximumNestingDepthParentheses.maxDepth(input));
    }
}


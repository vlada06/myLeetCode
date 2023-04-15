package com.vld.leetcode.week1.p1929;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConcatenateArrayTest {
    ConcatenateArraySolution concatenateArraySolution;

    @BeforeEach
    void setup() {
        concatenateArraySolution = new ConcatenateArraySolution();
    }

    @Test
    void test1() {
        int[] input = {1, 2, 1};
        int[] actual = concatenateArraySolution.getConcatenation(input);
        int[] expected = {1, 2, 1, 1, 2, 1};
        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    void test2() {
        int[] input = {1, 3, 2, 1};
        int[] actual = concatenateArraySolution.getConcatenation(input);
        int[] expected = {1, 3, 2, 1, 1, 3, 2, 1};
        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }
}

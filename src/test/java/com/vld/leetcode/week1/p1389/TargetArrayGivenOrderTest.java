package com.vld.leetcode.week1.p1389;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TargetArrayGivenOrderTest {
    TargetArrayGivenOrder targetArrayGivenOrder;

    @BeforeEach
    void setUp() {
        targetArrayGivenOrder = new TargetArrayGivenOrder();
    }

    @Test
    void test1() {
        int[] inputNums = {0, 1, 2, 3, 4};
        int[] inputIndex = {0, 1, 2, 2, 1};
        int[] expectedOutput = {0, 4, 1, 3, 2};
        int[] actualOutput = targetArrayGivenOrder.createTargetArray(inputNums, inputIndex);
        for (int i = 0; i < actualOutput.length; i++) {
            assertEquals(expectedOutput[i], actualOutput[i]);
        }
    }

    @Test
    void test2() {
        int[] inputNums = {1, 2, 3, 4, 0};
        int[] inputIndex = {0, 1, 2, 3, 0};
        int[] expectedOutput = {0, 1, 2, 3, 4};
        int[] actualOutput = targetArrayGivenOrder.createTargetArray(inputNums, inputIndex);
        for (int i = 0; i < actualOutput.length; i++) {
            assertEquals(expectedOutput[i], actualOutput[i]);
        }
    }

    @Test
    void test3() {
        int[] inputNums = {1};
        int[] inputIndex = {0};
        int[] expectedOutput = {1};
        int[] actualOutput = targetArrayGivenOrder.createTargetArray(inputNums, inputIndex);
        assertEquals(expectedOutput[0], actualOutput[0]);
    }
}


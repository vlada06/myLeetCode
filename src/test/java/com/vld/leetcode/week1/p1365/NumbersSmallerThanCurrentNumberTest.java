package com.vld.leetcode.week1.p1365;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumbersSmallerThanCurrentNumberTest {
    NumbersSmallerThanCurrent numbersSmallerThanCurrent;

    @BeforeEach
    void setup() {
        numbersSmallerThanCurrent = new NumbersSmallerThanCurrent();
    }

    @Test
    void test1() {
        int[] inputNums = {8, 1, 2, 2, 3};
        int[] expectedOutput = {4, 0, 1, 1, 3};
        int[] actualOutput = numbersSmallerThanCurrent.smallerNumbersThanCurrent(inputNums);
        for (int i = 0; i < expectedOutput.length; i++) {
            assertEquals(expectedOutput[i], actualOutput[i]);
        }
    }

    @Test
    void test2() {
        int[] inputNums = {6, 5, 4, 8};
        int[] expectedOutput = {2, 1, 0, 3};
        int[] actualOutput = numbersSmallerThanCurrent.smallerNumbersThanCurrent(inputNums);
        for (int i = 0; i < expectedOutput.length; i++) {
            assertEquals(expectedOutput[i], actualOutput[i]);
        }
    }

    @Test
    void test3() {
        int[] inputNums = {7, 7, 7, 7};
        int[] expectedOutput = {0, 0, 0, 0};
        int[] actualOutput = numbersSmallerThanCurrent.smallerNumbersThanCurrent(inputNums);
        for (int i = 0; i < expectedOutput.length; i++) {
            assertEquals(expectedOutput[i], actualOutput[i]);
        }
    }
}



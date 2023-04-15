package com.vld.leetcode.week1.p1470;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShuffleArrayTest {
    ShuffleArraySolution shuffleArraySolution;

    @BeforeEach
    void setup() {
        shuffleArraySolution = new ShuffleArraySolution();
    }

    @Test
    void test1() {
        int[] inputNums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        int[] expectedOutput = {2, 3, 5, 4, 1, 7};
        int[] actualOutput = shuffleArraySolution.shuffle(inputNums, n);

        for (int i = 0; i < expectedOutput.length; i++) {
            assertEquals(expectedOutput[i], actualOutput[i]);
        }
    }

    @Test
    void test2() {
        int[] inputNums = {1, 2, 3, 4, 4, 3, 2, 1};
        int n = 4;
        int[] expectedOutput = {1,4,2,3,3,2,4,1};
        int[] actualOutput = shuffleArraySolution.shuffle(inputNums, n);

        for (int i = 0; i < expectedOutput.length; i++) {
            assertEquals(expectedOutput[i], actualOutput[i]);
        }
    }

    @Test
    void test3() {
        int[] inputNums = {1,1,2,2};
        int n = 2;
        int[] expectedOutput = {1,2,1,2};
        int[] actualOutput = shuffleArraySolution.shuffle(inputNums, n);

        for (int i = 0; i < expectedOutput.length; i++) {
            assertEquals(expectedOutput[i], actualOutput[i]);
        }
    }
}



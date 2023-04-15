package com.vld.leetcode.week1.p1480;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RunningArraySumTest {
    RunningArraySumSolution runningArraySumSolution;

    @BeforeEach
    void setup() {
        runningArraySumSolution = new RunningArraySumSolution();
    }

    @Test
    void test1() {
        int[] input = {1, 2, 3, 4};
        int[] expectedOutput = {1, 3, 6, 10};
        int[] actualOutput = runningArraySumSolution.runningSum(input);

        for (int i = 0; i < actualOutput.length; i++) {
            assertEquals(expectedOutput[i], actualOutput[i]);
        }
    }
// DefangIPAddressSolution
// DefangIPAddressTest

    @Test
    void test2() {
        int[] input = {1,1,1,1,1};
        int[] expectedOutput ={ 1,2,3,4,5};
        int[] actualOutput =runningArraySumSolution.runningSum(input);
    }

    @Test
    void test3() {
        int[] input = {3,1,2,10,1};
        int[] expectedOutput ={ 3,4,6,16,17};
        int[] actualOutput =runningArraySumSolution.runningSum(input);
    }
}

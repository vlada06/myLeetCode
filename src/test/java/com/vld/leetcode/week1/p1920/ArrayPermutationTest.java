package com.vld.leetcode.week1.p1920;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayPermutationTest {

    ArrayPermutationSolution arrayPermutationSolution;

    @BeforeEach
    void setup() {
        arrayPermutationSolution = new ArrayPermutationSolution();
    }

    @Test
    void test1() {
        int[] nums = {0, 2, 1, 5, 3, 4};
        int[] actual = arrayPermutationSolution.buildArray(nums);
        int[] expected = {0, 1, 2, 4, 5, 3};
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    void test2() {
        int[] nums = {5, 0, 1, 2, 3, 4};
        int[] actual = arrayPermutationSolution.buildArray(nums);
        int[] expected = {4, 5, 0, 1, 2, 3};
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }
}
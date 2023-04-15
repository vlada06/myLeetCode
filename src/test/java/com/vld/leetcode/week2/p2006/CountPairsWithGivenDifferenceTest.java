package com.vld.leetcode.week2.p2006;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountPairsWithGivenDifferenceTest {
    CountPairsWithGivenDifference countPairsWithGivenDifference;

    @BeforeEach
    void setup() {
        countPairsWithGivenDifference = new CountPairsWithGivenDifference();
    }


    @Test
    void test1() {

        int[] input = {1, 2, 2, 1};
        int k = 1;
        int expectedOutput = 4;

        assertEquals(expectedOutput, countPairsWithGivenDifference.countKDifference(input, k));
    }

    @Test
    void test2() {

        int[] input = {1, 3};
        int k = 3;
        int expectedOutput = 0;

        assertEquals(expectedOutput, countPairsWithGivenDifference.countKDifference(input, k));
    }

    @Test
    void test3() {

        int[] input = {3, 2, 1, 5, 4};
        int k = 2;
        int expectedOutput = 3;

        assertEquals(expectedOutput, countPairsWithGivenDifference.countKDifference(input, k));
    }
}



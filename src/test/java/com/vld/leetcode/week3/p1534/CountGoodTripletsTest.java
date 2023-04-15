package com.vld.leetcode.week3.p1534;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountGoodTripletsTest {
    CountGoodTriplets countGoodTriplets;

    @BeforeEach
    void setup() {
        countGoodTriplets = new CountGoodTriplets();
    }


    @Test
    void test1() {
        int[] inputArr = {3, 0, 1, 1, 9, 7};
        int a = 7, b = 2, c = 3;
        int expectedOutput = 4;
        assertEquals(expectedOutput, countGoodTriplets.countGoodTriplets(inputArr, a, b, c));
    }

    @Test
    void test2() {
        int[] inputArr = {1, 1, 2, 2, 3};
        int a = 0, b = 0, c = 1;
        int expectedOutput = 0;
        assertEquals(expectedOutput, countGoodTriplets.countGoodTriplets(inputArr, a, b, c));
    }
}



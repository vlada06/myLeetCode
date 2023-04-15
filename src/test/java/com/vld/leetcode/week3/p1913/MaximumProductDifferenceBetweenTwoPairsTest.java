package com.vld.leetcode.week2.p1913;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumProductDifferenceBetweenTwoPairsTest {
    MaximumProductDifferenceBetweenTwoPairs maximumProductDifferenceBetweenTwoPairs;

    @BeforeEach
    void setup() {
        maximumProductDifferenceBetweenTwoPairs = new MaximumProductDifferenceBetweenTwoPairs();
    }

    @Test
    void test1() {
        int[] inputNums = {5, 6, 2, 7, 4};
        assertEquals(34, maximumProductDifferenceBetweenTwoPairs.maxProductDifference(inputNums));
    }

    @Test
    void test2() {
        int[] inputNums = {4, 2, 5, 9, 7, 4, 8};
        assertEquals(64, maximumProductDifferenceBetweenTwoPairs.maxProductDifference(inputNums));
    }
}



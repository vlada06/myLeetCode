package com.vld.leetcode.week1.p1512;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class GoodPairsTest {
    GoodPairs goodPairs;

    @BeforeEach
    void setUp() {
        goodPairs = new GoodPairs() ;
    }

    @Test
    void test1() {
        int[] inputNums = {1,2,3,1,1,3};
        int actualOutput = goodPairs.numIdenticalPairs(inputNums);
        assertEquals(4, actualOutput);
    }

    @Test
    void test2() {
        int[] inputNums = {1,1,1,1};
        int actualOutput = goodPairs.numIdenticalPairs(inputNums);
        assertEquals(6, actualOutput);
    }

    @Test
    void test3() {
        int[] inputNums = {1,2,3};
        int actualOutput = goodPairs.numIdenticalPairs(inputNums);
        assertEquals(0, actualOutput);
    }

    @Test
    void test4() {
        int[] inputNums = {1,2,1};
        int actualOutput = goodPairs.numIdenticalPairs(inputNums);
        assertEquals(1, actualOutput);
    }
}


package com.vld.leetcode.week2.p1588;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SumAllOddLengthSubarraysTest {
    SumAllOddLengthSubarrays sumAllOddLengthSubarrays;

    @BeforeEach
    void setUp() {
        sumAllOddLengthSubarrays = new SumAllOddLengthSubarrays();
    }

    @Test
    void test0() {

        int[] inputArr = {1, 2, 3};
        int expectedOutput = 12;
        assertEquals(expectedOutput, sumAllOddLengthSubarrays.sumOddLengthSubarrays(inputArr));
    }

    @Test
    void test1() {

        int[] inputArr = {1, 4, 2, 5, 3};
        int expectedOutput = 58;
        assertEquals(expectedOutput, sumAllOddLengthSubarrays.sumOddLengthSubarrays(inputArr));
    }

    @Test
    void test2() {
        int[] inputArr = {1, 2};
        int expectedOutput = 3;
        assertEquals(expectedOutput, sumAllOddLengthSubarrays.sumOddLengthSubarrays(inputArr));
    }


    @Test
    void test3() {
        int[] inputArr = {10, 11, 12};
        int expectedOutput = 66;
        assertEquals(expectedOutput, sumAllOddLengthSubarrays.sumOddLengthSubarrays(inputArr));
    }


    @Test
    void test4() {

        int[] inputArr = {1, 2, 3};
        int expectedOutput = 12;
        assertEquals(expectedOutput, sumAllOddLengthSubarrays.sumOddLengthSubarraysMe2(inputArr));
    }

    @Test
    void test5() {

        int[] inputArr = {1, 4, 2, 5, 3};
        int expectedOutput = 58;
        assertEquals(expectedOutput, sumAllOddLengthSubarrays.sumOddLengthSubarrays(inputArr));
    }

    @Test
    void test6() {
        int[] inputArr = {1, 2};
        int expectedOutput = 3;
        assertEquals(expectedOutput, sumAllOddLengthSubarrays.sumOddLengthSubarrays(inputArr));
    }


    @Test
    void test7() {
        int[] inputArr = {10, 11, 12};
        int expectedOutput = 66;
        assertEquals(expectedOutput, sumAllOddLengthSubarrays.sumOddLengthSubarrays(inputArr));
    }


}


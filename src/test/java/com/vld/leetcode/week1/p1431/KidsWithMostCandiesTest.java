package com.vld.leetcode.week1.p1431;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class KidsWithMostCandiesTest {
    KidsWithMostCandies kidsWithMostCandies;

    @BeforeEach
    void setUp() {
        kidsWithMostCandies = new KidsWithMostCandies();
    }

    @Test
    void test1() {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        List<Boolean> expectedOutput = Arrays.asList(true, true, true, false, true);
        List actualOutput = kidsWithMostCandies.kidsWithCandies(candies, extraCandies);

        for (int i = 0; i < actualOutput.size(); i++) {
            assertEquals(expectedOutput.get(i), actualOutput.get(i));
        }
    }

    @Test
    void test2() {
        int[] candies = {4, 2, 1, 1, 2};
        int extraCandies = 1;
        List<Boolean> expectedOutput = Arrays.asList(true, false, false, false, false);
        List actualOutput = kidsWithMostCandies.kidsWithCandies(candies, extraCandies);

        for (int i = 0; i < actualOutput.size(); i++) {
            assertEquals(expectedOutput.get(i), actualOutput.get(i));
        }
    }

    @Test
    void test3() {
        int[] candies = {12, 1, 12};
        int extraCandies = 10;
        List<Boolean> expectedOutput = Arrays.asList(true, false, true);
        List actualOutput = kidsWithMostCandies.kidsWithCandies(candies, extraCandies);

        for (int i = 0; i < actualOutput.size(); i++) {
            assertEquals(expectedOutput.get(i), actualOutput.get(i));
        }
    }
}


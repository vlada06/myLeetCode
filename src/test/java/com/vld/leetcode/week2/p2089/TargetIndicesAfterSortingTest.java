package com.vld.leetcode.week2.p2089;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TargetIndicesAfterSortingTest {
    TargetIndicesAfterSorting targetIndicesAfterSorting;

    @BeforeEach
    void setup() {
        targetIndicesAfterSorting = new TargetIndicesAfterSorting();
    }


    @Test
    void test1() {
        int[] inputNums = {1, 2, 5, 2, 3};
        int target = 2;
        List<Integer> expectedOutput = Arrays.asList(1, 2);
        List<Integer> actualOutput = targetIndicesAfterSorting.targetIndices(inputNums, target);
        for (int i = 0; i < expectedOutput.size(); i++) {
            assertEquals(expectedOutput.get(i), actualOutput.get(i));
        }
    }

    @Test
    void test2() {
        int[] inputNums = {1, 2, 5, 2, 3};
        int target = 3;
        List<Integer> expectedOutput = Arrays.asList(3);
        List<Integer> actualOutput = targetIndicesAfterSorting.targetIndices(inputNums, target);
        assertEquals(expectedOutput.get(0), actualOutput.get(0));
    }

    @Test
    void test3() {
        int[] inputNums = {1, 2, 5, 2, 3};
        int target = 5;
        List<Integer> expectedOutput = Arrays.asList(4);
        List<Integer> actualOutput = targetIndicesAfterSorting.targetIndices(inputNums, target);
        for (int i = 0; i < expectedOutput.size(); i++) {
            assertEquals(expectedOutput.get(i), actualOutput.get(i));
        }
    }

    @Test
    void test4() {
        int[] inputNums = {1, 2, 5, 2, 3, 13, 3, 12, 3, 0, -1, 3};
        int target = 3;
        List<Integer> expectedOutput = Arrays.asList(5, 6, 7, 8);
        List<Integer> actualOutput = targetIndicesAfterSorting.targetIndices(inputNums, target);
        for (int i = 0; i < expectedOutput.size(); i++) {
            assertEquals(expectedOutput.get(i), actualOutput.get(i));
        }
    }
}

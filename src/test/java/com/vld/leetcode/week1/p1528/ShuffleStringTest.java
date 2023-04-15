package com.vld.leetcode.week1.p1528;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShuffleStringTest {
    ShuffleString shuffleString;

    @BeforeEach
    void setup() {
        shuffleString = new ShuffleString();
    }

    @Test
    void test1() {
        String inputString = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
        String expectedOutput = "leetcode";
        assertEquals(expectedOutput, shuffleString.restoreString(inputString, indices));
    }

    @Test
    void test2() {
        String inputString = "abc";
        int[] indices = {0, 1, 2};
        String expectedOutput = "abc";
        assertEquals(expectedOutput, shuffleString.restoreString(inputString, indices));
    }

    @Test
    void test3() {
        String inputString = "zola";
        int[] indices = {2, 3, 0, 1};
        String expectedOutput = "lazo";
        assertEquals(expectedOutput, shuffleString.restoreString(inputString, indices));
    }

    @Test
    void test4() {
        String inputString = "aaiougrt";
        int[] indices = {4, 0, 2, 6, 7, 3, 1, 5};
        String expectedOutput = "arigatou";
        assertEquals(expectedOutput, shuffleString.restoreString(inputString, indices));
    }
}



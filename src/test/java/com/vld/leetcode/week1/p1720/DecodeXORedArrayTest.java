package com.vld.leetcode.week1.p1720;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecodeXORedArrayTest {
    DecodeXORedArray decodeXORedArray;

    @BeforeEach
    void setup() {
        decodeXORedArray = new DecodeXORedArray();
    }

    @Test
    void test1() {
        int[] encoded = {1, 2, 3};
        int first = 1;
        int[] expectedOutput = {1, 0, 2, 1};
        int[] actualOutput = decodeXORedArray.decode(encoded, first);

        for (int i = 0; i < expectedOutput.length; i++) {
            assertEquals(expectedOutput[i], actualOutput[i]);
        }
    }

    @Test
    void test2() {
        int[] encoded = {6, 2, 7, 3};
        int first = 4;
        int[] expectedOutput = {4, 2, 0, 7, 4};
        int[] actualOutput = decodeXORedArray.decode(encoded, first);
        for (int i = 0; i < expectedOutput.length; i++) {
            assertEquals(expectedOutput[i], actualOutput[i]);
        }
    }
}



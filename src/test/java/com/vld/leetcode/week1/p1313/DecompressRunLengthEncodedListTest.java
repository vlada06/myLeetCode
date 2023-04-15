package com.vld.leetcode.week1.p1313;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecompressRunLengthEncodedListTest {
    DecompressRunLengthEncodedList decompressRunLengthEncodedList;

    @BeforeEach
    void setup() {
        decompressRunLengthEncodedList = new DecompressRunLengthEncodedList();
    }

    @Test
    void test1() {
        int[] inputNums = {1, 2, 3, 4};
        int[] expectedOutput = {2, 4, 4, 4};
        int[] actualOutput = decompressRunLengthEncodedList.decompressRLElist(inputNums);
        for (int i = 0; i < expectedOutput.length; i++) {
            assertEquals(expectedOutput[i], actualOutput[i]);
        }
    }

    @Test
    void test2() {
        int[] inputNums = {1, 1, 2, 3};
        int[] expectedOutput = {1, 3, 3};
        int[] actualOutput = decompressRunLengthEncodedList.decompressRLElist(inputNums);
        for (int i = 0; i < expectedOutput.length; i++) {
            assertEquals(expectedOutput[i], actualOutput[i]);
        }
    }


    @Test
    void test3() {
        int[] inputNums = {1, 2, 3, 4, 5, 6};
        int[] expectedOutput = {2, 4, 4, 4, 6, 6, 6, 6, 6};
        int[] actualOutput = decompressRunLengthEncodedList.decompressRLElist(inputNums);
        for (int i = 0; i < expectedOutput.length; i++) {
            assertEquals(expectedOutput[i], actualOutput[i]);
        }
    }

}



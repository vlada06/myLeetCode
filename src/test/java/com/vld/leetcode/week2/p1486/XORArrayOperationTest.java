package com.vld.leetcode.week2.p1486;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class XORArrayOperationTest {
    XORArrayOperation xorArrayOperation;

    @BeforeEach
    void setup() {
        xorArrayOperation = new XORArrayOperation();
    }

    @Test
    void test1() {
        int n = 5, start = 0, expectedOutput = 8;
        assertEquals(expectedOutput, xorArrayOperation.xorOperation(n, start));
    }

    @Test
    void test2() {
        int n = 4, start = 3, expectedOutput = 8;
        assertEquals(expectedOutput, xorArrayOperation.xorOperation(n, start));
    }
}



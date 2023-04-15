package com.vld.leetcode.week1.p1281;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubtractProductSumIntegerDigitsWhileLoopTest {
    SubtractProductSumIntegerDigitsWhileLoop subtractProductSumIntegerDigits;

    @BeforeEach
    void setup() {
        subtractProductSumIntegerDigits = new SubtractProductSumIntegerDigitsWhileLoop();
    }


    @Test
    void test1() {
        assertEquals( 15, subtractProductSumIntegerDigits.subtractProductAndSum(234));
    }
    @Test
    void test2() {
        assertEquals( 21, subtractProductSumIntegerDigits.subtractProductAndSum(4421));
    }
    @Test
    void test3() {
        assertEquals( 4, subtractProductSumIntegerDigits.subtractProductAndSum(1281));
    }
}



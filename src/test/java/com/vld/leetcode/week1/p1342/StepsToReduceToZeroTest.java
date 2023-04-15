package com.vld.leetcode.week1.p1342;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepsToReduceToZeroTest {
    StepsToReduceToZero stepsToReduceToZero;

    @BeforeEach
    void setup() {
        stepsToReduceToZero = new StepsToReduceToZero();
    }


    @Test
    void test1() {
        assertEquals(6, stepsToReduceToZero.numberOfSteps(14));
    }
    @Test
    void test2() {
        assertEquals(4, stepsToReduceToZero.numberOfSteps(8));
    }
    @Test
    void test3() {
        assertEquals(12, stepsToReduceToZero.numberOfSteps(123));
    }
}



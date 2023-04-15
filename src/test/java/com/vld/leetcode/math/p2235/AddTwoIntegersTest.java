package com.vld.leetcode.math.p2235;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoIntegersTest {

    private AddTwoIntegers addTwoIntegers;

    @BeforeEach
    void setup() {
         addTwoIntegers = new AddTwoIntegers();
    }


    @Test
    void test1() {
        int expected = 17;
        int actualOutput = addTwoIntegers.sum(12, 5);
        assertEquals( expected,actualOutput);
    }
}
package com.vld.leetcode.week2.p2103;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RingsAndRodsTest {
    RingsAndRods ringsAndRods;

    @BeforeEach
    void setup() {
        ringsAndRods = new RingsAndRods();
    }

    @Test
    void test1() {
        String input = "B0B6G0R6R0R6G9";
        assertEquals(1, ringsAndRods.countPoints(input));
    }

    @Test
    void test2() {
        String input = "B3G3R3B0B6G0R6R0R6G9";
        assertEquals(2, ringsAndRods.countPoints(input));
    }

    @Test
    void test3() {
        String input = "B0R0G0R9R0B0G0";
        assertEquals(1, ringsAndRods.countPoints(input));
    }

     @Test
    void test4() {
        String input = "G4";
        assertEquals(0, ringsAndRods.countPoints(input));
    }
}



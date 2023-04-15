package com.vld.leetcode.week1.p0771;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JewelsAndStonesTest {
    JewelsAndStonesSolution jewelsAndStonesSolution;

    @BeforeEach
    void setup() {
        jewelsAndStonesSolution = new JewelsAndStonesSolution();
    }

    @Test
    void test1() {
        String jewels = "aA";
        String stones = "aAAbbbb";
        int actualOutput = jewelsAndStonesSolution.numJewelsInStones(jewels, stones);
        assertEquals(3,actualOutput);
    }

    @Test
    void test2() {
        String jewels = "z";
        String stones = "ZZ";
        int actualOutput = jewelsAndStonesSolution.numJewelsInStones(jewels, stones);
        assertEquals(0,actualOutput);
    }
}



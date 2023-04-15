package com.vld.leetcode.week1.p1108;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DefangIPAddressTest {
    DefangIPAddressSolution defangIPAddressSolution;

    @BeforeEach
    void setup() {
        defangIPAddressSolution = new DefangIPAddressSolution();
    }

    @Test
    void test1() {
        String address = "1.1.1.1";
        String expectedOutput = "1[.]1[.]1[.]1";
        String actualOutput = defangIPAddressSolution.defangIPaddr(address);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void test2() {
        String address = "255.100.50.0";
        String expectedOutput = "255[.]100[.]50[.]0";
        String actualOutput = defangIPAddressSolution.defangIPaddr(address);
        assertEquals(expectedOutput, actualOutput);
    }
}

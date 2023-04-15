package com.vld.leetcode.math.p2469;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertTemperatureTest {
    private ConvertTemperature convertTemperature;
    @BeforeEach
    void setup() {
        convertTemperature = new ConvertTemperature();
    }

    @Test
    void test1() {
        double[] expected = {309.65,97.7};
        double[] actualOutput = convertTemperature.convertTemperature(36.5);
        assertEquals( expected[0],actualOutput[0]);
        assertEquals( expected[1],actualOutput[1]);
    }

}
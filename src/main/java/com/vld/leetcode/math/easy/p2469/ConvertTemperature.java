package com.vld.leetcode.math.p2469;

/**
 * date: 27/03/2023
 * time: 20:46
 */

public class ConvertTemperature {
    double[] convertTemperature (double celsius){
        return new double[]{celsius + 273.15, celsius * 1.80 + 32.00};
    }
}

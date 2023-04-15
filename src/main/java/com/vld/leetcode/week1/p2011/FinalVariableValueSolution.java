package com.vld.leetcode.week1.p2011;

public class FinalVariableValueSolution {
    public int finalValueAfterOperations(String[] operations) {
        int result = 0;
        for (String operation : operations) {
            if (operation.contains("++")) {
                result++;
            } else if (operation.contains("--")) {
                result--;
            } //  RunningArraySumSolution
        }
        return result;
    }
}
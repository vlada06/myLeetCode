package com.vld.leetcode.week1.p1342;

public class StepsToReduceToZero {
    public int numberOfSteps(int num) {
        int steps = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num - num % 2;
            }
            steps++;
        }
        return steps;
    }
}

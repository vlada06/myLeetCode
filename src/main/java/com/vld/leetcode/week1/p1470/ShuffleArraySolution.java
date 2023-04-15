package com.vld.leetcode.week1.p1470;


public class ShuffleArraySolution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        int count = 1;
        for (int i = 0; i < n; i++) {
            result[count - 1] = nums[i];
            result[count] = nums[i + n];
            count = count + 2;
        }
        return result;
    }
}

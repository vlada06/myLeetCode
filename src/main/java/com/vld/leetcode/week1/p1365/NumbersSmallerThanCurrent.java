package com.vld.leetcode.week1.p1365;

public class NumbersSmallerThanCurrent {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] smallerThanCurrent = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int smallerNumberCount = 0;
            for (int j = 0; j < nums.length; j++) {
                if(nums[j] < nums[i]){
                    smallerNumberCount++;
                }
                smallerThanCurrent[i] = smallerNumberCount;
            }
        }

        return smallerThanCurrent;
    }
}

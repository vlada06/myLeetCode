package com.vld.leetcode.week1.p1389;

import java.util.ArrayList;
import java.util.List;

public class TargetArrayGivenOrder {
    public int[] createTargetArray(int[] nums, int[] index) {

        List<Integer> targetList = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            targetList.add(index[i], nums[i]);
        }

        int[] targetArray = new int[targetList.size()];

        for (int i = 0; i < targetList.size(); i++) {
            targetArray[i] = targetList.get(i);
        }
        return targetArray;
    }
}

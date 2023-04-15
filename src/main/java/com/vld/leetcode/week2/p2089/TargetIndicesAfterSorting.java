package com.vld.leetcode.week2.p2089;

import java.util.ArrayList;
import java.util.List;

public class TargetIndicesAfterSorting {
    public List<Integer> targetIndices(int[] nums, int target) {
        int equal = 0;
        int bellow = 0;

        for (int num : nums
        ) {
            if (num == target) {
                equal++;
            } else if (num < target) {
                bellow++;
            }
        }
        List<Integer> indices = new ArrayList<>(equal);
        for (int i = bellow; i < bellow + equal; i++) {
            indices.add(i);
        }
        return indices;
    }
}

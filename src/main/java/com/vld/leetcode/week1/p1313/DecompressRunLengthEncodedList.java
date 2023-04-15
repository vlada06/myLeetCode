package com.vld.leetcode.week1.p1313;

import java.util.ArrayList;
import java.util.List;

public class DecompressRunLengthEncodedList {
    public int[] decompressRLElist(int[] nums) {
        int[] pair = new int[2];
        List<Integer> integerList  = new ArrayList<>();
        for (int i = 0; i < nums.length; i+=2) {
            pair[0] = nums[i];
            pair[1] = nums[i+1];
            for (int j = 0; j < pair[0]; j++) {
                integerList.add(pair[1]);
            }
        }
        int[] decompressedList = new int[integerList.size()];

        for (int i = 0; i < integerList.size(); i++) {
            decompressedList[i] = integerList.get(i);
        }
        return decompressedList;
    }
}

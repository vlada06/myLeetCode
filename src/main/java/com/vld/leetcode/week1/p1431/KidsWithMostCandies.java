package com.vld.leetcode.week1.p1431;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class KidsWithMostCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maxWitoutExtras = Arrays.stream(candies).max().getAsInt();
        for (int i = 0; i < candies.length; i++) {
            result.add((candies[i] + extraCandies) >= maxWitoutExtras);
        }
        return result;
    }
}

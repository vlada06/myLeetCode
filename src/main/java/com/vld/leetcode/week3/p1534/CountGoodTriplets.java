package com.vld.leetcode.week3.p1534;

public class CountGoodTriplets {

    public int countGoodTripletsb(int[] arr, int a, int b, int c) {
        int i, j, k, count = 0;
        for (i = 0; i < (arr.length) - 2; i++)
            for (j = i + 1; j < (arr.length) - 1; j++)
                if (Math.abs(arr[i] - arr[j]) <= a)
                    for (k = j + 1; k < arr.length; k++) {
                        if (Math.abs(arr[j] - arr[k]) <= b)
                            if (Math.abs(arr[i] - arr[k]) <= c)
                                count++;
                    }
        return count;
    }

    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int tripletCount = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (Math.abs(arr[i] - arr[j]) <= a) {
                    for (int k = j + 1; k < arr.length; k++) {
                        if (Math.abs(arr[j] - arr[k]) <= b) {
                            if (Math.abs(arr[i] - arr[k]) <= c) {
                                tripletCount++;
                            }
                        }
                    }
                }
            }
        }
        return tripletCount;
    }
}
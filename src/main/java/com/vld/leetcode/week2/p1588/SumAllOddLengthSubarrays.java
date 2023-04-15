package com.vld.leetcode.week2.p1588;

import java.util.Arrays;

/**
 * date: 02/02/2022
 * time: 21:22
 */

public class SumAllOddLengthSubarrays {
    public int sumOddLengthSubarraysMe(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int from = i;
            for (int j = i; j <= arr.length; j++) {
                int to = j;
                int[] tempArr = Arrays.copyOfRange(arr, from, to);
                if (tempArr.length % 2 == 1) {
                    for (int k = 0; k < tempArr.length; k++) {
                        sum += tempArr[k];
                    }
                }
            }
        }
        return sum;
    }

    public int sumOddLengthSubarrays(int[] arr) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i] * ((((i + 1) * (arr.length - i)) + 1) / 2);
        }
        return sum;
    }

    public int sumOddLengthSubarraysMe2(int[] arr) {

        int sum = arr[0];
        int tempArray[] = new int[arr.length];
        tempArray[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            tempArray[i] = tempArray[i - 1] + arr[i];
            sum += arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 2; j < arr.length; j = j + 2) {
                sum += tempArray[j];
                if (i > 0)
                    sum -= tempArray[i - 1];
            }
        }
        return sum;
    }
}


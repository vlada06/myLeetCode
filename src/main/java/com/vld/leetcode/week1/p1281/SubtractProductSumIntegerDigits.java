package com.vld.leetcode.week1.p1281;

public class SubtractProductSumIntegerDigits {
    public int subtractProductAndSum(int n) {
        return getProduct(n) - getSum(n);
    }

    private int getSum(int n) {
        if (n < 10) {
            return n;
        } else {
            return n % 10 + getSum((n - n % 10) / 10);
        }
    }

    private int getProduct(int n) {
        if (n < 10) {
            return n;
        } else {
            return n % 10 * getProduct((n - n % 10) / 10);
        }
    }
}

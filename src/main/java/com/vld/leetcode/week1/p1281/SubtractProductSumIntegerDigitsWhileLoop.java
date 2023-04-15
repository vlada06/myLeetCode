package com.vld.leetcode.week1.p1281;

public class SubtractProductSumIntegerDigitsWhileLoop {
    public int subtractProductAndSum(int n) {

        int remainder;
        int sum = 0;
        int product = 1;
        while (n != 0) {
            remainder = n % 10;
            sum = sum + (remainder);
            product = product * remainder;
            n = n / 10;
        }
        return product - sum;
    }
}

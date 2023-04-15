package com.vld.leetcode.week2.p1688;

public class CountTournamentMatchesWhile {
    public int numberOfMatches(int n) {
        int count = 0;
        while (n > 1) {
            count += n / 2 + n % 2;
            n /= 2;
        }
        return count;
    }
}

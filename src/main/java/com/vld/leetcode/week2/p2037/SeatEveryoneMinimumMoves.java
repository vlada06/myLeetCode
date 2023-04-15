package com.vld.leetcode.week2.p2037;

import java.util.Arrays;

/**
 * date: 31/01/2022
 * time: 21:06
 */

public class SeatEveryoneMinimumMoves {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int moves = 0;
        for (int i = 0; i < seats.length; i++) {
            moves += Math.abs(seats[i] - students[i]);
        }
        return moves;
    }
}

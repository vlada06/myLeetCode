package com.vld.leetcode.week2.p2037;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SeatEveryoneMinimumMovesTest {
    SeatEveryoneMinimumMoves seatEveryoneMinimumMoves;

    @BeforeEach
    void setUp() {
        seatEveryoneMinimumMoves = new SeatEveryoneMinimumMoves();
    }

    @Test
    void test1() {

        int[] seats = {3, 1, 5};
        int[] students = {2, 7, 4};
        int expectedOutput = 4;
        assertEquals(expectedOutput, seatEveryoneMinimumMoves.minMovesToSeat(seats, students));
    }

    @Test
    void test2() {
        int[] seats = {4, 1, 5, 9};
        int[] students = {1, 3, 2, 6};
        int expectedOutput = 7;
        assertEquals(expectedOutput, seatEveryoneMinimumMoves.minMovesToSeat(seats, students));
    }
}

/*
p1614
MaximumNestingDepthParentheses
 */
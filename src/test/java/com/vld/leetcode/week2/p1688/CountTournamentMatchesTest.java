package com.vld.leetcode.week2.p1688;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountTournamentMatchesTest {
    CountTournamentMatches countTournamentMatches;
    CountTournamentMatchesWhile countTournamentMatchesWhile;
    CountTournamentMatchesRecursive countTournamentMatchesRecursive;

    @BeforeEach
    void setup() {
        countTournamentMatches = new CountTournamentMatches();
        countTournamentMatchesWhile = new CountTournamentMatchesWhile();
        countTournamentMatchesRecursive = new CountTournamentMatchesRecursive();

    }

    @Test
    void test1() {
        assertEquals(6, countTournamentMatches.numberOfMatches(7));
    }

    @Test
    void test2() {
        assertEquals(6, countTournamentMatches.numberOfMatches(7));
    }

    @Test
    void test3() {
        assertEquals(6, countTournamentMatchesWhile.numberOfMatches(7));
    }

    @Test
    void test4() {
        assertEquals(6, countTournamentMatchesWhile.numberOfMatches(7));
    }

    @Test
    void test5() {
        assertEquals(6, countTournamentMatchesRecursive.numberOfMatches(7));
    }

    @Test
    void test6() {
        assertEquals(6, countTournamentMatchesRecursive.numberOfMatches(7));
    }
}



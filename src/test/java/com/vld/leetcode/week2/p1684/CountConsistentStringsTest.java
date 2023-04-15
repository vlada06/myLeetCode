package com.vld.leetcode.week2.p1684;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountConsistentStringsTest {
    CountConsistentStrings countConsistentStrings;

    @BeforeEach
    void setup() {
        countConsistentStrings = new CountConsistentStrings();
    }

    @Test
    void test1() {
        String allowed = "ab";
        String[] words = {"ad", "bd", "aaab", "baa", "badab"};

        assertEquals(2, countConsistentStrings.countConsistentStrings(allowed, words));
    }

    @Test
    void test2() {
        String allowed = "abc";
        String[] words = {"a", "b", "c", "ab", "ac", "bc", "abc"};

        assertEquals(7, countConsistentStrings.countConsistentStrings(allowed, words));
    }

    @Test
    void test3() {
        String allowed = "cad";
        String[] words = {"cc", "acd", "b", "ba", "bac", "bad", "ac", "d"};

        assertEquals(4, countConsistentStrings.countConsistentStrings(allowed, words));
    }
}



package com.vld.leetcode.week2.p1662;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckStringArraysEquivalentTest {
    CheckStringArraysEquivalent checkStringArraysEquivalent;

    @BeforeEach
    void setup() {
        checkStringArraysEquivalent = new CheckStringArraysEquivalent();
    }


    @Test
    void test1() {

        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        assertEquals(true, checkStringArraysEquivalent.arrayStringsAreEqual(word1, word2));
    }

    @Test
    void test2() {

        String[] word1 = {"a", "cb"};
        String[] word2 = {"ab", "c"};
        assertEquals(false, checkStringArraysEquivalent.arrayStringsAreEqual(word1, word2));
    }

    @Test
    void test3() {

        String[] word1 = {"abc", "d", "defg"};
        String[] word2 = {"abcddefg"};
        assertEquals(true, checkStringArraysEquivalent.arrayStringsAreEqual(word1, word2));
    }
}



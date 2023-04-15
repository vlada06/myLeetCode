package com.vld.leetcode.week2.p1859;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortingSentenceTest {
    SortingSentence sortingSentence;

    @BeforeEach
    void setup() {
        sortingSentence = new SortingSentence();
    }


    @Test
    void test1() {

        String input = "is2 sentence4 This1 a3";
        String expectedOutput = "This is a sentence";
        String actualOutput = sortingSentence.sortSentence(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void test2() {
        String input = "Myself2 Me1 I4 and3";
        String expectedOutput = "Me Myself and I";
        String actualOutput = sortingSentence.sortSentence(input);
        assertEquals(expectedOutput, actualOutput);
    }
}



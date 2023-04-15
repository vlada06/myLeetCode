package com.vld.leetcode.week3.p1816;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SentenceTruncationTest {
    SentenceTruncation sentenceTruncation;

    @BeforeEach
    void setup() {
        sentenceTruncation = new SentenceTruncation();
    }

    @Test
    void test1() {
        String input = "Hello how are you Contestant";
        int k = 4;
        String actual = sentenceTruncation.truncateSentence(input, k);
        String expected = "Hello how are you";
        assertEquals(expected, actual);
    }

    @Test
    void test2() {
        String input = "What is the solution to this problem";
        int k = 4;
        String actual = sentenceTruncation.truncateSentence(input, k);
        String expected = "What is the solution";
        assertEquals(expected, actual);
    }
}



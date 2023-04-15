package com.vld.leetcode.week2.p1832;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CheckSentencePangramTest {
    CheckSentencePangram checkSentencePangram;

    @BeforeEach
    void setup() {
        checkSentencePangram = new CheckSentencePangram();
    }

    @Test
    void test1() {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        assertTrue(checkSentencePangram.checkIfPangram(sentence));
    }

    @Test
    void test2() {
        String sentence = "leetcode";
        assertFalse(checkSentencePangram.checkIfPangram(sentence));
    }
}



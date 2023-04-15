package com.vld.leetcode.week3.p1844;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReplaceDigitsWithCharactersTest {
    ReplaceDigitsWithCharacters replaceDigitsWithCharacters;

    @BeforeEach
    void setup() {
        replaceDigitsWithCharacters = new ReplaceDigitsWithCharacters();
    }


    @Test
    void test1() {
        String input = "a1c1e1";
        String expectedOutput = "abcdef";
        String actualOutput = replaceDigitsWithCharacters.replaceDigits(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void test2() {
        String input = "a1b2c3d4e";
        String expectedOutput = "abbdcfdhe";
        String actualOutput = replaceDigitsWithCharacters.replaceDigits(input);
        assertEquals(expectedOutput, actualOutput);
    }
}



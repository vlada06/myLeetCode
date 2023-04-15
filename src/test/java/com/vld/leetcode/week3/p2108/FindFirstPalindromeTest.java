package com.vld.leetcode.week3.p2108;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindFirstPalindromeTest {
    FindFirstPalindrome findFirstPalindrome;

    @BeforeEach
    void setup() {
        findFirstPalindrome = new FindFirstPalindrome();
    }


    @Test
    void test1() {
        String[] words = {"abc", "car", "ada", "racecar", "cool"};
        String output = "ada";
        assertEquals(output, findFirstPalindrome.firstPalindrome(words));
    }

    @Test
    void test2() {
        String[] words = {"abcba", "abc", "car", "ada", "racecar", "cool"};
        String output = "abcba";
        assertEquals(output, findFirstPalindrome.firstPalindrome(words));
    }

    @Test
    void test3() {
        String[] words = {"abdcba", "abc", "car", "acda", "racecar", "cool"};
        String output = "racecar";
        assertEquals(output, findFirstPalindrome.firstPalindrome(words));
    }

    @Test
    void test4() {
        String[] words = {"abdcba", "abc", "car", "abba", "racecar", "cool"};
        String output = "abba";
        assertEquals(output, findFirstPalindrome.firstPalindrome(words));
    }
}



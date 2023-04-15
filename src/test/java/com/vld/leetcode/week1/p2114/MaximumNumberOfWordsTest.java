package com.vld.leetcode.week1.p2114;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumNumberOfWordsTest {
    MaximumNumberOfWordsSolution maximumNumberOfWordsSolution;

    @BeforeEach
    void setup(){
        maximumNumberOfWordsSolution = new MaximumNumberOfWordsSolution();
    }

    @Test
    void test1(){
        String[] input = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int actual = maximumNumberOfWordsSolution.mostWordsFound(input);
        assertEquals(6,actual);
    }

    @Test
    void test2(){
        String[] input = {"please wait", "continue to fight", "continue to win"};
        int actual = maximumNumberOfWordsSolution.mostWordsFound(input);
        assertEquals(3,actual);
    }

}

package com.vld.leetcode.week2.p1678;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class GoalParserInterpreterTest {
    GoalParserInterpreter goalParserInterpreter;

    @BeforeEach
    void setUp() {
        goalParserInterpreter = new GoalParserInterpreter();
    }

    @Test
    void test1() {
        String input = "G()(al)";
        String expectedOutput = "Goal";
        String actualOutput = goalParserInterpreter.interpret(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void test2() {
        String input = "G()()()()(al)";
        String expectedOutput = "Gooooal";
        String actualOutput = goalParserInterpreter.interpret(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void test3() {
        String input = "(al)G(al)()()G";
        String expectedOutput = "alGalooG";
        String actualOutput = goalParserInterpreter.interpret(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void test4() {
        String input = "()()G";
        String expectedOutput = "ooG";
        String actualOutput = goalParserInterpreter.interpret(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void test5() {
        String input = "G";
        String expectedOutput = "G";
        String actualOutput = goalParserInterpreter.interpret(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void test6() {
        String input = "GGG";
        String expectedOutput = "GGG";
        String actualOutput = goalParserInterpreter.interpret(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void test7() {
        String input = "GGG";
        String expectedOutput = "GGG";
        String actualOutput = goalParserInterpreter.interpret(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void test8() {
        String input = "()(al)GGG";
        String expectedOutput = "oalGGG";
        String actualOutput = goalParserInterpreter.interpret(input);
        assertEquals(expectedOutput, actualOutput);
    }
}


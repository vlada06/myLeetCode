package com.vld.leetcode.week1.p2011;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FinalVariableValueTest {
    FinalVariableValueSolution finalVariableValueSolution;
    @BeforeEach
    void setup() {
        finalVariableValueSolution = new FinalVariableValueSolution();
    }

    @Test
    void test1() {
        String[] operations = {"--X","X++","X++"};
        int actual = finalVariableValueSolution.finalValueAfterOperations(operations);
        assertEquals(1,actual);

    }

    @Test
    void test2() {
        String[] operations = {"++X","X++","X++"};
        int actual = finalVariableValueSolution.finalValueAfterOperations(operations);
        assertEquals(3,actual);

    }
}

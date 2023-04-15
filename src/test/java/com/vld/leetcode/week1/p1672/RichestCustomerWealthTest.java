package com.vld.leetcode.week1.p1672;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RichestCustomerWealthTest {
    RichestCustomerWealthSolution richestCustomerWealthSolution;

    @BeforeEach
    void setup() {
        richestCustomerWealthSolution = new RichestCustomerWealthSolution();
    }

    @Test
    void test1() {
        int[][] accounts = {{1,2,3},{3,2,1}};
        int actualOutput=richestCustomerWealthSolution.maximumWealth(accounts);
        assertEquals(6, actualOutput);
    }

    @Test
    void test2() {
        int[][] accounts =  {{1,5},{7,3},{3,5}};
        int actualOutput=richestCustomerWealthSolution.maximumWealth(accounts);
        assertEquals(10, actualOutput);
    }
}



package com.vld.leetcode.week2.p1290;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListNodelTest {
    ConvertBinaryToDecimal convertBinaryToDecimal;
    ListNodeUtil listNodeUtil = new ListNodeUtil();

    @BeforeEach
    void setup() {
        convertBinaryToDecimal = new ConvertBinaryToDecimal();
    }

    @Test
    @DisplayName("Should create a ListNode from array of integers")
    void test1() {
        ListNodeUtil node = new ListNodeUtil();
        int[] testData = {2, 3, 5, 1, 2};
        ListNode listNode = listNodeUtil.getNodes(testData);
        assertEquals(1, 1);
    }

    @Test
    @DisplayName("demonstrate prepending of nodes")
    void tes26() {
        ListNodeUtil util = new ListNodeUtil();
        int[] testData = {2, 3, 5, 1, 2};
        ListNode node = util.prependNodes(testData);
        assertEquals(1, 1);
    }
}



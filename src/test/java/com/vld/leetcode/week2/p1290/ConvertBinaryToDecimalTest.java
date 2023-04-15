package com.vld.leetcode.week2.p1290;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConvertBinaryToDecimalTest {
    ConvertBinaryToDecimal convertBinaryToDecimal;
    ListNodeUtil listNodeUtil = new ListNodeUtil();

    @BeforeEach
    void setup() {
        convertBinaryToDecimal = new ConvertBinaryToDecimal();
    }

    @Test
    void test1() {
        ListNodeUtil node = new ListNodeUtil();
        int[] binaryArray = {1, 0};
        ListNode listNode = listNodeUtil.getNodes(binaryArray);
        int actual = convertBinaryToDecimal.getDecimalValue(listNode);
        assertEquals(2, actual);
    }

    @Test
    void test2() {
        ListNodeUtil node = new ListNodeUtil();
        int[] binaryArray = {1, 0, 1};
        ListNode listNode = listNodeUtil.getNodes(binaryArray);
        int actual = convertBinaryToDecimal.getDecimalValue(listNode);
        assertEquals(5, actual);
    }

    @Test
    void test3() {
        ListNodeUtil node = new ListNodeUtil();
        int[] binaryArray = {0};
        ListNode listNode = listNodeUtil.getNodes(binaryArray);
        int actual = convertBinaryToDecimal.getDecimalValue(listNode);
        assertEquals(0, actual);
    }

    @Test
    void test4() {
        ListNodeUtil node = new ListNodeUtil();
        int[] binaryArray = {1, 0, 0};
        ListNode listNode = listNodeUtil.getNodes(binaryArray);
        int actual = convertBinaryToDecimal.getDecimalValue(listNode);
        assertEquals(4, actual);
    }

    @Test
    void test5() {
        ListNodeUtil node = new ListNodeUtil();
        int[] testData = {1, 0, 0, 0, 0, 1};
        ListNode listNode = listNodeUtil.getNodes(testData);
        int actual = convertBinaryToDecimal.getDecimalValue(listNode);
        assertEquals(33, actual);
    }

    @Test
    void test6() {
        ListNodeUtil util = new ListNodeUtil();
        int[] testData = {1,0,1,0,1,0,0,1};
        ListNode node = util.prependNodes(testData);
        int actual = convertBinaryToDecimal.getDecimalValue(node);
        assertEquals(169, actual);
    }
}



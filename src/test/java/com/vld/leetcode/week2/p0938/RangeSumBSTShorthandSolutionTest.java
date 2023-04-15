package com.vld.leetcode.week2.p0938;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RangeSumBSTShorthandSolutionTest {
    RangeSumBSTShorthandSolution rangeSumOfBST;
    TreeNode treeNode;

    @BeforeEach
    void setup() {
        rangeSumOfBST = new RangeSumBSTShorthandSolution();
        treeNode = new TreeNode();
    }

    @Test
    void test1() {
        Integer[] rootArray = {10, 5, 15, 3, 7, null, 18};
        TreeNode root = treeNode.getTreeNode(rootArray, new TreeNode());
        int low = 7, high = 15;
        int expectedOutput = 32;
        int actualOutput = rangeSumOfBST.rangeSumBST(root, low, high);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void test2() {
        Integer[] rootArray = {10, 5, 15, 3, 7, 13, 18, 1, null, 6};
        TreeNode root = treeNode.getTreeNode(rootArray, new TreeNode());
        int low = 6, high = 10;
        int expectedOutput = 23;
        int actualOutput = rangeSumOfBST.rangeSumBST(root, low, high);
        assertEquals(expectedOutput, actualOutput);
    }
}



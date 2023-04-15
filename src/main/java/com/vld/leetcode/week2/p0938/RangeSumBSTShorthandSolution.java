package com.vld.leetcode.week2.p0938;

public class RangeSumBSTShorthandSolution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }

        int sum = 0;
        if (low <= root.val && root.val <= high) {
            sum += root.val;
        }

        sum += rangeSumBST(root.left, low, high);
        sum += rangeSumBST(root.right, low, high);
        return sum;
    }
}

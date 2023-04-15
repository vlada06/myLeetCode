package com.vld.leetcode.week2.p0938;

public class RangeSumBSTSeparateMethod {

    public int rangeSumBST(TreeNode root, int low, int high) {
        int ans = 0;
        ans += rangeSearch(root, low, high, ans);
        return ans;
    }

    public int rangeSearch(TreeNode node, int L, int R, int ans) {
        if (node != null) {
            if ((L <= node.val) && (node.val <= R))
                ans = ans + node.val;
            if (node.left != null)
                ans = rangeSearch(node.left, L, R, ans);
            if (node.right != null)
                ans = rangeSearch(node.right, L, R, ans);
        }
        return ans;
    }
}

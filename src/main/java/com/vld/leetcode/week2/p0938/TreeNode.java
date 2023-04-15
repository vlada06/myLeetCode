package com.vld.leetcode.week2.p0938;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    TreeNode rootTree;

    public void addValue(int value) {
        rootTree = addValues(rootTree, value);
    }

    private TreeNode addValues(TreeNode current, int value) {
        if (current == null) {
            return new TreeNode(value);
        }

        if (value < current.val) {
            current.left = addValues(current.left, value);
        } else if (value > current.val) {
            current.right = addValues(current.right, value);
        } else {
            return current;
        }
        return current;
    }

    public TreeNode getTreeNode(Integer[] data, TreeNode node) {
        for (int i = 0; i < data.length; i++) {
            if (null != data[i]) {
                node = addTreeNodeRecursive(node, data[i]);
            }
        }
        return node;
    }

    private TreeNode addTreeNodeRecursive(TreeNode current, int value) {
        if (current == null) {
            return new TreeNode(value);
        }

        if (value < current.val) {
            current.left = addTreeNodeRecursive(current.left, value);
        } else if (value > current.val) {
            current.right = addTreeNodeRecursive(current.right, value);
        } else {
            return current;
        }
        return current;
    }

    private boolean isFoundNodeRecursive(TreeNode treeNode, int value) {
        boolean isFound = false;
        if (treeNode == null) {
            return isFound;
        }
        if (value == treeNode.val) {
            return true;
        } else if (value < treeNode.val) {
            isFound = isFoundNodeRecursive(treeNode.left, value);
        } else {
            isFound = isFoundNodeRecursive(treeNode.right, value);
        }
        return isFound;
    }

    public boolean isFoundNode(TreeNode treeNode, int value) {
        return isFoundNodeRecursive(treeNode, value);
    }
}


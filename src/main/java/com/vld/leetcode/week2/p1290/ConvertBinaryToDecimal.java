package com.vld.leetcode.week2.p1290;

public class ConvertBinaryToDecimal {
    public int getDecimalValue(ListNode head) {
        ListNode node = revertNode(head);

        int decimal = 0;
        int base = 1;
        while (node != null) {
            int rightMost = node.val;
            ListNode temp = node.next;
            decimal += rightMost * base;
            base *= 2;
            node = temp;
        }
        return decimal;
    }

    private ListNode revertNode(ListNode node) {
        ListNode previousNode = null;
        ListNode currentNode = node;

        while (currentNode != null) {
            ListNode nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }
        node = previousNode;
        return node;
    }
}

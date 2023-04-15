package com.vld.leetcode.week2.p1290;

public class ListNodeUtil {

    public ListNode getNodes(int[] data) {
        ListNode node = new ListNode();

        for (int i = 0; i < data.length; i++) {
            if (i == 0) {
                node = appendNode(data[i], null);
            } else {
                node = appendNode(data[i], node);
            }
        }
        return node;
    }

    public ListNode appendNode(int val, ListNode head) {
        ListNode tempNode = new ListNode(val, null);
        ListNode currentNode = head;
        if (currentNode == null) {
            head = tempNode;
        } else {
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = tempNode;
        }
        return head;
    }

    public ListNode prependNode(int val, ListNode node) {
        ListNode temp = new ListNode(val);
        if (node == null) {
            node = temp;
        } else {
            temp.next = node;
            node = temp;
        }
        return node;
    }

    public ListNode prependNodes(int[] data) {
        ListNode node = new ListNode();
        int loopSize = data.length - 1;
        for (int i = loopSize; i >= 0; i--) {
            if (i == loopSize) {
                node = prependNode(data[loopSize], null);
            } else {
                node = prependNode(data[i], node);
            }
        }
        return node;
    }
}

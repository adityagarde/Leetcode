package com.github.aditya;

public class _1721 {
    // 2 ms, faster than 100.00%, 57.2 MB, less than 84.37%
    // Time Complexity O(n), Space Complexity O(1)
    class Solution {
        public ListNode swapNodes(ListNode head, int k) {
            ListNode tempNode = new ListNode();
            tempNode.next = head;

            ListNode first = tempNode;
            for (int i = 0; i < k; i++) {
                first = first.next;
            }

            ListNode second = tempNode;
            ListNode firstCopy = first;
            while (firstCopy != null) {
                second = second.next;
                firstCopy = firstCopy.next;
            }

            int firstVal = first.val;
            first.val = second.val;
            second.val = firstVal;

            return head;
        }
    }

    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}

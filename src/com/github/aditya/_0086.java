package com.github.aditya;

public class _0086 {
    // 0 ms, faster than 100.00%, memory 42.1 MB, less than 76.99%
    // Time Complexity O(n) and Space Complexity O(1)
    class Solution {
        public ListNode partition(ListNode head, int x) {
            ListNode leftHead = new ListNode();
            ListNode rightHead = new ListNode();

            ListNode left = leftHead;
            ListNode right = rightHead;

            while (head != null) {
                if (head.val < x) {
                    left.next = head;
                    left = left.next;
                } else {
                    right.next = head;
                    right = right.next;
                }
                head = head.next;
            }

            left.next = rightHead.next;
            right.next = null;

            return leftHead.next;
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

package com.github.aditya;

public class _0019 {
    // 0 ms, faster than 100.00%, memory 40 MB, less than 99.20%
    // Time Complexity O(n) and space complexity O(1)
    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode tempNode = new ListNode();
            tempNode.next = head;
            ListNode fast = tempNode;
            ListNode slow = tempNode;

            for (int i = 1; i <= n; i++)
                fast = fast.next;

            while (fast.next != null) {
                fast = fast.next;
                slow = slow.next;
            }

            slow.next = slow.next.next;

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
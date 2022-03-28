package com.github.aditya;

public class _0206 {

    // ITERATIVE approach - 0 ms, faster than 100.00%
    // O(n) time complexity, O(1) space complexity
    class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode newHead = null;
            while (head != null) {
                ListNode next = head.next;
                head.next = newHead;
                newHead = head;
                head = next;
            }
            return newHead;
        }
    }

    // RECURSIVE APPROACH - 0 ms, faster than 100.00%
    // O(n) time complexity
    class Solution_1 {
        public ListNode reverseList(ListNode head) {
            return reverse(head, null);
        }

        private ListNode reverse(ListNode head, ListNode newHead) {
            if (head == null) {
                return newHead;
            }
            ListNode next = head.next;
            head.next = newHead;
            return reverse(next, head);
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
package com.github.aditya;

public class _0234 {
    // 4 ms, faster than 99.24%, memory 52.7 MB, less than 98.63%
    // Time Complexity - Find Middle Node + Reverse Second Half + Compare both halves = 3 * O(n/2) ~ O(n)
    // Space Complexity - O(1)
    class Solution {
        public boolean isPalindrome(ListNode head) {
            if (head == null || head.next == null)
                return true;

            ListNode slow = head;
            ListNode fast = head;

            // Find the middle
            while (fast.next != null && fast.next.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }

            // reverse the right half
            slow.next = reverseList(slow.next);

            // slow ++
            slow = slow.next;

            // compare the left and right parts
            while (slow != null) {
                if (head.val != slow.val)
                    return false;
                head = head.next;
                slow = slow.next;
            }

            return true;
        }

        public ListNode reverseList(ListNode head) {
            ListNode newHead = null;
            ListNode next = null;
            while (head != null) {
                next = head.next;
                head.next = newHead;
                newHead = head;
                head = next;
            }
            return newHead;
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
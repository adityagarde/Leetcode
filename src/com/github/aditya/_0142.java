package com.github.aditya;

public class _0142 {
    // 0 ms, faster than 100.00%, 42.8 MB, less than 86.07%
    // Optimal Solution - Time  Complexity O(n) and Space Complexity O(1)
    public class Solution {
        public ListNode detectCycle(ListNode head) {
            if (head == null || head.next == null)
                return null;

            ListNode slow = head;
            ListNode fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast) {
                    slow = head;
                    while (slow != fast) {
                        slow = slow.next;
                        fast = fast.next;
                    }
                    return slow;
                }
            }
            return null;
        }
    }

    // Definition for singly-linked list.
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}

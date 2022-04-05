package com.github.aditya;

import java.util.HashSet;

public class _0141 {
    // 0 ms, faster than 100.00%, memory 45.8 MB, less than 59.52%
    // Optimal Solution - Time Complexity O(n) and Space Complexity O(1)
    public class Solution {
        public boolean hasCycle(ListNode head) {
            if (head == null || head.next == null)
                return false;

            ListNode slow = head;
            ListNode fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast)
                    return true;
            }
            return false;
        }
    }

    // 4 ms, faster than 17.85%, memory 42.8 MB, less than 98.93%
    // Extra Space Cost - Time Complexity O(n) and Space Complexity O(n)
    public class Solution_1 {
        public boolean hasCycle(ListNode head) {
            if (head == null || head.next == null)
                return false;
            HashSet<ListNode> nodeSet = new HashSet<>();
            while (head != null) {
                if (nodeSet.contains(head))
                    return true;
                nodeSet.add(head);
                head = head.next;
            }
            return false;
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
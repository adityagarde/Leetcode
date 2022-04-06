package com.github.aditya;

public class _0024 {
    // 0 ms, faster than 100.00%, memory 41.4 MB, less than 71.00%
    // Time Complexity O(n) and Space Complexity O(1)
    class Solution {
        public ListNode swapPairs(ListNode head) {
            if (head == null || head.next == null)
                return head;

            ListNode tempNode = new ListNode();
            tempNode.next = head;

            ListNode prevNode = tempNode;
            ListNode currNode = head;

            while (currNode != null && currNode.next != null) {
                ListNode secondNode = currNode.next;
                ListNode nextCurrent = currNode.next.next;

                secondNode.next = prevNode.next;
                currNode.next = nextCurrent;
                prevNode.next = secondNode;

                prevNode = currNode;
                currNode = nextCurrent;
            }
            return tempNode.next;
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
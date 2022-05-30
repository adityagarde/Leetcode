package com.github.aditya;

public class _0203 {
    // 1 ms, faster than 95.43%, memory 42.9 MB, less than 95.87%
    class Solution {
        public ListNode removeElements(ListNode head, int val) {
            if (head == null)
                return null;

            ListNode currentNode = head;

            while (currentNode.next != null) {
                if (currentNode.next.val == val)
                    currentNode.next = currentNode.next.next;
                else
                    currentNode = currentNode.next;
            }

            return head.val == val ? head.next : head;
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
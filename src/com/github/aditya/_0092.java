package com.github.aditya;

public class _0092 {
    //0 ms, faster than 100.00%, memory 39.4 MB, less than 99.92%
    class Solution {
        public ListNode reverseBetween(ListNode head, int left, int right) {
            ListNode dummy = new ListNode();
            dummy.next = head;

            ListNode previous = dummy;
            for (int i = 0; i < left - 1; i++)
                previous = previous.next;

            ListNode current = previous.next;

            for (int i = 0; i < right - left; i++) {
                ListNode temp = current.next;
                current.next = temp.next;
                temp.next = previous.next;
                previous.next = temp;
            }

            return dummy.next;
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
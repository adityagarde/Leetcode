package com.github.aditya;

public class _0061 {
    // 0 ms, faster than 100.00%, memory 41.9 MB, less than 82.41%
    // 1. Calculate the length of the Linked List.
    // 2. Point the current pointer to the head.
    // 3. Because k can be > length, take module with length && traverse to (length - k)th node.
    // 4. Point the head to this node's next and break the old link (mark it to null as this is new Linked List end.)
    class Solution {
        public ListNode rotateRight(ListNode head, int k) {
            if (head == null || head.next == null || k == 0)
                return head;

            int length = 1;
            ListNode currentNode = head;
            while (currentNode.next != null) {
                length++;
                currentNode = currentNode.next;
            }

            currentNode.next = head;

            k = k % length;
            k = length - k;
            while (k > 0) {
                currentNode = currentNode.next;
                k--;
            }

            head = currentNode.next;
            currentNode.next = null;

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
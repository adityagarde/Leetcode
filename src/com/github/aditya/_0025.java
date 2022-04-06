package com.github.aditya;

public class _0025 {
    // 1 ms, faster than 55.71%, memory 45.1 MB, less than 77.63%
    // Time Complexity = O(n/k) * O(k) ~ O(n), Space Complexity - O(1)
    class Solution {
        public ListNode reverseKGroup(ListNode head, int k) {
            if (head == null || k == 1) return head;

            ListNode tempNode = new ListNode();
            tempNode.next = head;

            ListNode prevNode = tempNode, currNode = tempNode, nextNode;

            int count = 0;
            while (currNode.next != null) {
                currNode = currNode.next;
                count++;
            }

            while (count >= k) {
                currNode = prevNode.next;
                nextNode = currNode.next;
                for (int i = 1; i < k; i++) {
                    currNode.next = nextNode.next;
                    nextNode.next = prevNode.next;
                    prevNode.next = nextNode;
                    nextNode = currNode.next;
                }
                prevNode = currNode;
                count -= k;
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
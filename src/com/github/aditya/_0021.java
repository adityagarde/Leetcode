package com.github.aditya;

public class _0021 {
    // 0 ms, faster than 100.00%, memory 42 MB, less than 82.74%
    // Iterative and Intuitive - Time complexity O(m+n), space complexity O(1)
    class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode tempNode = new ListNode();
            ListNode currentNode = tempNode;

            while (list1 != null && list2 != null) {
                if (list1.val > list2.val) {
                    currentNode.next = list2;
                    list2 = list2.next;
                } else {
                    currentNode.next = list1;
                    list1 = list1.next;
                }
                currentNode = currentNode.next;
            }

            if (list1 == null) currentNode.next = list2;
            else currentNode.next = list1;

            return tempNode.next;
        }
    }

    // Recursive - 0 ms, faster than 100.00%, memory 41.7 MB, less than 88.24%
    class Solution_1 {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            if (list1 == null) return list2;
            if (list2 == null) return list1;

            if (list1.val > list2.val) {
                list2.next = mergeTwoLists(list1, list2.next);
                return list2;
            } else {
                list1.next = mergeTwoLists(list1.next, list2);
                return list1;
            }
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
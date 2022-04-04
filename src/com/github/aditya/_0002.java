package com.github.aditya;

public class _0002 {
    // Iterative - 1 ms, faster than 100.00%, memory 42.2 MB, less than 93.18%
    // Time Complexity O(max(n1, n2)), space complexity O(max(n1, n2))
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode tempNode = new ListNode();
            ListNode currentNode = tempNode;

            int carry = 0;

            while (l1 != null || l2 != null || carry == 1) {
                int sum = 0;
                if (l1 != null) {
                    sum += l1.val;
                    l1 = l1.next;
                }

                if (l2 != null) {
                    sum += l2.val;
                    l2 = l2.next;
                }

                sum += carry;
                carry = sum / 10;
                ListNode node = new ListNode(sum % 10);
                currentNode.next = node;
                currentNode = currentNode.next;
            }
            return tempNode.next;
        }
    }

    // Recursive - 1 ms, faster than 100.00%, memory 42.2 MB, less than 93.18%
    class Solution_1 {
        int carry = 0;

        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            if (l1 == null && l2 == null && carry == 0) {
                return null;
            }

            int val1 = l1 == null ? 0 : l1.val;
            int val2 = l2 == null ? 0 : l2.val;

            int sum = val1 + val2 + carry;
            carry = sum / 10;

            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;

            return new ListNode(sum % 10, addTwoNumbers(l1, l2));
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
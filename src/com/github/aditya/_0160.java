package com.github.aditya;

import java.util.HashMap;
import java.util.Map;

public class _0160 {

    public class Solution {
        // 1 ms, faster than 99.03%, memory 45 MB, less than 95.05%
        // Optimal - Time Complexity O(n1 + n2), Space Complexity O(1)
        // Two iterations - In 1st iteration, when we reach end (null) just point the temp pointer of one list to head of other.
        // In the 2nd iteration we will encounter the common node as the pointer of longer list will already be |n1 - n2| places ahead.
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            if (headA == null || headB == null) return null;

            ListNode tempA = headA;
            ListNode tempB = headB;

            while (tempA != tempB) {
                tempA = tempA == null ? headB : tempA.next;
                tempB = tempB == null ? headA : tempB.next;
            }
            return tempA;
        }
    }

    // 1 ms, faster than 99.01%, 44.9 MB, less than 96.64%
    // Optimal but Lengthy - Time Complexity O(n1 + n2), Space Complexity O(1)
    // Step 1. Get the length of two lists
    // Step 2. Move the longer list ahead by the difference |n1 - n2|
    // Step 3. Now move both till they reach meeting point
    public class Solution_1 {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            if (headA == null || headB == null) return null;
            int n1 = getLength(headA);
            int n2 = getLength(headB);

            for (int n = Math.abs(n1 - n2); n > 0; n--) {
                if (n1 > n2)
                    headA = headA.next;
                else
                    headB = headB.next;
            }

            while (headA != headB) {
                headA = headA.next;
                headB = headB.next;
            }

            return headA;
        }

        int getLength(ListNode list) {
            int length = 0;
            while (list != null) {
                length++;
                list = list.next;
            }
            return length;
        }
    }

    // Better than Brute force, but not optimal - Time Complexity O(n1 + n2), Space Complexity O(n1)
    // Traverse first LinkedList and store the nodes in a HashMap and check if the Node is present in the other list.
    public class Solution_2 {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            Map<ListNode, Integer> map = new HashMap<>();

            while (headA != null) {
                map.put(headA, map.getOrDefault(headA, 0) + 1);
                headA = headA.next;
            }

            while (headB != null) {
                if (map.containsKey(headB))
                    return headB;
                headB = headB.next;
            }
            return null;
        }
    }

    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
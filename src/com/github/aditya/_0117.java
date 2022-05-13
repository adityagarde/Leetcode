package com.github.aditya;

public class _0117 {
    class Solution {
        // 0 ms, faster than 100.00%, memory 42 MB, less than 85.60%
        // Time Complexity O(n) and Space Complexity O(1)
        public Node connect(Node root) {
            Node head = root;

            while (head != null) {
                Node dummy = new Node();
                Node current = dummy;
                while (head != null) {
                    if (head.left != null) {
                        current.next = head.left;
                        current = current.next;
                    }
                    if (head.right != null) {
                        current.next = head.right;
                        current = current.next;
                    }
                    head = head.next;
                }
                head = dummy.next;
            }
            return root;
        }
    }

    // Definition for a Node.
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }
}
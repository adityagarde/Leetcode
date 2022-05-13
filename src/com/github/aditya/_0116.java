package com.github.aditya;

public class _0116 {
    class Solution {
        // 0 ms, faster than 100.00%, memory 42.3 MB, less than 92.77%
        // Time Complexity O(n), Space Complexity O(1)
        public Node connect(Node root) {
            Node current = root;
            Node next = current != null ? current.left : null;

            while (current != null && next != null) {
                current.left.next = current.right;
                if (current.next != null)
                    current.right.next = current.next.left;

                current = current.next;
                if (current == null) {
                    current = next;
                    next = current.left;
                }
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
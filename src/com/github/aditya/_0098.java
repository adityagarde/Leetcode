package com.github.aditya;

import java.util.Stack;

public class _0098 {
    // RECURSIVE - 0 ms, faster than 100.00%, memory 43.2 MB, less than 80.48%
    class Solution {
        public boolean isValidBST(TreeNode root) {
            return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
        }

        private boolean isValidBST(TreeNode node, long minVal, long maxVal) {
            if (node == null)
                return true;
            if (node.val >= maxVal || node.val <= minVal)
                return false;

            return isValidBST(node.left, minVal, node.val) &&
                    isValidBST(node.right, node.val, maxVal);
        }
    }

    // ITERATIVE - 2 ms, faster than 23.05%, memory 42 MB, less than 85.64%
    class Solution_1 {
        public boolean isValidBST(TreeNode root) {
            Stack<TreeNode> stack = new Stack<>();

            TreeNode previous = null;

            while (root != null || !stack.isEmpty()) {
                if (root != null) {
                    stack.push(root);
                    root = root.left;
                } else {
                    root = stack.pop();
                    if (previous != null && previous.val >= root.val)
                        return false;
                    previous = root;
                    root = root.right;
                }
            }

            return true;
        }
    }

    //Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
package com.github.aditya;

import java.util.Stack;

public class _0173 {
    // 18 ms, faster than 74.97%, memory 46 MB, less than 91.72%
    class BSTIterator {
        private final Stack<TreeNode> stack = new Stack<>();

        public BSTIterator(TreeNode root) {
            addLeftNodes(root);
        }

        public int next() {
            TreeNode current = stack.pop();
            addLeftNodes(current.right);
            return current.val;
        }

        public boolean hasNext() {
            return !stack.isEmpty();
        }

        private void addLeftNodes(TreeNode node) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
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

    /**
     * Your BSTIterator object will be instantiated and called as such:
     * BSTIterator obj = new BSTIterator(root);
     * int param_1 = obj.next();
     * boolean param_2 = obj.hasNext();
     */
}
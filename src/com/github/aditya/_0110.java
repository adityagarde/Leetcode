package com.github.aditya;

public class _0110 {
    // 1 ms, faster than 90.75%, memory 41.7 MB, less than 93.06%
    class Solution {
        public boolean isBalanced(TreeNode root) {
            return getBalancedHeight(root) != -1;
        }

        private int getBalancedHeight(TreeNode node) {
            if (node == null)
                return 0;

            int left = getBalancedHeight(node.left);
            int right = getBalancedHeight(node.right);

            if (left == -1 || right == -1)
                return -1;

            if (Math.abs(left - right) > 1)
                return -1;

            return Math.max(left, right) + 1;
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
package com.github.aditya;

public class _0124 {
    // 1 ms, faster than 97.55%, memory 47.3 MB, less than 66.14%
    class Solution {
        int maxSum = Integer.MIN_VALUE;

        public int maxPathSum(TreeNode root) {
            maxSum(root);
            return maxSum;
        }

        private int maxSum(TreeNode node) {
            if (node == null)
                return 0;

            int left = Math.max(0, maxSum(node.left));
            int right = Math.max(0, maxSum(node.right));

            maxSum = Math.max(maxSum, left + right + node.val);

            return node.val + Math.max(left, right);
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
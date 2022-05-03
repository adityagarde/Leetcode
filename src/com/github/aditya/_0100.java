package com.github.aditya;

public class _0100 {
    // 0 ms, faster than 100.00%, memory 39.4 MB, less than 98.48%
    // Time Complexity O(n), Space Complexity O(n)
    class Solution {
        public boolean isSameTree(TreeNode p, TreeNode q) {
            if (p == null || q == null)
                return p == q;

            return (p.val == q.val)
                    && isSameTree(p.left, q.left)
                    && isSameTree(p.right, q.right);
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
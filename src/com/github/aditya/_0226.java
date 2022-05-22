package com.github.aditya;

public class _0226 {
    // 0 ms, faster than 100.00%, memory 41.5 MB, less than 57.49%
    // Time Complexity O(n)
    class Solution {
        public TreeNode invertTree(TreeNode root) {
            if (root == null)
                return root;

            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;

            invertTree(root.left);
            invertTree(root.right);

            return root;
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
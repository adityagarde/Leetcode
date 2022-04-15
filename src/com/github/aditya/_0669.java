package com.github.aditya;

public class _0669 {
    // 0 ms, faster than 100.00%, memory 42.1 MB, less than 43.74%
    class Solution {
        public TreeNode trimBST(TreeNode root, int low, int high) {
            if (root == null)
                return null;
            if (root.val > high)
                return trimBST(root.left, low, high);
            if (root.val < low)
                return trimBST(root.right, low, high);
            root.left = trimBST(root.left, low, high);
            root.right = trimBST(root.right, low, high);

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
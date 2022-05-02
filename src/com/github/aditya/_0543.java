package com.github.aditya;

public class _0543 {
    // 0 ms, faster than 100.00%, memory 42 MB, less than 86.54%
    // Time Complexity O(n), Space Complexity O(n)
    class Solution {
        int diameter = 0;

        public int diameterOfBinaryTree(TreeNode root) {
            getDiameter(root);
            return diameter;
        }

        private int getDiameter(TreeNode node) {
            if (node == null)
                return 0;

            int left = getDiameter(node.left);
            int right = getDiameter(node.right);

            diameter = Math.max(diameter, left + right);

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
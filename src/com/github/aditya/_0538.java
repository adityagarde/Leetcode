package com.github.aditya;

public class _0538 {
    // 0 ms, faster than 100.00%, memory 42.3 MB, less than 74.37%
    // Rather than going from top and repeating the calculations we do - Inverse In-Order Traversal (right - node - left).
    class Solution {
        int sum = 0;

        public TreeNode convertBST(TreeNode root) {
            if (root != null) {
                convertBST(root.right);
                sum += root.val;
                root.val = sum;
                convertBST(root.left);
            }
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
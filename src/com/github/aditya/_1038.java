package com.github.aditya;

public class _1038 {
    // 0 ms, faster than 100.00%, memory 41.9 MB, less than 30.01%
    // Rather than going from top and repeating the calculations we do - Inverse In-Order Traversal (right - node - left).
    class Solution {
        int sum = 0;

        public TreeNode bstToGst(TreeNode root) {
            if (root != null) {
                bstToGst(root.right);
                sum += root.val;
                root.val = sum;
                bstToGst(root.left);
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
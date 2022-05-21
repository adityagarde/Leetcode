package com.github.aditya;

import java.util.List;

public class _1022 {
    // 0 ms, faster than 100.00%, memory 42 MB, less than 72.92%
    static class Solution {
        public int sumRootToLeaf(TreeNode root) {
            return sumRootToLeaf(root, 0);
        }

        private int sumRootToLeaf(TreeNode node, int sum) {
            if (node == null)
                return 0;

            sum = (sum << 1) + node.val;
            if (node.left == null && node.right == null)
                return sum;

            return sumRootToLeaf(node.left, sum) + sumRootToLeaf(node.right, sum);
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
}
package com.github.aditya;

public class _0236 {
    // 5 ms, faster than 99.98%, memory 43.7 MB, less than 89.01%
    // Post Order DFS - Time Complexity O(n) and Space Complexity O(height)
    class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if (root == null || root == p || root == q)
                return root;

            TreeNode left = lowestCommonAncestor(root.left, p, q);
            TreeNode right = lowestCommonAncestor(root.right, p, q);

            if (left == null)
                return right;
            if (right == null)
                return left;
            return root;
        }

        //Definition for a binary tree node.
        public class TreeNode {
            int val;
            TreeNode left;
            TreeNode right;
            TreeNode(int x) { val = x; }
        }
    }
}
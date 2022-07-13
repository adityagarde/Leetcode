package com.github.aditya;

public class _0235 {
    // 4 ms, faster than 100.00%, memory 43.3 MB, less than 91.39%
    // It is BST, LOL! Time Complexity O(log n) [Worst case O(n)]
    class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if (root == null)
                return null;
            if (p.val > root.val && q.val > root.val)
                return lowestCommonAncestor(root.right, p, q);
            else if (p.val < root.val && q.val < root.val)
                return lowestCommonAncestor(root.left, p, q);

            return root;
        }
    }

    //Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
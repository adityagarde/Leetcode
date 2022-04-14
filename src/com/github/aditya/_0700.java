package com.github.aditya;

public class _0700 {
    // 0 ms, faster than 100.00%, memory 42.8 MB, less than 85.98%
    // ITERATIVE - General Time Complexity O(h) and Worst Case O(n) h - height of tree, n - nodes
    class Solution {
        public TreeNode searchBST(TreeNode root, int val) {
            while (root != null) {
                if (root.val == val)
                    return root;
                else if (root.val > val)
                    root = root.left;
                else
                    root = root.right;
            }
            return root;
        }
    }

    // 0 ms, faster than 100.00%, memory 42.7 MB, less than 85.98%
    // RECURSIVE - General Time Complexity O(h) and Worst Case O(n) h - height of tree, n - nodes
    class Solution_1 {
        public TreeNode searchBST(TreeNode root, int val) {
            if (root == null || root.val == val)
                return root;
            else if (root.val > val)
                return searchBST(root.left, val);
            else
                return searchBST(root.right, val);
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
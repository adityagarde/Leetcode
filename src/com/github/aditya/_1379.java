package com.github.aditya;

public class _1379 {
    // 1 ms, faster than 99.60%, memory 49.9 MB, less than 85.79%
    // Recursive DFS both the trees simultaneously - Time Complexity O(n)
    class Solution {
        public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
            if (original == null)
                return original;
            if (original == target)
                return cloned;

            TreeNode left = getTargetCopy(original.left, cloned.left, target);
            if (left != null)
                return left;

            return getTargetCopy(original.right, cloned.right, target);
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
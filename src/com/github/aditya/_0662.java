package com.github.aditya;

import java.util.HashMap;
import java.util.Map;

public class _0662 {
    // 1 ms, faster than 99.51%, memory 41.7 MB, less than 94.24%
    // Recursive DFS approach, then get the difference.
    class Solution {
        int maxWidth = 0;
        Map<Integer, Integer> map = new HashMap<>();

        public int widthOfBinaryTree(TreeNode root) {
            getWidth(root, 0, 0);
            return maxWidth;
        }

        public void getWidth(TreeNode root, int depth, int position) {
            if (root == null)
                return;

            map.putIfAbsent(depth, position);
            maxWidth = Math.max(maxWidth, position - map.get(depth) + 1);
            getWidth(root.left, depth + 1, 2 * position);
            getWidth(root.right, depth + 1, 2 * position + 1);
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
package com.github.aditya;

import java.util.LinkedList;
import java.util.Queue;

public class _0111 {
    // 0 ms, faster than 100.00%, memory 61.3 MB, less than 99.45%
    // Iterative BFS Approach
    class Solution {
        public int minDepth(TreeNode root) {
            if (root == null) return 0;

            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);

            int depth = 1;
            while (!queue.isEmpty()) {
                int length = queue.size();
                for (int i = 0; i < length; i++) {
                    TreeNode node = queue.poll();
                    if (node.left == null && node.right == null)
                        return depth;
                    else {
                        if (node.left != null) queue.add(node.left);
                        if (node.right != null) queue.add(node.right);
                    }
                }
                depth++;
            }
            return depth;
        }
    }

    // 5 ms, faster than 73.66%, memory 86.9 MB, less than 73.86%
    // Recursive DFS - Time Complexity O(n) and Space Complexity O(h).
    class Solution_1 {
        public int minDepth(TreeNode root) {
            if (root == null) return 0;
            if (root.left == null && root.right == null) return 1;
            if (root.left == null) return 1 + minDepth(root.right);
            if (root.right == null) return 1 + minDepth(root.left);

            return 1 + Math.min(minDepth(root.left), minDepth(root.right));
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
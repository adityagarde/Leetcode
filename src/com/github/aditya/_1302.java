package com.github.aditya;

import java.util.LinkedList;
import java.util.Queue;

public class _1302 {
    // RECURSIVE - 1 ms, faster than 100.00%, memory 44.8 MB, less than 83.76%
    class Solution {
        int sum = 0;
        int depth = 1;

        public int deepestLeavesSum(TreeNode root) {
            if (root == null)
                return 0;
            calculateSum(root, 1);
            return sum;
        }

        private void calculateSum(TreeNode node, int level) {
            if (node == null)
                return;
            if (level > depth) {
                sum = 0;
                depth = level;
            }
            if (depth == level)
                sum += node.val;

            calculateSum(node.left, level + 1);
            calculateSum(node.right, level + 1);
        }
    }

    // ITERATIVE - 6 ms, faster than 51.04%, memory 44.5 MB, less than 92.72%
    class Solution_1 {
        public int deepestLeavesSum(TreeNode root) {
            if (root == null)
                return 0;

            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            int sum = 0;
            while (!queue.isEmpty()) {
                sum = 0; // reset for every level
                int length = queue.size();
                for (int i = 0; i < length; i++) {
                    TreeNode node = queue.poll();
                    if (node != null) {
                        sum += node.val;
                        if (node.left != null) queue.add(node.left);
                        if (node.right != null) queue.add(node.right);
                    }
                }
            }
            return sum;
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
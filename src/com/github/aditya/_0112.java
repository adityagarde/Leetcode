package com.github.aditya;

import java.util.Stack;

public class _0112 {
    // 0 ms, faster than 100.00%, memory 41.9 MB, less than 94.73%
    // Recursive DFS approach, O(n) time complexity
    class Solution {
        public boolean hasPathSum(TreeNode root, int targetSum) {
            return getSumDFS(root, targetSum, 0);
        }

        private boolean getSumDFS(TreeNode node, int targetSum, int currentSum) {
            if (node == null)
                return false;

            currentSum += node.val;

            if (node.left == null && node.right == null)
                return currentSum == targetSum;

            return getSumDFS(node.left, targetSum, currentSum) || getSumDFS(node.right, targetSum, currentSum);
        }
    }

    // Iterative Approach
    // 2 ms, faster than 10.08%, memory 41.8 MB, less than 98.67%
    class Solution_1 {
        public boolean hasPathSum(TreeNode root, int targetSum) {
            if (root == null)
                return false;

            Stack<TreeNode> nodes = new Stack<>();
            Stack<Integer> values = new Stack<>();

            nodes.push(root);
            values.push(root.val);

            while (!nodes.isEmpty()) {
                TreeNode node = nodes.pop();
                int sum = values.pop();

                if (node.left == null && node.right == null && sum == targetSum)
                    return true;

                if (node.left != null) {
                    nodes.push(node.left);
                    values.push(sum + node.left.val);
                }

                if (node.right != null) {
                    nodes.push(node.right);
                    values.push(sum + node.right.val);
                }
            }
            return false;
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
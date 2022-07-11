package com.github.aditya;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _0199 {
    // 0 ms, faster than 100.00%, memory 40.9 MB, less than 91.95%
    // Recursive DFS, Time Complexity O(n) and Space Complexity O(n)
    class Solution {
        public List<Integer> rightSideView(TreeNode root) {
            List<Integer> result = new ArrayList<>();
            rightSideView(root, 0, result);
            return result;
        }

        private void rightSideView(TreeNode node, int depth, List<Integer> result) {
            if (node != null) {
                if (depth == result.size())
                    result.add(node.val);

                rightSideView(node.right, depth + 1, result);
                rightSideView(node.left, depth + 1, result);
            }
        }
    }

    // 1 ms, faster than 95.07%, memory 40.7 MB, less than 95.93%
    // Iterative BFS - Intuitive, Time Complexity O(n)
    class Solution_1 {
        public List<Integer> rightSideView(TreeNode root) {
            List<Integer> result = new ArrayList<>();
            if (root == null)
                return result;

            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);

            while (!queue.isEmpty()) {
                TreeNode node = null;
                int length = queue.size();
                for (int i = 0; i < length; i++) {
                    node = queue.poll();
                    if (node.left != null) queue.add(node.left);
                    if (node.right != null) queue.add(node.right);
                }
                result.add(node.val);
            }
            return result;
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
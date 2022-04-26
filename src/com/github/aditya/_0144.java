package com.github.aditya;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _0144 {
    // 0 ms, faster than 100.00%, memory 40.1 MB, less than 96.57%
    // Recursive Approach - Root - Left - Right
    class Solution {
        List<Integer> result = new ArrayList<>();
        public List<Integer> preorderTraversal(TreeNode root) {
            if (root != null) {
                result.add(root.val);
                preorderTraversal(root.left);
                preorderTraversal(root.right);
            }
            return result;
        }
    }

    // Iterative Approach - 1 ms, faster than 42.08%, memory 40.5 MB, less than 81.64%
    class Solution_1 {
        public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> result = new ArrayList<>();
            if (root == null) return result;
            Stack<TreeNode> stack = new Stack<>();
            stack.push(root);
            while (!stack.isEmpty()) {
                TreeNode node = stack.pop();
                if (node != null) {
                    result.add(node.val);
                    stack.push(node.right);
                    stack.push(node.left);
                }
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
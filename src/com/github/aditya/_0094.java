package com.github.aditya;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _0094 {
    // RECURSIVE - 0 ms, faster than 100.00%, memory 40.8 MB, less than 74.13%
    class Solution {
        List<Integer> result = new ArrayList<>();

        public List<Integer> inorderTraversal(TreeNode root) {
            if (root != null) {
                inorderTraversal(root.left);
                result.add(root.val);
                inorderTraversal(root.right);
            }
            return result;
        }
    }

    // ITERATIVE - 1 ms, faster than 40.60%, memory 41.9 MB, less than 64.76%
    class Solution_1 {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        public List<Integer> inorderTraversal(TreeNode root) {
            while (root != null || !stack.isEmpty()) {
                if (root != null) {
                    stack.push(root);
                    root = root.left;
                } else {
                    TreeNode node = stack.pop();
                    result.add(node.val);
                    root = node.right;
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
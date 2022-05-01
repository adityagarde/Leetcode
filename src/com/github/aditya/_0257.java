package com.github.aditya;

import java.util.ArrayList;
import java.util.List;

public class _0257 {
    // 10 ms, faster than 44.77%, memory 42.4 MB, less than 89.02%
    class Solution {
        List<String> result = new ArrayList<>();

        public List<String> binaryTreePaths(TreeNode root) {
            if (root != null)
                traverse(root, "");

            return result;
        }

        public void traverse(TreeNode node, String path) {
            if (node.left == null && node.right == null)
                result.add(path + node.val);
            if (node.left != null)
                traverse(node.left, path + node.val + "->");
            if (node.right != null)
                traverse(node.right, path + node.val + "->");
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
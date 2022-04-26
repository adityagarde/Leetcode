package com.github.aditya;

import java.util.ArrayList;
import java.util.List;

public class _0145 {
    // 0 ms, faster than 100.00%, memory 40.2 MB, less than 93.77%
    // Recursive Approach - Root - Left - Right
    class Solution {
        List<Integer> result = new ArrayList<>();
        public List<Integer> postorderTraversal(TreeNode root) {
            if (root != null) {
                postorderTraversal(root.left);
                postorderTraversal(root.right);
                result.add(root.val);
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
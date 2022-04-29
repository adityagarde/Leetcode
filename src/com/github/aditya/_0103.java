package com.github.aditya;

import java.util.*;

public class _0103 {
    // 1 ms, faster than 86.62%, memory 41.1 MB, less than 81.33%
    class Solution {
        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            List<List<Integer>> result = new ArrayList<>();
            if (root == null) return result;

            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);

            while (!queue.isEmpty()) {
                List<Integer> subList = new ArrayList<>();
                int length = queue.size();
                for (int i = 0; i < length; i++) {
                    TreeNode node = queue.poll();
                    if (node != null) {
                        subList.add(node.val);
                        if (node.left != null) queue.add(node.left);
                        if (node.right != null) queue.add(node.right);
                    }
                }
                if (result.size() % 2 == 1)
                    Collections.reverse(subList);
                result.add(subList);
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
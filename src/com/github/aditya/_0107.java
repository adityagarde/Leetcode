package com.github.aditya;

import java.util.*;

public class _0107 {
    // 1 ms, faster than 92.94%, memory 43.5 MB, less than 56.07%
    // BFS through the tree, reverse the list.
    class Solution {
        public List<List<Integer>> levelOrderBottom(TreeNode root) {
            List<List<Integer>> result = new ArrayList<>();
            if (root == null)
                return result;

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
                result.add(subList);
            }
            Collections.reverse(result);
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
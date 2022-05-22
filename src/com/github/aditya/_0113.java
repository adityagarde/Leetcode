package com.github.aditya;

import java.util.ArrayList;
import java.util.List;

public class _0113 {
    // 1 ms, faster than 100.00%, memory 42.5 MB, less than 94.00%
    // DFS + Recursion + Backtracking
    class Solution {
        public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
            List<List<Integer>> result = new ArrayList<>();
            getAllPaths(root, targetSum, new ArrayList<>(), result);
            return result;
        }

        private void getAllPaths(TreeNode node, int targetSum, List<Integer> subList, List<List<Integer>> result) {
            if (node == null)
                return;

            subList.add(node.val);
            if (node.left == null && node.right == null && node.val == targetSum)
                result.add(new ArrayList<>(subList));

            getAllPaths(node.left, targetSum - node.val, subList, result);
            getAllPaths(node.right, targetSum - node.val, subList, result);

            subList.remove(subList.size() - 1);
        }
    }

    // 3 ms, faster than 31.78%, memory 45 MB less than 32.44%
    // DFS + Recursion
    class Solution_1 {
        public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
            List<List<Integer>> result = new ArrayList<>();
            getAllPaths(root, targetSum, new ArrayList<>(), result);
            return result;
        }

        private void getAllPaths(TreeNode node, int targetSum, List<Integer> subList, List<List<Integer>> result) {
            if (node == null)
                return;

            subList.add(node.val);
            if (node.left == null && node.right == null && node.val == targetSum) {
                result.add(subList);
                return;
            }

            getAllPaths(node.left, targetSum - node.val, new ArrayList<>(subList), result);
            getAllPaths(node.right, targetSum - node.val, new ArrayList<>(subList), result);
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
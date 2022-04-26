package com.github.aditya;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _0671 {
    // 0 ms, faster than 100.00%, memory 39.4 MB, less than 94.79%
    // Given - Binary Tree with 0 OR 2 children and root.val = min(root.left.val, root.right.val)
    // Using Preorder traversal. Time Complexity O(n)
    class Solution {
        boolean found = false;
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        public int findSecondMinimumValue(TreeNode root) {
            if (root == null)
                return -1;

            if (root.val < first)
                first = root.val;

            if (root.val > first && root.val <= second) {
                found = true;
                second = root.val;
            }

            findSecondMinimumValue(root.left);
            findSecondMinimumValue(root.right);

            return !found ? -1 : second;
        }
    }

    // 0 ms, faster than 100.00%, memory 39.5 MB, less than 91.36%
    // Given - Binary Tree with 0 OR 2 children and root.val = min(root.left.val, root.right.val)
    // Naive Approach - Take inorder traversal without duplicates, sort them and return the second element.
    class Solution_1 {
        List<Integer> list = new ArrayList<>();

        public int findSecondMinimumValue(TreeNode root) {
            list = inOrderTraversal(root);
            Collections.sort(list);
            return list.size() > 1 ? list.get(1) : list.get(0);
        }

        public List<Integer> inOrderTraversal(TreeNode root) {
            if (root != null) {
                inOrderTraversal(root.left);
                if (!list.contains(root.val))
                    list.add(root.val);
                inOrderTraversal(root.right);
            }
            return list;
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
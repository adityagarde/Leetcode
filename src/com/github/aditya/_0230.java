package com.github.aditya;

import java.util.ArrayList;
import java.util.List;

public class _0230 {
    // 0 ms, faster than 100.00%, memory 42 MB, less than 89.62%
    // Maintain a counter (set at k) and then do Inorder traversal.
    class Solution {
        private int count = 0;
        private int result = 0;

        public int kthSmallest(TreeNode root, int k) {
            count = k;
            inOrderTraversal(root);
            return result;
        }

        public void inOrderTraversal(TreeNode root) {
            if (root.left != null)
                inOrderTraversal(root.left);

            count--;

            if (count == 0) {
                result = root.val;
                return;
            }

            if (root.right != null)
                inOrderTraversal(root.right);
        }
    }

    // 1 ms, faster than 59.52%, memory 42.6 MB, less than 54.39%, Not Optimal
    // Inorder traversal will give the node values in sorted order, just return (k-1) th value.
    // O(n) Time Complexity and O(n) space complexity because of extra list required.
    class Solution_1 {
        List<Integer> list = new ArrayList<>();

        public int kthSmallest(TreeNode root, int k) {
            list = inOrderTraversal(root);
            return list.get(k - 1);
        }

        public List<Integer> inOrderTraversal(TreeNode root) {
            if (root != null) {
                inOrderTraversal(root.left);
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
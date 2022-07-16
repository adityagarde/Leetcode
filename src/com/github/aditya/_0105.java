package com.github.aditya;

import java.util.HashMap;
import java.util.Map;

public class _0105 {
    // 2 ms, faster than 99.03% and memory 41.9 MB, less than 95.00%
    // INORDER = Left Root Right && PREORDER = Root Left Right
    // PreOrder array will give the root - we chek this root's position in InOrder array (cached in Map)
    // Left part of this root's index in InOrder is the left subtree and right side is the right subtree.
    class Solution {
        int current;
        public TreeNode buildTree(int[] preorder, int[] inorder) {
            Map<Integer, Integer> inMap = new HashMap<>();

            for (int i = 0; i < inorder.length; i++)
                inMap.put(inorder[i], i);

            current = 0;
            return buildTree(preorder, 0, preorder.length - 1, inMap);
        }

        private TreeNode buildTree(int[] preOrder, int start, int end, Map<Integer, Integer> inMap) {
            if (current >= preOrder.length || start > end)
                return null;

            TreeNode root = new TreeNode(preOrder[current]);
            current++;

            int index = inMap.get(root.val);
            root.left = buildTree(preOrder, start, index - 1, inMap);
            root.right = buildTree(preOrder, index + 1, end, inMap);

            return root;
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
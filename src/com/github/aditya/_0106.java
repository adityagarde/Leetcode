package com.github.aditya;

import java.util.HashMap;
import java.util.Map;

public class _0106 {
    // 2 ms, faster than 98.40%, memory 42.3 MB, less than 84.68%
    // INORDER = Left Root Right && POSTORDER = Left Right Root
    // PostOrder array will give the root - we chek this root's position in InOrder array (cached in Map)
    // Because in PostOrder, root is at the end, we iterate from behind and thus build the right subtree first.
    class Solution {
        int current;
        public TreeNode buildTree(int[] inorder, int[] postorder) {
            Map<Integer, Integer> inMap = new HashMap<>();

            for (int i = 0; i < inorder.length; i++)
                inMap.put(inorder[i], i);

            current = postorder.length - 1;
            return buildTree(postorder, 0, postorder.length - 1, inMap);
        }

        private TreeNode buildTree(int[] postOrder, int start, int end, Map<Integer, Integer> inMap) {
            if (current >= postOrder.length || start > end)
                return null;

            TreeNode root = new TreeNode(postOrder[current]);
            current--;

            int index = inMap.get(root.val);
            root.right = buildTree(postOrder, index + 1, end, inMap);
            root.left = buildTree(postOrder, start, index - 1, inMap);

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
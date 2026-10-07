package com.github.aditya;

public class _0042 {
    // O(n) time, O(n) space
    class Solution {
        public int trap(int[] height) {
            int n = height.length;

            int[] leftMax = new int[n];
            leftMax[0] = height[0];
            for (int i = 1; i < n; i++) {
                leftMax[i] = Math.max(leftMax[i - 1], height[i]);
            }

            int[] rightMax = new int[n];
            rightMax[n - 1] = height[n - 1];
            for (int i = n - 2; i >=0; i--) {
                rightMax[i] = Math.max(height[i], rightMax[i + 1]);
            }

            int water = 0;
            for (int i = 0; i < n; i++) {
                water += Math.min(leftMax[i], rightMax[i]) - height[i];
            }

            return water;
        }
    }
}

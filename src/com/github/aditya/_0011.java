package com.github.aditya;

public class _0011 {
    // 3 ms, faster than 93.85%, memory 52.6 MB, less than 89.40%
    class Solution {
        public int maxArea(int[] height) {
            int left = 0;
            int right = height.length - 1;
            int result = 0;

            while (left < right) {
                int area = (right - left) * Math.min(height[left], height[right]);
                result = Math.max(result, area);

                if (height[left] < height[right])
                    left += 1;
                else
                    right -= 1;
            }
            return result;
        }
    }
}
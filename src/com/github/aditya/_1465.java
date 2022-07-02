package com.github.aditya;

import java.util.Arrays;

public class _1465 {
    // 16 ms, faster than 98.49%, memory 52.1 MB, less than 85.68%
    // Time Complexity O(mlogm + nlogn) and Space Complexity O(1)
    class Solution {
        public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
            Arrays.sort(horizontalCuts);
            Arrays.sort(verticalCuts);

            int maxH = Math.max(horizontalCuts[0], h - horizontalCuts[horizontalCuts.length - 1]);

            for (int i = 1; i < horizontalCuts.length; i++)
                maxH = Math.max(maxH, horizontalCuts[i] - horizontalCuts[i - 1]);

            int maxV = Math.max(verticalCuts[0], w - verticalCuts[verticalCuts.length - 1]);

            for (int i = 1; i < verticalCuts.length; i++)
                maxV = Math.max(maxV, verticalCuts[i] - verticalCuts[i - 1]);

            return (int) ((long) maxH * maxV % 1000000007);
        }
    }
}
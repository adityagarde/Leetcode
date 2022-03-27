package com.github.aditya;

import java.util.HashMap;
import java.util.Map;

public class _0454 {
    // 101 ms, faster than 96.29%, memory 42 MB, less than 97.11%
    class Solution {
        public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
            Map<Integer, Integer> map = new HashMap<>();
            int count = 0;
            for (int num1 : nums1) {
                for (int num2 : nums2) {
                    map.put(num1 + num2, map.getOrDefault(num1 + num2, 0) + 1);
                }
            }

            for (int num3 : nums3) {
                for (int num4 : nums4) {
                    count += map.getOrDefault(-(num3 + num4), 0);
                }
            }
            return count;
        }
    }
}
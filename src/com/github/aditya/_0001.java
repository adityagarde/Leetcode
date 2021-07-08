package com.github.aditya;

import java.util.HashMap;

public class _0001 {

    // 1. Optimal : 1 ms, faster than 90.98%, Memory Usage: 39.1 MB, less than 71.45%
    public static class Solution {
        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer, Integer> numMap = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int diff = target - nums[i];
                if (numMap.containsKey(diff)) {
                    return new int[]{i, numMap.get(diff)};
                }
                numMap.put(nums[i], i);
            }
            return new int[]{-1, -1};
        }
    }

    // 2. Using HashMap : 2 ms, faster than 65.39%, Memory Usage: 42.5 MB, less than 07.56%
    public static class Solution_1 {
        public int[] twoSum(int[] nums, int target) {
            int[] indices = new int[2];
            HashMap<Integer, Integer> numMap = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int diff = target - nums[i];
                if (numMap.containsKey(diff)) {
                    indices[0] = i;
                    indices[1] = numMap.get(diff);
                    break;
                }
                numMap.put(nums[i], i);
            }
            return indices;
        }
    }

    // 3. Bruteforce : O(n^2) : Poor Solution
    public static class Solution_2 {
        public int[] twoSum(int[] nums, int target) {
            int[] indices = new int[2];
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        indices[0] = i;
                        indices[1] = j;
                    }
                }
            }
            return indices;
        }
    }
}
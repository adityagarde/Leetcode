package com.github.aditya;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _1679 {
    class Solution {
        // 20 ms, faster than 92.62%, memory 52 MB, less than 96.50%
        // Time Complexity O(nlogn)
        public int maxOperations(int[] nums, int k) {
            int count = 0;
            int left = 0, right = nums.length - 1;
            Arrays.sort(nums);

            while (left < right) {
                int sum = nums[left] + nums[right];
                if (k == sum) {
                    count++;
                    left++;
                    right--;
                } else if (k < sum)
                    right--;
                else
                    left++;
            }
            return count;
        }
    }

    // 40 ms, faster than 47.96%, memory 54.1 MB, less than 83.69%
    // Extra Space consumption because of HashMap
    class Solution_1 {
        public int maxOperations(int[] nums, int k) {
            int count = 0;
            Map<Integer, Integer> map = new HashMap<>();
            for (int num : nums) {
                int key = k - num;
                if (map.containsKey(key) && (map.get(key) > 0)) {
                    map.put(key, map.get(key) - 1);
                    count++;
                } else {
                    map.put(num, map.getOrDefault(num, 0) + 1);
                }
            }
            return count;
        }
    }
}
package com.github.aditya;

import java.util.HashMap;
import java.util.Map;

public class _0560 {
    // 22 ms, faster than 91.48%, memory 46.7 MB, less than 87.08%
    // Time Complexity O(n) and Space Complexity O(n)
    class Solution {
        public int subarraySum(int[] nums, int k) {
            int count = 0;
            int sum = 0;

            Map<Integer, Integer> map = new HashMap<>();
            map.put(0, 1);

            for (int num : nums) {
                sum += num;
                if (map.containsKey(sum - k))
                    count += map.get(sum - k);
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }

            return count;
        }
    }
}
package com.github.aditya;

import java.util.HashMap;
import java.util.Map;

public class _0523 {
    // 15 ms, faster than 96.52%, memory 57.8 MB, less than 87.14%
    // Time Complexity O(n) and Space Complexity O(n)
    class Solution {
        public boolean checkSubarraySum(int[] nums, int k) {
            Map<Integer, Integer> map = new HashMap<>(); // Remainder : Index Map
            map.put(0, -1); // To handle cases when first array element is multiple of k and we don't want to consider it.
            int total = 0;

            for (int i = 0; i < nums.length; i++) {
                total += nums[i];
                int remainder = total % k;

                if (!map.containsKey(remainder))
                    map.put(remainder, i);
                else if (i - map.get(remainder) > 1)
                    return true;

            }
            return false;
        }
    }
}
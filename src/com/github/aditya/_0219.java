package com.github.aditya;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _0219 {
    // 15 ms, faster than 99.03%, memory 51.3 MB, less than 89.56%
    // Time Complexity O(n) and Space Complexity O(min(N, K+1))
    class Solution {
        public boolean containsNearbyDuplicate(int[] nums, int k) {
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < nums.length; i++) {
                if (!set.add(nums[i]))
                    return true;
                if (i >= k)
                    set.remove(nums[i - k]);
            }
            return false;
        }
    }

    // 19 ms, faster than 91.57%, memory 50.9 MB, less than 90.64%
    // Time Complexity O(n) and Space Complexity O(n)
    class Solution_1 {
        public boolean containsNearbyDuplicate(int[] nums, int k) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) {
                    return true;
                }
                map.put(nums[i], i);
            }
            return false;
        }
    }
}
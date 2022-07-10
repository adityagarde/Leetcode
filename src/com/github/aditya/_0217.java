package com.github.aditya;

import java.util.HashSet;
import java.util.Set;

public class _0217 {
    // 6 ms, faster than 96.84%, memory 68 MB, less than 76.18%
    // Time Complexity O(n) and Space Complexity O(n)
    class Solution {
        public boolean containsDuplicate(int[] nums) {
            Set<Integer> set = new HashSet<>();
            for (int num : nums) {
                if (!set.add(num))
                    return true;
            }
            return false;
        }
    }
}
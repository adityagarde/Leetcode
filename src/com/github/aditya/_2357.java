package com.github.aditya;

import java.util.HashSet;
import java.util.Set;

public class _2357 {
    class Solution {
        public int minimumOperations(int[] nums) {
            Set<Integer> set = new HashSet<>();
            for (int num : nums) {
                if (num > 0) {
                    set.add(num);
                }
            }
            return set.size();
        }
    }
}

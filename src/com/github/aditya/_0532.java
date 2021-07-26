package com.github.aditya;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _0532 {
    // 1. 5 ms, faster than 88.74%
    // Not the best solution to read - bifurcation based on k == 0 or not
    // Set to avoid duplicates, Map in k == 0 case to include duplicates
    class Solution {
        public int findPairs(int[] nums, int k) {
            int count = 0;
            if (k != 0) {
                Set<Integer> numSet = new HashSet<>();
                for (int i : nums)
                    numSet.add(i);
                for (int i : numSet) {
                    if (numSet.contains(k + i))
                        count++;
                }
            } else {
                Map<Integer, Integer> numMap = new HashMap<>();
                for (int i : nums)
                    numMap.put(i, numMap.getOrDefault(i, 0) + 1);
                for (int i : numMap.keySet()) {
                    if (numMap.getOrDefault(i, 0) != 0 && (numMap.get(i) >= 2)) {
                        count++;
                        numMap.replace(i, 0);
                    }
                }
            }
            return count;
        }
    }

    // 2. 7 ms, faster than 79.22%
    // Same logic as above but cleaner code, iterating over keySet to avoid duplicates
    class Solution_1 {
        public int findPairs(int[] nums, int k) {
            int count = 0;
            Map<Integer, Integer> numMap = new HashMap<>();
            for (int i : nums)
                numMap.put(i, numMap.getOrDefault(i, 0) + 1);

            for (int i : numMap.keySet()) {
                if (k != 0 && numMap.containsKey(i + k)) {
                    count++;
                } else if (k == 0 && numMap.get(i) >= 2) {
                    count++;
                }
            }
            return count;
        }
    }
}
package com.github.aditya;

import java.util.HashSet;
import java.util.Set;

public class _0128 {
    // 25 ms, faster than 83.85%, memory 51.4 MB, less than 99.51%
    // Time Complexity O(n) and Space Complexity O(n)
    class Solution {
        public int longestConsecutive(int[] nums) {
            int result = 0;

            Set<Integer> numSet = new HashSet<>();
            for (int num : nums)
                numSet.add(num);

            for (int num : nums) {
                int count = 1;
                int previous = num - 1, next = num + 1;

                while (numSet.contains(previous)) {
                    count++;
                    numSet.remove(previous--);
                }

                while (numSet.contains(next)) {
                    count++;
                    numSet.remove(next++);
                }

                result = Math.max(result, count);
            }
            return result;
        }
    }
}
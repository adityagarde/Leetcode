package com.github.aditya;

import java.util.HashSet;
import java.util.Set;

public class _0003 {
    // 7 ms, faster than 79.63%, memory 42.1 MB, less than 98.11%
    // Time Complexity O(n) and Space Complexity ~ O(1) (only 26 alphabets max).
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            Set<Character> set = new HashSet<>();

            int left = 0, right = 0;
            int maxLength = 0;

            while (right < s.length()) {
                if (!set.contains(s.charAt(right))) {
                    set.add(s.charAt(right));
                    right++;
                    maxLength = Math.max(maxLength, set.size());
                } else {
                    set.remove(s.charAt(left));
                    left++;
                }
            }
            return maxLength;
        }
    }
}
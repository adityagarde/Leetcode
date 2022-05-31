package com.github.aditya;

import java.util.HashSet;
import java.util.Set;

public class _1461 {
    // 169 ms, faster than 55.90%, memory 50.2 MB, less than 89.74%
    // Time Complexity O(nk) and Space Complexity O(nk)
    // Instead of trying to find all binary strings of size k and then searching the string,
    // we just find all unique k length substrings and compare it with number of k length binary combinations (2^k).
    class Solution {
        public boolean hasAllCodes(String s, int k) {
            Set<String> set = new HashSet<>();
            for (int i = 0; i <= s.length() - k; i++) {
                set.add(s.substring(i, i + k));
            }
            return set.size() == Math.pow(2, k);
        }
    }
}
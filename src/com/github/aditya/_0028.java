package com.github.aditya;

public class _0028 {
    // 1 ms, faster than 57.63%, memory 41.9 MB, less than 55.11%
    // Time Complexity O(m*n) and Space Complexity O(1)
    class Solution {
        public int strStr(String haystack, String needle) {
            if (needle.isEmpty()) return 0;

            for (int i = 0; i < haystack.length() + 1 - needle.length(); i++) {
                if (haystack.substring(i, i + needle.length()).equals(needle))
                    return i;
            }
            return -1;
        }
    }
}
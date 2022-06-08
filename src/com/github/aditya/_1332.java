package com.github.aditya;

public class _1332 {
    // 0 ms, faster than 100.00%, memory 39.7 MB, less than 99.66%
    // Time Complexity O(n) and Space Complexity O(1)
    class Solution {
        public int removePalindromeSub(String s) {
            if (s.isEmpty()) return 0;
            for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
                if (s.charAt(i) != s.charAt(j))
                    return 2;
            }
            return 1;
        }
    }
}
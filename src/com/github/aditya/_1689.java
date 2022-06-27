package com.github.aditya;

public class _1689 {
    // 6 ms, faster than 94.61%, memory 42.5 MB, less than 98.00%
    // Time Complexity O(n) and Space Complexity O(1)
    class Solution {
        public int minPartitions(String n) {
            int result = 0;
            for (int i = 0; i < n.length(); i++)
                result = Math.max(result, n.charAt(i) - '0');

            return result;
        }
    }
}
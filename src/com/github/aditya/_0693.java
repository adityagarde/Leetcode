package com.github.aditya;

public class _0693 {
    // 0 ms, faster than 100.00%, memory 39.2 MB, less than 88.20%
    static class Solution {
        public boolean hasAlternatingBits(int n) {
            int last = n % 2;
            n = n >> 1;

            while (n > 0) {
                int current = n % 2;
                if (current == last)
                    return false;

                last = current;
                n = n >> 1;
            }
            return true;
        }
    }
}
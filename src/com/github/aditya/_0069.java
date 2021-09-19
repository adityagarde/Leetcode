package com.github.aditya;

public class _0069 {
    class Solution {
        public int mySqrt(int x) {
            if (x == 0 || x == 1)
                return x;
            int left = 0, right = x, result = 0;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (mid <= x / mid) {
                    left = mid + 1;
                    result = mid;
                } else {
                    right = mid - 1;
                }
            }
            return result;
        }
    }
}
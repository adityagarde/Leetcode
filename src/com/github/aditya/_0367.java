package com.github.aditya;

public class _0367 {
    // 0 ms, faster than 100.00%
    class Solution {
        public boolean isPerfectSquare(int num) {
            if (num == 1 || num == 0)
                return true;
            long left = 1;
            long right = num / 2;
            while (left <= right) {
                long mid = left + (right - left) / 2;
                if (mid * mid == num)
                    return true;
                else if (mid * mid > num)
                    right = mid - 1;
                else
                    left = mid + 1;
            }
            return false;
        }
    }
}
package com.github.aditya;

public class _2177 {
    // 0 ms, faster than 100.00%, memory 40.4 MB, less than 95.77%
    class Solution {
        public long[] sumOfThree(long num) {
            if (num % 3 == 0) {
                num = num / 3;
                return new long[]{num - 1, num, num + 1};
            }

            return new long[0];
        }
    }
}
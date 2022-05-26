package com.github.aditya;

public class _0231 {
    // Power of Two => They will have only 1 set bit - thus taking the bitwise & operator to get the set bits.

    // 1 ms, faster than 97.90%, memory 39.5 MB, less than 88.84%
    class Solution {
        public boolean isPowerOfTwo(int n) {
            return n > 0 && (n & (n - 1)) == 0;
        }
    }

    // 1 ms, faster than 97.90%, memory 41 MB, less than 66.65%
    class Solution_1 {
        public boolean isPowerOfTwo(int n) {
            int count = 0;
            while (n > 0) {
                n = n & (n - 1);
                count++;
            }
            return count == 1;
        }
    }

    // 1 ms, faster than 97.90%, memory 39.1 MB, less than 98.44%
    class Solution_2 {
        public boolean isPowerOfTwo(int n) {
            long temp = 1;
            while (temp < n) {
                temp = temp << 1; // multiply by 2
            }
            return temp == n;
        }
    }
}
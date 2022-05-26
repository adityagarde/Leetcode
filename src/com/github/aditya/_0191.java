package com.github.aditya;

public class _0191 {
    // Optimal Solution - 0 ms, faster than 100%, memory 35.9 less than 99.98%
    // num = num & (num - 1) : Stop when num becomes 0
    // Flipping the least significant 1 bit
    // Pro - Time Complexity O(#Set Bits), Worst case O(32)
    public class Solution {
        // you need to treat n as an unsigned value
        public int hammingWeight(int n) {
            int count = 0;
            while (n != 0) {
                n = n & (n - 1);
                count++;
            }
            return count;
        }
    }

    // Same logic as above, but recursive.
    // 0 ms, faster than 100.00%, memory 38.9 MB, less than 98.92%
    public class Solution_1 {
        // you need to treat n as an unsigned value
        public int hammingWeight(int n) {
            if (n == 0 || n == 1)
                return n;
            return hammingWeight(n & (n - 1)) + 1;
        }
    }

    //   0010 0001
    // &  [1]    1  << Left Shift
    // -------------   and count++ on every non-zero (1) occurrence
    //   0010 0001
    // Con - Compulsory loop 32  - Best Case O(32)
    public class Solution_2 {
        // you need to treat n as an unsigned value
        public int hammingWeight(int n) {
            int count = 0, mask = 1;
            for (int i = 0; i < 32; i++) {
                if ((n & mask) != 0) count++;
                mask = mask << 1;
            }
            return count;
        }
    }
}
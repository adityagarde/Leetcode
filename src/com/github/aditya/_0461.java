package com.github.aditya;

public class _0461 {
    //0 ms, faster than 100.00%, 37.8 MB, less than 8.28%
    // num = num & num - 1; Flipping the least significant 1 bit
    class Solution {
        public int hammingDistance(int x, int y) {
            int count = 0;
            int num = x ^ y;
            while (num > 0) {
                num = num & (num - 1);
                count++;
            }
            return count;
        }
    }

    //0 ms, faster than 100.00%, 35.8 MB, less than 50.19%
    // x & 1 is same as x % 2
    // Taking XOR of the last place digits - right shift for the next
    class Solution_1 {
        public int hammingDistance(int x, int y) {
            int count = 0;
            while (x > 0 && y > 0) {
                count += (x & 1) ^ (y & 1);
                x = x >> 1;
                y = y >> 1;
            }
            return count;
        }
    }
}

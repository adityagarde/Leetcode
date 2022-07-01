package com.github.aditya;

import java.util.Arrays;

public class _2279 {
    // 15 ms, faster than 98.71%, memory 53.1 MB, less than 92.72%
    class Solution {
        public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
            int count = 0;
            for (int i = 0; i < capacity.length; i++)
                capacity[i] -= rocks[i];

            Arrays.sort(capacity);

            for (int i = 0; i < capacity.length; i++) {
                if (capacity[i] < additionalRocks) {
                    additionalRocks -= capacity[i];
                    count++;
                }
            }

            return count;
        }
    }
}
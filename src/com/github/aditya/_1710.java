package com.github.aditya;

import java.util.Arrays;

public class _1710 {
    // 8 ms, faster than 93.78%, memory 42.3 MB, less than 97.81%
    class Solution {
        public int maximumUnits(int[][] boxTypes, int truckSize) {
            int result = 0;
            Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
            for (int i = 0; i < boxTypes.length && truckSize > 0; i++) {
                int count = Math.min(boxTypes[i][0], truckSize);
                result += count * boxTypes[i][1];
                truckSize -= count;
            }

            return result;
        }
    }
}
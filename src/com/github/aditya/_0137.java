package com.github.aditya;

import java.util.HashMap;

public class _0137 {
    class Solution {
        public int singleNumber(int[] nums) {
            int num = 0;
            for (int i = 0; i < 32; i++) {
                int sum = 0;
                for (int j : nums) {
                    if (((j >> i) & 1) == 1)
                        sum++;
                }
                num = num | (sum % 3) << i;
            }
            return num;
        }
    }

    class Solution_1 {
        public int singleNumber(int[] nums) {
            int num = 0;
            for (int i = 0; i < 32; i++) {
                int sum = 0, mask = 1 << i;
                for (int j : nums) {
                    if ((j & mask) != 0)
                        sum++;
                }
                if (sum % 3 == 1)
                    num = num | mask;
            }
            return num;
        }
    }


    class Solution_2 {
        public int singleNumber(int[] nums) {
            HashMap<Integer, Integer> freqMap = new HashMap<>();
            for (int i : nums) {
                freqMap.put(i, freqMap.getOrDefault(i, 0) + 1);
            }

            for (int i : freqMap.keySet()) {
                if (freqMap.get(i) == 1)
                    return i;
            }
            return -1;
        }
    }
}

package com.github.aditya;

import java.util.HashMap;
import java.util.Map;

public class _0169 {
    // HashMap approach
    // 12ms, faster than 35.41%, 52.62MB less than 80.91%
    class Solution {
        public int majorityElement(int[] nums) {
            int half = nums.length / 2;
            HashMap<Integer, Integer> freqMap = new HashMap<>();

            for (int i = 0; i < nums.length; i++) {
                freqMap.put(nums[i], freqMap.getOrDefault(nums[i], 0) + 1);
            }

            for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
                if (entry.getValue() > half) {
                    return entry.getKey();
                }
            }

            return 0;
        }
    }

    // Moore Voting Algorithm, O(1) space
    // 1ms beats 99.83%, 55.74 MB beats 34.73%
    class Solution_01 {
        public int majorityElement(int[] nums) {
            int count = 0;
            int candidate = 0;

            for (int num : nums) {
                if (count == 0) {
                    candidate = num;
                }

                if (num == candidate) {
                    count++;
                } else {
                    count--;
                }
            }

            return candidate;
        }
    }
}
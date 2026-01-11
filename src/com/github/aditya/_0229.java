package com.github.aditya;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _0229 {
    class Solution {
        // 12ms beats 46.84%, 51.12MB beats 93.70%
        public List<Integer> majorityElement(int[] nums) {
            int third = nums.length / 3;
            HashMap<Integer, Integer> freqMap = new HashMap<>();

            for (int i = 0; i < nums.length; i++) {
                freqMap.put(nums[i], freqMap.getOrDefault(nums[i], 0) + 1);
            }

            List<Integer> result = new ArrayList<>();
            for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
                if (entry.getValue() > third) {
                    result.add(entry.getKey());
                }
            }

            return result;
        }
    }
}

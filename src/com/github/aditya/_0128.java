package com.github.aditya;

import java.util.HashSet;
import java.util.Set;

public class _0128 {
    class Solution {
        public int longestConsecutive(int[] nums) {
            int result = 0;

            Set<Integer> numSet = new HashSet<>();
            for (int num : nums)
                numSet.add(num);

            for (int num : numSet) {
                if (!numSet.contains(num - 1)) {
                    int count = 1;
                    int thisNum = num;
                    while (numSet.contains(thisNum + 1)) {
                        thisNum++;
                        count++;
                    }
                    result = Math.max(count, result);
                }
            }
            return result;
        }
    }
}

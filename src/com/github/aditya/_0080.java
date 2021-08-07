package com.github.aditya;

public class _0080 {
    // Oms, faster than 100%, In place solution
    class Solution {
        public int removeDuplicates(int[] nums) {
            if (nums.length < 3)
                return nums.length;

            int i = 1, j = 1;
            int count = 1;
            while (j < nums.length) {
                if (nums[j] == nums[j - 1]) {
                    if (count < 2) {
                        nums[i] = nums[j];
                        i++;
                    }
                    count++;
                } else {
                    count = 1;
                    nums[i] = nums[j];
                    i++;
                }
                j++;
            }
            return i;
        }
    }
}
package com.github.aditya;

import java.util.Arrays;

public class _0016 {
    // 5 ms, faster than 96.11%, memory 41.9 MB, less than 83.07%
    class Solution {
        public int threeSumClosest(int[] nums, int target) {
            Arrays.sort(nums);
            int result = 0;
            int diff = Integer.MAX_VALUE;

            for (int i = 0; i < nums.length - 2; i++) {
                int left = i + 1;
                int right = nums.length - 1;
                while (left < right) {
                    int sum = nums[i] + nums[left] + nums[right];
                    if (sum == target)
                        return target;
                    else if (sum > target) right--;
                    else left++;

                    if (Math.abs(target - sum) < diff) {
                        diff = Math.abs(target - sum);
                        result = sum;
                    }
                }
            }
            return result;
        }
    }
}
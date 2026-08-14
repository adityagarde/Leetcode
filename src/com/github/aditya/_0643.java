package com.github.aditya;

public class _0643 {
    // 2ms beats 99.76%, 69.03MB beats 96.60%
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int max = sum;

        for (int i = k; i < nums.length; i++) {
            sum = sum + nums[i] - nums[i - k];
            max = Math.max(sum, max);
        }

        return (double) max / k;
    }
}

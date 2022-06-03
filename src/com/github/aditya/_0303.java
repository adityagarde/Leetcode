package com.github.aditya;

public class _0303 {
    // 7 ms, faster than 97.22%, memory 44.9 MB, less than 97.83%
    class NumArray {
        private final int[] nums;

        public NumArray(int[] nums) {
            for (int i = 1; i < nums.length; i++) {
                nums[i] += nums[i - 1];
            }
            this.nums = nums;
        }

        public int sumRange(int left, int right) {
            return left == 0 ? nums[right] : nums[right] - nums[left - 1];
        }
    }
    /**
     * Your NumArray object will be instantiated and called as such:
     * NumArray obj = new NumArray(nums);
     * int param_1 = obj.sumRange(left,right);
     */
}
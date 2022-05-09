package com.github.aditya;

import java.util.ArrayDeque;
import java.util.Deque;

public class _0456 {
    // 10 ms, faster than 78.75%, memory 60.5 MB, less than 99.80%
    class Solution {
        public boolean find132pattern(int[] nums) {
            if (nums.length < 3)
                return false;
            Deque<Integer> stack = new ArrayDeque<>();
            int k = Integer.MIN_VALUE;
            for (int i = nums.length - 1; i >= 0; i--) {
                if (k > nums[i])
                    return true;

                while (!stack.isEmpty() && nums[i] > stack.peek())
                    k = stack.pop();

                stack.push(nums[i]);
            }
            return false;
        }
    }
}
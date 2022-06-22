package com.github.aditya;

import java.util.PriorityQueue;

public class _0215 {
    // 3 ms, faster than 87.76%, memory 42.4 MB, less than 89.99%
    class Solution {
        public int findKthLargest(int[] nums, int k) {
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();

            for (int i = 0; i < k; i++)
                minHeap.add(nums[i]);

            for (int i = k; i < nums.length; i++) {
                if (nums[i] > minHeap.peek()) {
                    minHeap.poll();
                    minHeap.add(nums[i]);
                }
            }
            return minHeap.peek();
        }
    }
}
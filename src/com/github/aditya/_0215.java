package com.github.aditya;

import java.util.PriorityQueue;

public class _0215 {
    // 4 ms, faster than 78.74%, 44.9 MB, less than 43.84%
    class Solution {
        public int findKthLargest(int[] nums, int k) {
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();

            for (int i = 0; i < k; i++) {
                minHeap.add(nums[i]);
            }

            for (int i = k; i < nums.length; i++) {
                if (minHeap.peek() < nums[i]) {
                    minHeap.poll();
                    minHeap.add(nums[i]);
                }
            }
            return minHeap.peek();
        }
    }
}
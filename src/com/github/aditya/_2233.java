package com.github.aditya;

import java.util.PriorityQueue;

public class _2233 {
    // 363 ms, faster than 81.98%, memory 52.5 MB, less than 95.67%
    // Time Complexity O(k * logn) and Space Complexity O(n)
    class Solution {
        public int maximumProduct(int[] nums, int k) {
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();

            for (int num : nums)
                minHeap.add(num);

            while (k > 0) {
                int min = minHeap.poll();
                minHeap.add(min + 1);
                k--;
            }

            long result = 1;

            while (!minHeap.isEmpty())
                result = (result * minHeap.poll()) % 1000000007;

            return (int) result;
        }
    }
}
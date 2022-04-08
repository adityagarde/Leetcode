package com.github.aditya;

import java.util.PriorityQueue;

public class _0703 {
    // 10 ms, faster than 99.87%, memory 45.2 MB, less than 97.86%
    class KthLargest {
        final PriorityQueue<Integer> minHeap;
        final int k;

        public KthLargest(int k, int[] nums) {
            this.k = k;
            minHeap = new PriorityQueue<>(k + 1);
            for (int num : nums)
                add(num);
        }

        public int add(int val) {
            if (minHeap.size() < k)
                minHeap.offer(val);
            else if (minHeap.peek() < val) {
                minHeap.poll();
                minHeap.offer(val);
            }
            return minHeap.peek();
        }
    }

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
}

package com.github.aditya;

import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class _2099 {
    // 8 ms, faster than 74.55%, memory 42.5 MB, less than 86.98%
    // Time Complexity O(n * logk) and Space Complexity O(k).
    class Solution {
        public int[] maxSubsequence(int[] nums, int k) {
            PriorityQueue<int[]> minHeap = new PriorityQueue<>(k, Comparator.comparingInt(a -> a[0]));
            int[] result = new int[k];

            // 1. Create a minHeap of size k with the largest k elements - along with their original indices.
            // Index maintained to preserve the order of the nums.
            for (int i = 0; i < nums.length; i++) {
                minHeap.add(new int[]{nums[i], i});
                if (minHeap.size() > k)
                    minHeap.poll();
            }

            // 2. Create a HashSet of all the indices of the k elements of the minHeap.
            Set<Integer> index = new HashSet<>();
            while (!minHeap.isEmpty()) {
                int[] entry = minHeap.poll();
                index.add(entry[1]);
            }

            // 3. Iterate again through arr, if the index exists in the HashSet add its num in the result[].
            int p = 0;
            for (int i = 0; i < nums.length; i++) {
                if (index.contains(i)) {
                    result[p] = nums[i];
                    p++;
                }
            }

            return result;
        }
    }
}
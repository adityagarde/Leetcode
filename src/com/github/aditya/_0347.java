package com.github.aditya;

import java.util.HashMap;
import java.util.PriorityQueue;

public class _0347 {
    // 9 ms, faster than 95.30%, memory 44.9 MB, less than 87.92%
    // Time Complexity - O(nlogk)
    class Solution {
        public int[] topKFrequent(int[] nums, int k) {
            HashMap<Integer, Integer> map = new HashMap<>();

            for (int num : nums)
                map.put(num, map.getOrDefault(num, 0) + 1);

            PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
            for (int n : map.keySet())
                maxHeap.add(n);

            int[] result = new int[k];

            for (int i = 0; i < k; i++)
                result[i] = maxHeap.poll();

            return result;
        }
    }
}
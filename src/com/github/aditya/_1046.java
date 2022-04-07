package com.github.aditya;

import java.util.Collections;
import java.util.PriorityQueue;

public class _1046 {
    public static class Solution {
        // 1 ms, faster than 98.65%, 39.4 MB, less than 97.92%
        // Time Complexity O(nlog(n))
        public int lastStoneWeight(int[] stones) {
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
            for (int stone : stones) {
                maxHeap.add(stone);
            }

            while (maxHeap.size() > 1) {
                int first = maxHeap.poll();
                int second = maxHeap.poll();
                if (first > second) {
                    maxHeap.add(first - second);
                }
            }
            return maxHeap.isEmpty() ? 0 : maxHeap.peek();
        }
    }
}
package com.github.aditya;

import java.util.PriorityQueue;

public class _1642 {
    // 16 ms, faster than 97.94%, memory 58.6 MB, less than 84.88%
    // Time Complexity O(n * log L) and Space Complexity O(L)

    /**
     * Start with i = 1, calculate the diff with the previous height.
     * We need resources only when diff > 0. Now, if ladders are available then add to the minHeap.
     * If the diff (current climb) is larger than the smallest ladder distance (i.e. minHeap.peek() < diff),
     * this means there is scope of optimisation as ladder should rather be used for the current diff,
     * so replace the prev. ladder with the bricks.
     * int bricksRequired = diff; => If there is no optimisation then anyways diff amount of bricks are required and if
     * optimisation is there (as mentioned above) then new bricksRequired = prev ladder length i.e. minHeap.poll().
     * Next we just check if we have enough bricks to complete this climb and continue (after subtraction) if YES,
     * and return current height (i.e. i - 1) if NOT.
     * return heights.length - 1 => Default case - we were able to climb till end using the resources given.
     */
    class Solution {
        public int furthestBuilding(int[] heights, int bricks, int ladders) {
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();
            for (int i = 1; i < heights.length; i++) {
                int diff = heights[i] - heights[i - 1];
                if (diff > 0) {
                    if (minHeap.size() < ladders)
                        minHeap.add(diff);
                    else {
                        int bricksRequired = diff;
                        if (!minHeap.isEmpty() && minHeap.peek() < diff) {
                            minHeap.add(diff);
                            bricksRequired = minHeap.poll();
                        }
                        if (bricks - bricksRequired >= 0)
                            bricks -= bricksRequired;
                        else return i - 1;
                    }
                }
            }
            return heights.length - 1;
        }
    }
}
package com.github.aditya;

import java.util.PriorityQueue;

public class _1642 {
    // 16 ms, faster than 97.94%, memory 58.6 MB, less than 84.88%
    // Time Complexity O(n * log L) and Space Complexity O(L)

    /*
    1. Start with `i = 1`, calculate the diff with the previous height.
    2. We need resources (ladders or bricks) only when `diff > 0`.
    3. Now, if ladders are available then add to the minHeap `(minHeap.add(diff))`
    4. If the `diff` (current climb) is larger than the smallest ladder distance (i.e. `minHeap.peek() < diff)`,
       this means there is scope of optimisation as a ladder should rather be used for the current `diff` rather than bricks.
    5. So replace the previous ladder with the bricks by putting `bricksRequired` as previous ladder length i.e. `minHeap.poll()`.
    6. For the normal (non-optimised) case we have `int bricksRequired = diff`, as anyways `diff` number of bricks are required (will be consumed).
    7. Next we just check if we have enough bricks to complete this climb.
       If YES then we subtract the `bricksRequired` from the total bricks available and continue.
    8. If we don't have enough bricks left this means we have already reached the farthest height so we return the current height i.e. `i -1`.
    9. Default case is when we were able to climb and reach till the end using the resources given - so we simply return `heights.length - 1`.
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
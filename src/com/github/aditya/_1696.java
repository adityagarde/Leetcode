package com.github.aditya;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class _1696 {
    // 25 ms, faster than 92.74%, memory 58 MB, less than 90.32%
    // Time Complexity O(n) and Space Complexity O(k)
    // Double ended queues better than PQ as no internal sorting required & can access values from both end efficiently
    class Solution {
        public int maxResult(int[] nums, int k) {
            int max = nums[0];
            Deque<Integer> deque = new ArrayDeque<>();
            deque.add(0);

            for (int i = 1; i < nums.length; i++) {
                nums[i] += nums[deque.peekFirst()];
                while (!deque.isEmpty() && nums[i] >= nums[deque.peekLast()])
                    deque.pollLast();

                deque.add(i);
                if (i - deque.peekFirst() >= k)
                    deque.pollFirst();
            }
            return nums[nums.length - 1];
        }
    }

    // 67 ms, faster than 40.81%, memory 56.7 MB, less than 94.84%
    // Time Complexity O(n*logk) and Space Complexity O(k)
    // We are using q.add() & q.remove() - it takes time to internally reorder(heapify)
    // So this approach is better than bland sorting but still a bit costly.
    class Solution_1 {
        public int maxResult(int[] nums, int k) {
            int max = nums[0];
            // [index, maxSum]
            PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> b[1] - a[1]);
            queue.add(new int[]{0, nums[0]});

            for (int i = 1; i < nums.length; i++) {
                while (i - queue.peek()[0] > k) // Required as we need to compare elements only in k element window
                    queue.poll();               // Removing any entries that are farther than k distance away

                max = nums[i] + queue.peek()[1]; // Get Max value by peeking
                queue.add(new int[]{i, max});
            }
            return max;
        }
    }
}
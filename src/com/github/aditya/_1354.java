package com.github.aditya;

import java.util.PriorityQueue;

public class _1354 {
    // A. 2 ms, faster than 100.00%, memory 57.1 MB, less than 80.21%
    // Time Complexity O(nlog MaxA) and Space Complexity O(MaxA)
    class Solution {
        public boolean isPossible(int[] target) {
            long sum = 0;
            int maxIndex = 0;

            for (int i = 0; i < target.length; i++) {
                sum += target[i];
                if (target[maxIndex] < target[i])
                    maxIndex = i;
            }

            long diff = sum - target[maxIndex];

            if (target[maxIndex] == 1 || diff == 1)
                return true;

            if (diff > target[maxIndex] || diff == 0 || target[maxIndex] % diff == 0)
                return false;

            target[maxIndex] %= diff;

            return isPossible(target);
        }
    }

    // B. 10 ms, faster than 89.58%, memory 49.9 MB, less than 87.50%
    // Time Complexity O(n logn) and Space Complexity O(n).
    class Solution_1 {
        public boolean isPossible(int[] target) {
            long sum = 0;
            PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

            for (int num : target) {
                sum += num;
                pq.add(num);
            }

            while (pq.peek() != 1) {
                int value = pq.poll();
                sum -= value;

                if (value == 1 || sum == 1)
                    return true;

                if (sum > value || sum == 0 || value % sum == 0)
                    return false;

                value %= sum;
                sum += value;
                pq.add(value);
            }
            return true;
        }
    }
}
package com.github.aditya;

import java.math.BigInteger;
import java.util.PriorityQueue;

public class _1985 {
    // 66 ms, faster than 60.66%, 64.8 MB, less than 61.93%
    class Solution {
        public String kthLargestNumber(String[] nums, int k) {
            PriorityQueue<String> minHeap = new PriorityQueue<>((s1, s2) -> {
                if (s1.length() == s2.length()) return s1.compareTo(s2);
                else return s1.length() - s2.length();
            });

            for (int i = 0; i < nums.length; i++) {
                if (i < k) minHeap.add(nums[i]);
                else {
                    minHeap.add(nums[i]);
                    minHeap.poll();
                }
            }
            return minHeap.peek();
        }
    }

    // 159 ms, faster than 23.59%, Using BigInteger and String parsing, Not optimal
    class Solution_1 {
        public String kthLargestNumber(String[] nums, int k) {
            PriorityQueue<BigInteger> minHeap = new PriorityQueue<>();

            for (int i = 0; i < k; i++) {
                minHeap.add(new BigInteger(nums[i]));
            }

            for (int i = k; i < nums.length; i++) {
                if (minHeap.peek().compareTo(new BigInteger(nums[i])) > -1) {
                    minHeap.poll();
                    minHeap.add(new BigInteger(nums[i]));
                }
            }
            return minHeap.peek().toString();
        }
    }
}
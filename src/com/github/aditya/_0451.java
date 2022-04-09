package com.github.aditya;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class _0451 {
    // 10 ms, faster than 90.85%, memory 43.3 MB, less than 86.86%
    // Time Complexity O(nlogk) and Space Complexity O(n), k = unique chars in String
    static class Solution {
        public String frequencySort(String s) {
            Map<Character, Integer> map = new HashMap<>();
            for (char ch : s.toCharArray())
                map.put(ch, map.getOrDefault(ch, 0) + 1);

            PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> (map.get(b) - map.get(a)));
            maxHeap.addAll(map.keySet());

            StringBuilder result = new StringBuilder();
            while (!maxHeap.isEmpty()) {
                char ch = maxHeap.poll();
                result.append(String.valueOf(ch).repeat(Math.max(0, map.get(ch))));
            }

            return result.toString();
        }
    }
}
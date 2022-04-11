package com.github.aditya;

import java.util.*;

public class _1636 {
    // 3 ms, faster than 99.07%, memory 42.8 MB, less than 82.98% - O(nlogn)
    class Solution {
        public int[] frequencySort(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();

            for (int num : nums)
                map.put(num, map.getOrDefault(num, 0) + 1);

            PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> a[1] == b[1] ? b[0] - a[0] : a[1] - b[1]);

            for (Map.Entry<Integer, Integer> entry : map.entrySet())
                heap.add(new int[]{entry.getKey(), entry.getValue()});

            int i = 0;
            while (!heap.isEmpty()) {
                int[] min = heap.poll();
                while (i < nums.length && min[1] > 0) {
                    nums[i++] = min[0];
                    min[1]--;
                }
            }
            return nums;
        }
    }

    // 8 ms, faster than 69.85%, memory 44.2 MB, less than 76.50%
    class Solution_1 {
        public int[] frequencySort(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int num : nums)
                map.put(num, map.getOrDefault(num, 0) + 1);

            List<Integer> list = new ArrayList<>(map.keySet());
            list.sort((a, b) -> (map.get(a) == map.get(b)) ? b - a : map.get(a) - map.get(b));

            int[] result = new int[nums.length];
            int i = 0;
            for (int num : list) {
                for (int j = 0; j < map.get(num); j++) {
                    result[i++] = num;
                }
            }
            return result;
        }
    }
}
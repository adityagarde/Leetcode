package com.github.aditya;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _0056 {
    // 8ms beats 91.66%
    class Solution {
        public int[][] merge(int[][] intervals) {
            Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], a[0]));
            List<int[]> result = new ArrayList<>();

            for (int[] interval : intervals) {
                if (result.isEmpty()) {
                    result.add(interval);
                } else {
                    int[] last = result.get(result.size() - 1);
                    if (interval[0] <= last[1]) {
                        last[1] = Math.max(interval[1], last[1]);
                    } else {
                        result.add(interval);
                    }
                }
            }
            return result.toArray(new int[result.size()][]);
        }
    }
}

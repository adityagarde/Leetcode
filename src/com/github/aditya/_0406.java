package com.github.aditya;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _0406 {
    // 6 ms, faster than 97.89%, memory 42.6 MB, less than 100.00%
    class Solution {
        public int[][] reconstructQueue(int[][] people) {
            Arrays.sort(people, (a, b) -> a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]);

            List<int[]> result = new ArrayList<>();

            for (int[] arr : people)
                result.add(arr[1], arr);

            return result.toArray(new int[people.length][2]);
        }
    }
}
package com.github.aditya;

import java.util.ArrayList;
import java.util.List;

public class _0118 {
    // 0 ms, faster than 100.00%, memory 39.8 MB, less than 95.88%
    class Solution {
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> result = new ArrayList<>();
            List<Integer> current, previous = null;
            for (int i = 0; i < numRows; i++) {
                current = new ArrayList<>();
                for (int j = 0; j <= i; j++) {
                    if (j == 0 || j == i)
                        current.add(1);
                    else
                        current.add(previous.get(j - 1) + previous.get(j));
                }
                previous = current;
                result.add(current);
            }
            return result;
        }
    }
}
package com.github.aditya;

import java.util.ArrayList;
import java.util.List;

public class _0119 {
    // 1 ms, faster than 91.54%, memory 40.2 MB, less than 85.55%
    class Solution {
        public List<Integer> getRow(int rowIndex) {
            List<Integer> result = new ArrayList<>();
            for (int i = 0; i <= rowIndex; i++) {
                result.add(1);
                for (int j = i - 1; j > 0; j--) {
                    result.add(j, result.get(j - 1) + result.get(j));
                }
            }
            return result;
        }
    }
}
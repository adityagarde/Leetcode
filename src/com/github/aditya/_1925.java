package com.github.aditya;

import java.util.HashSet;

public class _1925 {
    class Solution {
        public int countTriples(int n) {
            int count = 0;
            HashSet<Integer> numSet = new HashSet<Integer>();
            for (int i = 5; i <= n; i++)
                numSet.add(i * i);

            for (int i = 1; i < n; i++) {
                for (int j = i; j < n; j++) {
                    int sum = i * i + j * j;
                    if (numSet.contains(sum)) {
                        count += 2;
                    }
                }
            }
            return count;
        }
    }
}
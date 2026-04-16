package com.github.aditya;

public class _1796 {
    // 1ms beats 97.35%
    class Solution {
        public int secondHighest(String s) {
            int first = -1;
            int second = -1;

            for (char ch : s.toCharArray()) {
                if (ch >= '0' && ch <= '9') {
                    int num = ch - '0';
                    if (num > first) {
                        second = first;
                        first = num;
                    } else if (num < first && num > second) {
                        second = num;
                    }
                }
            }
            return second;
        }
    }
}
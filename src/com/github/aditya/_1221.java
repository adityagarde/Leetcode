package com.github.aditya;

public class _1221 {
    public static class Solution {
        public int balancedStringSplit(String s) {
            int result = 0, count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'R')
                    count++;
                else
                    count--;
                if (count == 0)
                    result++;
            }
            return result;
        }
    }
}

package com.github.aditya;

public class _0921 {
    public static class Solution {
        public int minAddToMakeValid(String s) {
            int l = 0, r = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') {
                    l++;
                } else if (l > 0 && s.charAt(i) == ')') {
                    l--;
                } else if (s.charAt(i) == ')') {
                    r++;
                } else if (r > 0 && s.charAt(i) == '(') {
                    r--;
                }
            }
            return l + r;
        }
    }
}

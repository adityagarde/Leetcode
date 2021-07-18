package com.github.aditya;

public class _0680 {
    public static class Solution {
        public boolean validPalindrome(String s) {
            int i = 0, j = s.length() - 1;
            boolean deleted = false;
            while (i < j) {
                if (s.charAt(i) != s.charAt(j)) {
                    if (deleted) return false;
                    else {
                        deleted = true;
                        return isPalindrome(s, i + 1, j) || isPalindrome(s, i, j - 1);
                    }
                }
                i++;
                j--;
            }
            return true;
        }

        private boolean isPalindrome(String s, int i, int j) {
            while (i < j) {
                if (s.charAt(i) != s.charAt(j))
                    return false;
                i++;
                j--;
            }
            return true;
        }
    }
}
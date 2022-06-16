package com.github.aditya;

public class _0005 {
    // 45 ms, faster than 66.16%, memory 42.2 MB, less than 94.37%
    // Time Complexity O(n^2) - better than bruteforce O(n^3) and Space Complexity O(1)
    class Solution {
        public String longestPalindrome(String s) {
            String result = "";
            int maxLength = 0;

            for (int i = 0; i < s.length(); i++) {
                int left = i, right = i;
                while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                    if ((right - left + 1) > maxLength) {
                        maxLength = right - left + 1;
                        result = s.substring(left, right + 1);
                    }
                    left--;
                    right++;
                }

                left = i;
                right = i + 1;

                while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                    if ((right - left + 1) > maxLength) {
                        maxLength = right - left + 1;
                        result = s.substring(left, right + 1);
                    }
                    left--;
                    right++;
                }
            }

            return result;
        }
    }
}
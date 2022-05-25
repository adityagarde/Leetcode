package com.github.aditya;

public class _2108 {
    // 2 ms, faster than 97.35%, memory 42.3 MB, less than 92.68%
    class Solution {
        public String firstPalindrome(String[] words) {
            for (String word : words) {
                if (isPalindrome(word))
                    return word;
            }
            return "";
        }

        private boolean isPalindrome(String input) {
            int i = 0;
            int j = input.length() - 1;

            while (i < j) {
                if (input.charAt(i) != input.charAt(j))
                    return false;
                i++;
                j--;
            }
            return true;
        }
    }
}
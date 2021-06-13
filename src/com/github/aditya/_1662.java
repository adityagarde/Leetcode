package com.github.aditya;

public class _1662 {
    public static class Solution {
        public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
            if (concatenate(word1).equalsIgnoreCase(concatenate(word2))) {
                return true;
            }
            return false;
        }

        public String concatenate(String[] word) {
            for (int i = 1; i < word.length; i++) {
                word[0] = word[0] + word[i];
            }
            return word[0];
        }
    }
}

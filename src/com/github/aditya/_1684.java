package com.github.aditya;

public class _1684 {

    public static class Solution {
        public int countConsistentStrings(String allowed, String[] words) {
            boolean[] indexArr = new boolean[26];
            for (char ch : allowed.toCharArray()) {
                indexArr[ch - 'a'] = true;
            }
            int counter = 0;

            for (String str : words) {
                boolean flagValid = true;
                for (char ch : str.toCharArray()) {
                    if (!indexArr[ch - 'a']) {
                        flagValid = false;
                        break;
                    }
                }
                if (flagValid)
                    counter++;
            }
            return counter;
        }
    }

    public static class Solution_1 {
        public int countConsistentStrings(String allowed, String[] words) {
            int counter = 0;
            for (String str : words) {
                boolean flagValid = true;
                for (char ch : str.toCharArray()) {
                    if (!allowed.contains(ch + "")) {
                        flagValid = false;
                    }
                }
                if (flagValid)
                    counter++;
            }
            return counter;
        }
    }
}

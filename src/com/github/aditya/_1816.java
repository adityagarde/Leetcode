package com.github.aditya;

public class _1816 {
    public static class Solution {
        public String truncateSentence(String s, int k) {
            int counter = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' ')
                    counter++;
                if (counter == k)
                    return s.substring(0, i);
            }
            return s;
        }
    }

    public static class Solution_1 {
        public String truncateSentence(String s, int k) {
            String[] strArr = s.split(" ");
            String str = strArr[0];
            for (int i = 1; i < k; i++) {
                str = str + " " + strArr[i];
            }
            return str;
        }
    }
}

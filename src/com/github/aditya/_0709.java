package com.github.aditya;

public class _0709 {
    public static class Solution {
        public String toLowerCase(String str) {
            StringBuilder result = new StringBuilder();
            for (char ch : str.toCharArray()) {
                if (ch >= 65 && ch < 91)
                    result.append((char) (ch + 32));
                else
                    result.append(ch);
            }
            return result.toString();
        }
    }

    public static class Solution_1 {
        public String toLowerCase(String str) {
            return str.toLowerCase();
        }
    }
}

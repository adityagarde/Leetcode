package com.github.aditya;

public class _1528 {
    public static class Solution {
        public static String restoreString(String s, int[] indices) {

            char[] charArr = s.toCharArray();
            char[] charArr2 = new char[indices.length];

            for (int i = 0; i < indices.length; i++) {
                charArr2[indices[i]] = charArr[i];
            }

            return String.valueOf(charArr2);
        }
    }
}

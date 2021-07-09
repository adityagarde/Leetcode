package com.github.aditya;

public class _0028 {
    public static class Solution {
        public int strStr(String haystack, String needle) {
            if (needle.isEmpty()) return 0;
            if (haystack.isEmpty() || (haystack.length() < needle.length())) return -1;

            for (int i = 0; i < haystack.length(); i++) {
                if (haystack.charAt(i) == needle.charAt(0)) {
                    for (int j = 0; j <= needle.length() && (i + j < haystack.length()); j++) {
                        if (haystack.charAt(i + j) != needle.charAt(j)) {
                            break;
                        } else if (haystack.charAt(i + j) == needle.charAt(j) && j == needle.length() - 1) {
                            return i;
                        }
                    }
                }
            }
            return -1;
        }
    }
}

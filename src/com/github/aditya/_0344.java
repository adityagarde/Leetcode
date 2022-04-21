package com.github.aditya;

public class _0344 {
    // 1 ms, faster than 82.36%, memory 48.9 MB, less than 96.13%
    class Solution {
        public void reverseString(char[] s) {
            int i = 0, j = s.length - 1;
            while (i < j) {
                char temp = s[i];
                s[i] = s[j];
                s[j] = temp;
                i++;
                j--;
            }
        }
    }
}
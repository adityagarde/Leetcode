package com.github.aditya;

public class _0058 {
    // 1. 0ms, faster than 100% Solutions - Optimal Solution - Intuitive
    // Start from back - If we encounter a non ' ' char - increase the length
    // when we find ' ' (else part) return the length.
    // Before returning check length > 0 to handle cases like "Aditya ".
    class Solution {
        public int lengthOfLastWord(String s) {
            int length = 0;
            for (int i = s.length() - 1; i >= 0; i--) {
                if (s.charAt(i) != ' ') length++;
                else if (length > 0) return length;
            }
            return length;
        }
    }

    // 2. 0ms, faster than 100% Solutions
    // Starting from back and checking the occurrence of ' '
    // 1st and last if to handle corner cases like "Aditya " and "Aditya".
    class Solution_1 {
        public int lengthOfLastWord(String s) {
            for (int i = s.length() - 1; i >= 0; i--) {
                if (s.charAt(s.length() - 1) == ' ') {
                    return lengthOfLastWord(s.substring(0, s.length() - 1));
                } else if (s.charAt(i) == ' ') {
                    return s.length() - 1 - i;
                } else if (i == 0)
                    return s.length();
            }
            return 0;
        }
    }

    // 3. 2ms, Uses default methods
    class Solution_2 {
        public int lengthOfLastWord(String s) {
            String[] strArr = s.trim().split(" ");
            return strArr[strArr.length - 1].length();
        }
    }
}

package com.github.aditya;

public class _0171 {

    // 1. Intuitive Approach - 1ms faster than 100% && memory usage less than 60.22%
    // Start from last Alphabet and convert as if a number system with base 26 (Decimal = 10)
    public static class Solution {
        public int titleToNumber(String columnTitle) {
            int sum = 0;
            int factor = 1;
            for (int i = columnTitle.length() - 1; i >= 0; i--) {
                sum += (columnTitle.charAt(i) - 'A' + 1) * factor;
                factor *= 26;
            }
            return sum;
        }
    }

    // 2. 1ms - faster than 100%
    public static class Solution_1 {
        public int titleToNumber(String columnTitle) {
            int sum = 0;
            int factor = 0;
            for (int i = columnTitle.length() - 1; i >= 0; i--) {
                sum = sum + (columnTitle.charAt(i) - 'A' + 1) * power(26, factor);
                factor++;
            }
            return sum;
        }

        // Just to replace Math.pow()
        public static int power(int a, int b) {
            if (b == 0) return 1;
            int result = a;
            for (int i = 1; i < b; i++) {
                result = result * a;
            }
            return result;
        }
    }
}

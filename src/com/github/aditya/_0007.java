package com.github.aditya;

public class _0007 {
    public static class Solution {
        public int reverse(int x) {

            long reverse = 0;
            long input = x;

            while (input != 0) {
                long rem = input % 10L;
                reverse = reverse * 10 + rem;
                input = input / 10;
            }

            if (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {
                return 0;
            } else {
                return (int) reverse;
            }
        }
    }
}

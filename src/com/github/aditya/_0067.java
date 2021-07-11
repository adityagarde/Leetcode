package com.github.aditya;

public class _0067 {
    public static class Solution {
        public String addBinary(String a, String b) {
            int carry = 0;
            StringBuilder sb = new StringBuilder();
            for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0 || carry == 1; i--, j--) {
                int sum = 0;
                if (i >= 0) sum = sum + a.charAt(i) - '0';
                if (j >= 0) sum = sum + b.charAt(j) - '0';
                sum = sum + carry;

                carry = sum >> 1; //divide by 2
                sum = sum & 1; // mod 2
                sb.append(sum);
            }
            return sb.reverse().toString();
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101", "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"));
    }
}

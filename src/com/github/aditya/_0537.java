package com.github.aditya;

public class _0537 {
    public static class Solution {
        public String complexNumberMultiply(String num1, String num2) {
            String[] strArr1 = num1.split("\\+");
            int real1 = Integer.parseInt(strArr1[0]);
            int imaginary1 = Integer.parseInt(strArr1[1].substring(0, strArr1[1].length() - 1));

            String[] strArr2 = num2.split("\\+");
            int real2 = Integer.parseInt(strArr2[0]);
            int imaginary2 = Integer.parseInt(strArr2[1].substring(0, strArr2[1].length() - 1));

            return String.valueOf((real1 * real2) + (imaginary1 * imaginary2 * -1)) + "+"
                    + String.valueOf((real1 * imaginary2) + (real2 * imaginary1)) + "i";
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.complexNumberMultiply("78+-76i", "-86+72i"));
    }
}

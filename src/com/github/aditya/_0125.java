package com.github.aditya;

public class _0125 {
    public static class Solution {
        public boolean isPalindrome(String s) {
            int left = 0, right = s.length() - 1;
            for (; left < right; left++, right--) {
                while (left < right && !isAlphaNumeric(s.charAt(left))) {
                    left++;
                }
                while (left < right && !isAlphaNumeric(s.charAt(right))) {
                    right--;
                }
                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                    return false;
                }
            }
            return true;
        }

        public static boolean isAlphaNumeric(char char1) {
            return (char1 >= 'a' && char1 <= 'z') || (char1 >= 'A' && char1 <= 'Z') || (char1 >= '0' && char1 <= '9');
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.isPalindrome("A man, a plan, a canal: Panama"));
    }
}

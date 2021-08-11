package com.github.aditya;

public class _0014 {
    // Brute Force approach - 8ms
    public static class Solution {
        public String longestCommonPrefix(String[] strs) {
            String result = "";
            if (strs == null || strs.length == 0)
                return result;

            for (int i = 0; i < strs[0].length(); i++) {
                char ch = strs[0].charAt(i);
                for (int j = 1; j < strs.length; j++) {
                    if (i >= strs[j].length() || ch != strs[j].charAt(i)) {
                        return result;
                    }
                }
                result = result + ch;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.longestCommonPrefix(new String[]{"flower", "flow", "flood"}));
    }
}

package com.github.aditya;

import java.util.Arrays;

public class _0014 {
    // Using Sorting - 1ms
    // Sorting the given array, and then comparing the first and last entries.
    public static class Solution {
        public String longestCommonPrefix(String[] strs) {
            if (strs == null || strs.length == 0)
                return "";

            Arrays.sort(strs);
            int count = 0;
            while (count < strs[0].length()) {
                if (strs[0].charAt(count) == strs[strs.length - 1].charAt(count))
                    count++;
                else
                    break;
            }
            return count == 0 ? "" : strs[0].substring(0, count);
        }
    }


    // Brute Force approach - 8ms
    public static class Solution_1 {
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
        Solution_1 sol = new Solution_1();
        System.out.println(sol.longestCommonPrefix(new String[]{"flower", "flow", "flood", "flash", "flesh"}));
    }
}

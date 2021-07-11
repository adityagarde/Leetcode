package com.github.aditya;

public class _0151 {
    public static class Solution {
        public String reverseWords(String s) {
            String[] strArr = s.split(" ");
            StringBuilder sb = new StringBuilder();
            for (int i = strArr.length - 1; i >= 0; i--) {
                if (strArr[i].equals("")) {
                    continue;
                }
                if (i != strArr.length - 1) {
                    sb.append(" ");
                }
                sb.append(strArr[i]);
            }
            return sb.toString();
        }
    }
}

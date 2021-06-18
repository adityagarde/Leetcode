package com.github.aditya;

import java.util.Arrays;

public class _1859 {
    public static class Solution {
        public String sortSentence(String s) {
            String[] strArr = s.split(" ");
            String[] newArr = new String[strArr.length];

            for (String str : strArr) {
                int i = Integer.parseInt(str.substring(str.length() - 1));
                newArr[i - 1] = str.substring(0, str.length() - 1);
            }

            return String.join(" ", newArr);
        }
    }

    // Bit Expensive because of Sort().
    public static class Solution_1 {
        public String sortSentence(String s) {
            String[] strArr = s.split(" ");
            String[] newArr = new String[strArr.length];

            for (int i = 0; i < strArr.length; i++) {
                newArr[i] = strArr[i].substring(strArr[i].length() - 1) + strArr[i].substring(0, strArr[i].length() - 1);
            }

            Arrays.sort(newArr);
            String result = "";
            for (String str : newArr) {
                result = result + str.substring(1) + " ";
            }

            return result.trim();
        }
    }
}

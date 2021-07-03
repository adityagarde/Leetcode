package com.github.aditya;

import java.util.*;

public class _0500 {
    public static class Solution {
        public String[] findWords(String[] words) {
            Set<Character> rowOne = convertToSet("qwertyuiopQWERTYUIOP");
            Set<Character> rowTwo = convertToSet("asdfghjklASDFGHJKL");
            Set<Character> rowThree = convertToSet("zxcvbnmZXCVBNM");

            List<String> result = new ArrayList<>();

            for (String word : words) {
                int count1 = 0, count2 = 0, count3 = 0;
                for (char ch : word.toCharArray()) {
                    if (rowOne.contains(ch))
                        count1++;
                    if (rowTwo.contains(ch))
                        count2++;
                    if (rowThree.contains(ch))
                        count3++;
                }
                if ((count1 == 0 && count2 == 0) || (count1 == 0 && count3 == 0) || (count2 == 0 && count3 == 0))
                    result.add(word);
            }
            return result.toArray(new String[0]);
        }

        public static Set<Character> convertToSet(String str) {
            Set<Character> rowSet = new HashSet<>();
            for (char ch : str.toCharArray()) {
                rowSet.add(ch);
            }
            return rowSet;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"})));
    }
}

package com.github.aditya;

import java.util.ArrayList;
import java.util.List;

public class _0017 {
    // 0 ms, faster than 100.00%, memory 40.9 MB, less than 91.48%
    class Solution {
        String[] map = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        public List<String> letterCombinations(String digits) {
            List<String> list = new ArrayList<>();
            if (digits.isEmpty())
                return list;

            backtrack(digits, new StringBuilder(), list);

            return list;
        }

        private void backtrack(String digits, StringBuilder sb, List<String> list) {
            if (digits.isEmpty()) {
                list.add(sb.toString());
                return;
            }

            char current = digits.charAt(0);
            String remainingString = digits.substring(1);
            for (char ch : map[current - '0'].toCharArray()) {
                sb.append(ch);
                backtrack(remainingString, sb, list);
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }
}
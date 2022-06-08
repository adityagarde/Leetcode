package com.github.aditya;

import java.util.ArrayList;
import java.util.List;

public class _0784 {
    // 2 ms, faster than 94.77%, memory 42.9 MB, less than 89.27%
    class Solution {
        List<String> result;

        public List<String> letterCasePermutation(String s) {
            result = new ArrayList<>();
            backtrack(0, s, new StringBuilder());
            return result;
        }

        private void backtrack(int i, String s, StringBuilder sb) {
            if (i == s.length()) {
                result.add(sb.toString());
                return;
            }
            char ch = s.charAt(i);

            if (Character.isAlphabetic(ch)) {
                sb.append(Character.toLowerCase(ch));
                backtrack(i + 1, s, sb);
                sb.deleteCharAt(sb.length() - 1);

                sb.append(Character.toUpperCase(ch));
                backtrack(i + 1, s, sb);
                sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.append(ch);
                backtrack(i + 1, s, sb);
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }
}
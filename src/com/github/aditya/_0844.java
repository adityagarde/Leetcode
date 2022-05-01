package com.github.aditya;

import java.util.Stack;

public class _0844 {
    // 1 ms, faster than 87.48%, memory 40.3 MB, less than 92.19%
    class Solution {
        public boolean backspaceCompare(String s, String t) {
            return getBackspaceString(s).equals(getBackspaceString(t));
        }

        private String getBackspaceString(String str) {
            StringBuilder sb = new StringBuilder();
            for (char c : str.toCharArray()) {
                if (c != '#')
                    sb.append(c);
                else if (sb.length() != 0)
                    sb.deleteCharAt(sb.length() - 1); // pop()
            }
            return sb.toString();
        }
    }

    // 2 ms, faster than 57.69%, memory 40.7 MB, less than 77.58%
    // Extra space required because of Stack - Not optimal
    class Solution_1 {
        public boolean backspaceCompare(String s, String t) {
            return getBackspaceString(s).equals(getBackspaceString(t));
        }

        private String getBackspaceString(String str) {
            Stack<Character> stack = new Stack<>();

            for (char c : str.toCharArray()) {
                if (c == '#' && !stack.isEmpty())
                    stack.pop();
                else if (c != '#')
                    stack.push(c);
            }
            return stack.toString();
        }
    }
}
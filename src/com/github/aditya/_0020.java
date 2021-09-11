package com.github.aditya;

import java.util.Stack;

public class _0020 {
    // 1 ms, faster than 98.94%, Memory 36.9 MB, less than 94.33%
    class Solution {
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();

            if ((s.length() & 1) != 0) // Array should definitely be even!
                return false;

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch == '(' || ch == '{' || ch == '[') {
                    stack.push(ch);
                } else if (stack.isEmpty())
                    return false;
                else if (ch == ')' && stack.pop() != '(')
                    return false;
                else if (ch == ']' && stack.pop() != '[')
                    return false;
                else if (ch == '}' && stack.pop() != '{')
                    return false;
            }
            return stack.isEmpty();
        }
    }
}
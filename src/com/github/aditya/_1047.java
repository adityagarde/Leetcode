package com.github.aditya;

import java.util.ArrayDeque;
import java.util.Deque;

public class _1047 {
    // 5 ms, faster than 98.29%, memory 42.7 MB, less than 92.89%
    // Character array to mimic stack
    class Solution {
        public String removeDuplicates(String s) {
            char[] stack = new char[s.length()];
            int i = 0;
            for (int j = 0; j < s.length(); j++) {
                char ch = s.charAt(j);
                if (i > 0 && stack[i - 1] == ch) {
                    i--;
                } else {
                    stack[i] = ch;
                    i++;
                }
            }
            return new String(stack, 0, i);
        }
    }

    // 22 ms, faster than 67.63%, memory 43.1 MB, less than 80.79%
    // Using Stack - Time Complexity O(n) and Space Complexity O(n)
    class Solution_1 {
        public String removeDuplicates(String s) {
            Deque<Character> stack = new ArrayDeque<>();
            stack.push(s.charAt(0));

            for (int i = 1; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (stack.isEmpty() || stack.peek() == ch)
                    stack.push(ch);
                else
                    stack.pop();
            }
            StringBuilder result = new StringBuilder();
            for (Character ch : stack)
                result.append(ch);

            return result.toString();
        }
    }
}
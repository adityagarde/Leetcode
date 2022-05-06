package com.github.aditya;

import java.util.ArrayDeque;
import java.util.Deque;

public class _1209 {
    // 13 ms, faster than 91.76%, memory 43 MB, less than 88.66%
    class Solution {
        public String removeDuplicates(String s, int k) {
            Deque<Counter> stack = new ArrayDeque<>();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (!stack.isEmpty() && c == stack.peekLast().ch) {
                    if (stack.peekLast().count == k - 1)
                        stack.removeLast();
                    else
                        stack.peekLast().count++;
                } else {
                    stack.addLast(new Counter(c, 1));
                }
            }
            StringBuilder result = new StringBuilder();
            for (Counter counter : stack) {
                result.append(String.valueOf(counter.ch).repeat(counter.count));
            }
            return result.toString();
        }
    }

    class Counter {
        char ch;
        int count;

        Counter(char ch, int count) {
            this.ch = ch;
            this.count = count;
        }
    }
}
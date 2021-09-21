package com.github.aditya;

import java.util.Stack;

public class _1589 {
    // 0 ms, faster than 100.00%
    class Solution {
        public int minOperations(String[] logs) {
            int size = 0;
            for (String log : logs) {
                if (log.equals("./")) {
                    continue;
                } else if (log.equals("../")) {
                    size = Math.max(0, size - 1);
                } else {
                    size++;
                }
            }
            return size;
        }
    }

    // Using Stack Data Structure, 1ms
    class Solution_1 {
        public int minOperations(String[] logs) {
            Stack<String> stack = new Stack<>();
            for (String log : logs) {
                if (!stack.isEmpty() && log.equals("../")) {
                    stack.pop();
                } else if (!log.equals("./") && !log.equals("../")) {
                    stack.push(log);
                }
            }
            return stack.size();
        }
    }
}
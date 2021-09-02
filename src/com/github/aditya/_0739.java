package com.github.aditya;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class _0739 {
    class Solution {
        // Optimal Solution - Instead of pushing the element on stack, we are pushing its index.
        public int[] dailyTemperatures(int[] temperatures) {
            int[] answers = new int[temperatures.length];
            Stack<Integer> stack = new Stack<>();
            for (int i = 0; i < temperatures.length; i++) {
                while (!stack.empty() && temperatures[stack.peek()] < temperatures[i]) {
                    int myIndex = stack.pop();
                    answers[myIndex] = i - myIndex;
                }
                stack.push(i);
            }
            return answers;
        }
    }

    // This approach is very intuitive if you have already attempted Next Greater Element I (which is likely :-p)
    // Check - https://github.com/adityagarde/Leetcode/blob/main/src/com/github/aditya/_0496.java
    class Solution_1 {
        public int[] dailyTemperatures(int[] temperatures) {
            int[] answers = new int[temperatures.length];
            Stack<Integer> stack = new Stack<>();
            Map<Integer, Integer> ngeMap = new HashMap<>();

            for (int i = 0; i < temperatures.length; i++) {
                while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                    int myIndex = stack.pop();
                    ngeMap.put(myIndex, i - myIndex);
                }
                stack.push(i);
            }

            for (int i = 0; i < temperatures.length; i++)
                answers[i] = ngeMap.getOrDefault(i, 0);

            return answers;
        }
    }
}
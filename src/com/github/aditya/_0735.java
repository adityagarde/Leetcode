package com.github.aditya;

import java.util.ArrayDeque;
import java.util.Deque;

public class _0735 {
    // 2 ms, faster than 99.41%, memory 43.2 MB, less than 87.51%
    class Solution {
        public int[] asteroidCollision(int[] asteroids) {
            Deque<Integer> stack = new ArrayDeque<>();
            for (int i = 0; i < asteroids.length; i++) {
                if (asteroids[i] > 0 || stack.isEmpty())
                    stack.push(asteroids[i]);
                else {
                    while (true) {
                        int top = stack.peek();
                        if (top < 0) {
                            stack.push(asteroids[i]);
                            break;
                        } else if (top == -asteroids[i]) {
                            stack.pop();
                            break;
                        } else if (top > -asteroids[i])
                            break;
                        else {
                            stack.pop();
                            if (stack.isEmpty()) {
                                stack.push(asteroids[i]);
                                break;
                            }
                        }
                    }
                }
            }

            int[] result = new int[stack.size()];
            for (int i = stack.size() - 1; i >= 0; i--)
                result[i] = stack.pop();
            return result;
        }
    }
}
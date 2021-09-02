package com.github.aditya;

import java.util.Stack;

public class _0503 {
    /**
     * 10 ms, faster than 61.42%, Time - O(2N + 2N) ~ O(N) & Space ~ O(N)
     * Start from the right side of array, maintain a stack to store the elements.
     * Pop all the elements from the stack which are lesser than current nums[i] as we need the greater element.
     * In our result Array, put the top of the stack or -1 if stack is empty i.e. greater element does not exists.
     * We need to check in a circular fashion Ex - the nge for 14 is 19 in this example - [19, 5, 9, 3, 14] => [-1,9,14,14,19]
     * To handle this case - we use module indices and loop from i = 2N - 1 as if an virtual array [19, 5, 9, 3, 14 ** 19, 5, 9, 3, 14]
     */
    class Solution {
        public int[] nextGreaterElements(int[] nums) {
            int N = nums.length;
            int[] ngeArr = new int[N];
            Stack<Integer> stack = new Stack<>();

            for (int i = 2 * N - 1; i >= 0; i--) {
                while (!stack.isEmpty() && stack.peek() <= nums[i % N]) {
                    stack.pop();
                }
                if (i < N) {
                    ngeArr[i] = !stack.isEmpty() ? stack.peek() : -1;
                }
                stack.push(nums[i % N]);
            }
            return ngeArr;
        }
    }
}
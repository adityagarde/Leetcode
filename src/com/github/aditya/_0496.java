package com.github.aditya;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class _0496 {
    /**
     * 4 ms, faster than 57.77%, Time ~ O(N)
     * We maintain a HashMap of all the elements of nums2 (bigger array) and its Next Greater Element!
     * To find the Next Greater Element - we use a Stack and loop through the bigger array nums2.
     * If the current nums2[i] in the iteration is greater than the top of the stack, pop it and add it as key to our Map.
     * The current nums2[i] is added as the value (next greater number) of the map.
     * In the second loop - we return the values for the elements of nums1, when greater element is not found - return -1.
     */
    class Solution {
        public int[] nextGreaterElement(int[] nums1, int[] nums2) {
            Stack<Integer> stack = new Stack<>();
            Map<Integer, Integer> ngeMap = new HashMap<>();

            for (int i = 0; i < nums2.length; i++) {
                while (!stack.isEmpty() && stack.peek() <= nums2[i]) {
                    ngeMap.put(stack.pop(), nums2[i]);
                }
                stack.push(nums2[i]);
            }

            for (int i = 0; i < nums1.length; i++)
                nums1[i] = ngeMap.getOrDefault(nums1[i], -1);

            return nums1;
        }
    }
}
package com.github.aditya;

public class _0260 {
    // 1 ms, faster than 96.25%
    // XOR all elements - we will end up with required numbers (num1 ^ num2)
    // Bitwise & this result with its 2's Complement to get the least significant (rightmost) set bit = lsb
    // Bitwise & the number arr with this lsb - depending on number > 0 OR not - we get the 2 numbers.
    // Dry run with [1,2,1,3,2,5] - Will be much more clear than reading theory.
    class Solution {
        public int[] singleNumber(int[] nums) {
            int result = nums[0];
            for (int i = 1; i < nums.length; i++) {
                result = result ^ nums[i];
            }
            result = result & -result; // lsb

            int num1 = 0, num2 = 0;
            for (int i = 0; i < nums.length; i++) {
                if ((nums[i] & result) > 0)
                    num1 = num1 ^ nums[i];
                else
                    num2 = num2 ^ nums[i];
            }
            return new int[]{num1, num2};
        }
    }
}

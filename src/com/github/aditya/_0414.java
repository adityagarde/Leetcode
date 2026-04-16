package com.github.aditya;

public class _0414 {
    // 3ms beats 78%
    class Solution {
        public int thirdMax(int[] nums) {
            Integer first = null;
            Integer second = null;
            Integer third = null;

            for (int num : nums) {
                if ((first != null && num == first) ||
                        (second != null && num == second) ||
                        (third != null && num == third)) {
                    continue;
                }

                if (first == null || num > first) {
                    third = second;
                    second = first;
                    first = num;
                } else if (second == null || num > second) {
                    third = second;
                    second = num;
                } else if (third == null || num > third) {
                    third = num;
                }
            }

            return third == null ? first : third;
        }
    }
}

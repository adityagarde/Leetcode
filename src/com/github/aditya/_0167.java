package com.github.aditya;

public class _0167 {
    public static class Solution {
        public int[] twoSum(int[] numbers, int target) {
            int left = 0, right = numbers.length - 1;
            while (left != right) {
                if (numbers[left] + numbers[right] > target) right--;
                else if (numbers[left] + numbers[right] < target) left++;
                else return new int[]{left + 1, right + 1};
            }
            return new int[]{-1, -1};
        }
    }
}

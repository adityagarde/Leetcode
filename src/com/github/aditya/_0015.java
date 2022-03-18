package com.github.aditya;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _0015 {
    // 18 ms, faster than 94.95%, memory 45.8 MB, less than 94.77%
    public static class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            Arrays.sort(nums);
            List<List<Integer>> solution = new ArrayList<>();

            for (int i = 0; i < nums.length; i++) {
                // Handling duplicate entries
                if (i > 0 && nums[i] == nums[i - 1]) continue;
                int left = i + 1;
                int right = nums.length - 1;
                int sum = -nums[i];
                while (left < right) {
                    if (nums[left] + nums[right] == sum) {
                        solution.add(Arrays.asList(nums[i], nums[left++], nums[right--]));
                        // Handling duplicate entries
                        while (right > left && nums[left] == nums[left - 1]) left++;
                        while (right > left && nums[right] == nums[right + 1]) right--;
                    } else if (nums[left] + nums[right] > sum) right--;
                    else left++;
                }
            }

            return solution;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] input = new int[]{-1, 0, 1, 2, -1, -4};
        System.out.println(solution.threeSum(input));
    }
}

package com.github.aditya;

import java.util.ArrayList;
import java.util.List;

public class _0078 {
    // 0 ms, faster than 100.00%, memory 42.5 MB, less than 87.75%
    // Backtracking, Time Complexity - O(n * 2^n)
    class Solution {
        public List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();
            backtrack(nums, 0, new ArrayList<>(), result);

            return result;
        }

        private void backtrack(int[] nums, int start, List<Integer> subList, List<List<Integer>> result) {
            result.add(new ArrayList<>(subList));

            for (int i = start; i < nums.length; i++) {
                subList.add(nums[i]);
                backtrack(nums, i + 1, subList, result);
                subList.remove(subList.size() - 1);
            }
        }
    }
}
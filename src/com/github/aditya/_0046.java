package com.github.aditya;

import java.util.ArrayList;
import java.util.List;

public class _0046 {
    // 1 ms, faster than 95.98%, memory 42.1 MB, less than 98.59%
    class Solution {
        public List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();
            boolean[] visited = new boolean[nums.length];
            backtrack(nums, visited, new ArrayList<>(), result);

            return result;
        }

        private void backtrack(int[] nums, boolean[] visited, List<Integer> subList, List<List<Integer>> result) {
            if (subList.size() == nums.length) {
                result.add(new ArrayList<>(subList));
                return;
            }
            for (int i = 0; i < nums.length; i++) {
                if (!visited[i]) {
                    visited[i] = true;
                    subList.add(nums[i]);
                    backtrack(nums, visited, subList, result);
                    subList.remove(subList.size() - 1);
                    visited[i] = false;
                }
            }
        }
    }
}
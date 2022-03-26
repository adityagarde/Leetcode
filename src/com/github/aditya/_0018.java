package com.github.aditya;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _0018 {
    // 13 ms, faster than 86.42%, memory 42.3 MB, less than 96.97%
    class Solution {
        public List<List<Integer>> fourSum(int[] nums, int target) {
            Arrays.sort(nums);
            List<List<Integer>> result = new ArrayList<>();
            int n = nums.length;

            for (int i = 0; i < n - 3; i++) {
                if (i > 0 && nums[i] == nums[i - 1]) continue;

                for (int j = i + 1; j < n - 2; j++) {
                    if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                    int left = j + 1;
                    int right = n - 1;

                    while (left < right) {
                        int sum = nums[i] + nums[j] + nums[left] + nums[right];

                        if (sum > target) right--;
                        else if (sum < target) left++;
                        else {
                            result.add(Arrays.asList(nums[i], nums[j], nums[left++], nums[right--]));
                            // handle duplicates
                            while (right > left && nums[left] == nums[left - 1]) left++;
                            while (right > left && nums[right] == nums[right + 1]) right--;
                        }
                    }
                    while (j < n - 1 && nums[j] == nums[j + 1]) j++; // handle duplicates : j
                }
                while (i < n - 1 && nums[i] == nums[i + 1]) i++; // handle duplicates : i
            }
            return result;
        }
    }
}
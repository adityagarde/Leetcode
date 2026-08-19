package com.github.aditya;

import java.util.HashMap;
import java.util.Map;

public class _1865 {
    class FindSumPairs {
        int[] nums1;
        int[] nums2;
        Map<Integer, Integer> map = new HashMap<>();

        public FindSumPairs(int[] nums1, int[] nums2) {
            this.nums1 = nums1;
            this.nums2 = nums2;
            for (int num2 : nums2) {
                map.put(num2, map.getOrDefault(num2, 0) + 1);
            }
        }

        public void add(int index, int val) {
            int oldValue = nums2[index];
            map.put(oldValue, map.get(oldValue) - 1);
            nums2[index] += val;
            map.put(nums2[index], map.getOrDefault(nums2[index], 0) + 1);
        }

        public int count(int tot) {
            int count = 0;
            for (int num1 : nums1) {
                int diff = tot - num1;
                count += map.getOrDefault(diff, 0);
            }
            return count;
        }
    }

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */
}

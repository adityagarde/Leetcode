package com.github.aditya;

import java.util.HashSet;
import java.util.Set;

public class _0349 {
    // 2 ms, faster than 95.31% - memory 39 MB, less than 85.12%
    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            Set<Integer> numSet = new HashSet<Integer>();
            Set<Integer> result = new HashSet<Integer>();
            for (int i : nums1)
                numSet.add(i);
            for (int j : nums2) {
                if (numSet.contains(j)) {
                    result.add(j);
                }
            }
            int[] array = new int[result.size()];
            int k = 0;
            for (int i : result) {
                array[k++] = i;
            }
            return array;
        }
    }
}
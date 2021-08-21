package com.github.aditya;

public class _0162 {
    class Solution {
        /**
         * 0 ms, faster than 100.00%, memory 38.3 MB, less than 91.44%, O(log n)
         * A peak element in an array is an element which is strictly greater than its neighbours.
         * We solve this question in Binary Search fashion, if the mid element is greater than (mid + 1) && (mid - 1) we return it.
         * If mid is not the peak then depending on whether (mid + 1) or (mid - 1) element is greater we move to that sub-array and apply BS.
         * The question says not to worry about edge cases i.e. starting and ending - but as a correct practice we have handled it in the else if part.
         */
        public int findPeakElement(int[] nums) {
            if (nums.length == 1)
                return 0;
            int left = 0;
            int right = nums.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (mid > 0 && mid < nums.length - 1) {
                    if (nums[mid] > nums[mid + 1] && nums[mid] > nums[mid - 1]) {
                        return mid;
                    } else if (nums[mid] < nums[mid + 1]) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                } else if (mid == 0) {
                    return (nums[0] > nums[1]) ? 0 : 1;
                } else if (mid == nums.length - 1) {
                    return (nums[mid] > nums[mid - 1]) ? mid : mid - 1;
                }
            }
            return -1;
        }
    }
}
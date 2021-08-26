package com.github.aditya;

public class _0540 {
    /**
     * 0 ms, faster than 100.00%, Memory 39.1 MB, less than 63%, Binary Search, O(log n)
     *
     * We have found our element when both its neighbours are different than the element.  Ex - [3 3 (4) 5 5]
     * Regarding going left or right of the middle - Observe that in a normal situation where every element is appearing twice -
     * the index of the pair always start with an even number. Ex - [1, 1] is starting at index 0 - [2, 2] is starting at 2 and so on.
     *
     *  0 1 2 3 4 5 6   7 8     0 1  2  3 4 5 6 7 8   - The Index of the Number Array Elements.
     * [1 1 2 2 3 3 (4) 5 5]   [1 1 (2) 3 3 4 4 5 5]  - Sorted Number Array with One Number Appearing Exactly Once.
     *
     * But as soon as an element appears only once - this is changed and now the first element of the pair starts appearing on odd indices.
     * Thus, If the nums[mid] and nums[mid + 1] are equal and mid is an even number / index (using (mid & 1) to check even or odd),
     * OR num[mid] and nums[mid - 1] are equal and (mid - 1) is even index (OR mid is odd) - we move to left sub array i.e. right = mid -1 else otherwise.
     */
    class Solution {
        public int singleNonDuplicate(int[] nums) {
            if (nums.length == 1)
                return nums[0];

            int left = 0, right = nums.length - 1;

            if (nums[0] != nums[1]) { // boundary conditions
                return nums[0];
            } else if (nums[right] != nums[right - 1]) {
                return nums[right];
            }

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (nums[mid - 1] != nums[mid] && nums[mid] != nums[mid + 1]) {
                    return nums[mid];
                } else if ((nums[mid] == nums[mid + 1] && (mid & 1) != 0)
                        || (nums[mid - 1] == nums[mid] && (mid & 1) == 0)) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            return -1;
        }
    }
}
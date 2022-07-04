package com.github.aditya;

import java.util.Arrays;

public class _0135 {
    // 2 ms, faster than 100.00%, memory 43.1 MB, less than 88.06%
    // Time Complexity O(n) and Space Complexity O(n)
    // Only 1 array used - result logic similar as below
    class Solution {
        public int candy(int[] ratings) {
            int sum = 0;
            int length = ratings.length;
            int[] candies = new int[length];
            Arrays.fill(candies, 1);

            for (int i = 1; i < length; i++) {
                if (ratings[i - 1] < ratings[i])
                    candies[i] = candies[i - 1] + 1;
            }

            for (int i = length - 2; i >= 0; i--) {
                if (ratings[i + 1] < ratings[i])
                    candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }

            for (int i : candies)
                sum += i;

            return sum;
        }
    }


    // 2 ms, faster than 100.00%, memory 42.9 MB, less than 89.93%
    // Time Complexity O(n) and Space Complexity O(n)

    // Take 2 arrays with default value as 1.
    // Go from left to right and if current rating is higher than previous, increment the current element in left array.
    // Go from right to left and if current rating is higher than right element (i+1) then increment the current.
    // Take the sum of max values of left and right array.
    // Con - Using 2 arrays - one each for left comparison and right comparison
    class Solution_1 {
        public int candy(int[] ratings) {
            int sum = 0;
            int length = ratings.length;
            int[] left = new int[length];
            int[] right = new int[length];
            Arrays.fill(left, 1);
            Arrays.fill(right, 1);

            for (int i = 1; i < length; i++) {
                if (ratings[i - 1] < ratings[i])
                    left[i] = left[i - 1] + 1;
            }

            for (int i = length - 2; i >= 0; i--) {
                if (ratings[i + 1] < ratings[i])
                    right[i] = right[i + 1] + 1;
            }

            for (int i = 0; i < length; i++)
                sum += Math.max(left[i], right[i]);

            return sum;
        }
    }
}
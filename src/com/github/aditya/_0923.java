package com.github.aditya;

import java.util.HashMap;
import java.util.Map;

public class _0923 {
    // 1 ms, faster than 100.00%, memory 41.7 MB, less than 90.32%
    // Optimal - Time Complexity O(n + 100 * 100) and Space Complexity O(100) ~ O(1)
    // Frequency (Count) Array of Size 101 as given constraint 0 <= arr[i] <= 100.
    // Loop over i and j such to check for k such that k = target - i - j.
    // As we have allow duplicates, we have 3 cases. i == j == k, i == j != k, i < j < k
    // Using nCr = n! / ((n – r)! r!) we get formulas for these 3 cases.
    class Solution {
        public int threeSumMulti(int[] arr, int target) {
            long[] freq = new long[101];
            long result = 0;

            for (int i : arr) freq[i]++;

            for (int i = 0; i <= 100; i++) {
                for (int j = i; j <= 100; j++) {
                    int k = target - i - j;
                    if (k > 100 || k < 0) continue;
                    if (i == j && j == k)
                        result += (freq[i] * (freq[i] - 1) * (freq[i] - 2)) / 6;
                    else if (i == j && j != k)
                        result += ((freq[i] * (freq[i] - 1)) / 2) * freq[k];
                    else if (j < k)
                        result += freq[i] * freq[j] * freq[k];
                }
            }
            return (int) (result % 1000000007);
        }
    }

    // Using HashMap, quite costly
    class Solution_1 {
        public int threeSumMulti(int[] arr, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            int result = 0;

            for (int i = 0; i < arr.length; i++) {
                result = (result + map.getOrDefault(target - arr[i], 0)) % 1000000007;

                for (int j = 0; j < i; j++) {
                    int sum = arr[i] + arr[j];
                    map.put(sum, map.getOrDefault(sum, 0) + 1);
                }
            }
            return result;
        }
    }
}
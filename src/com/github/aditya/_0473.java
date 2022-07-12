package com.github.aditya;

import java.util.Arrays;

public class _0473 {
    // 3 ms, faster than 97.41%, memory 39.9 MB, less than 95.85%
    /*
    1. Take the sum of `matchsticks` it has to be a multiple of 4. Find the side length of square.
    2. Sort the `matchsticks` array and then iterate (using `index`) from the right end (i.e. last).
    3. Take the matchstick from `index` position. If it fits in side `i`, put it and decrement side array value.
        3.1 `matchsticks[index] > sides[i]` - Note we have already populated side[] with `side` length in first fnc call.
    4. Loop for 4 sides of the square - backtrack after checking if the matchstick[index] fits or not.
    5. Decrement index for the call. Note that `index == -1` is base condition.
    6. `i > 0 && sides[i] == sides[i - 1]` == Pruning - Major major optimization.
        6.1 We know all sides are same and there is no ordering as such.
        6.2 So if the matchstick[index] doesn't fit with side i - 1, it will not fit with i as well, so skip it.
     */
    class Solution {
        public boolean makesquare(int[] matchsticks) {
            if (matchsticks.length < 4)
                return false;
            int sum = 0;
            for (int i : matchsticks)
                sum += i;

            if (sum % 4 != 0)
                return false;
            int side = sum / 4;

            Arrays.sort(matchsticks);
            return backtrack(matchsticks, new int[]{side, side, side, side}, matchsticks.length - 1);
        }

        private boolean backtrack(int[] matchsticks, int[] sides, int index) {
            if (index == -1)
                return true;

            for (int i = 0; i < 4; i++) {
                if (matchsticks[index] > sides[i] || (i > 0 && sides[i] == sides[i - 1]))
                    continue;

                sides[i] -= matchsticks[index];
                if (backtrack(matchsticks, sides, index - 1))
                    return true;
                sides[i] += matchsticks[index];
            }
            return false;
        }
    }
}
package com.github.aditya;

import java.util.ArrayList;
import java.util.List;

public class _1431 {
    public static class Solution {
        public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

            int max = Integer.MIN_VALUE;
            List<Boolean> result = new ArrayList<Boolean>();

            for (int i = 0; i < candies.length; i++) {
                if (candies[i] > max) {
                    max = candies[i];
                }
            }

            for (int i = 0; i < candies.length; i++) {
                if (candies[i] + extraCandies >= max) {
                    result.add(true);
                } else {
                    result.add(false);
                }

            }

            return result;
        }
    }
}

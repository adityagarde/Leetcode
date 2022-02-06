package com.github.aditya;

import java.util.HashMap;
import java.util.Map;

public class _0387 {
    // Better Solution, 1 ms, faster than 100.00% Using String
    class Solution {
        public int firstUniqChar(String s) {
            int min = Integer.MAX_VALUE;
            for (char i = 'a'; i <= 'z'; i++) {
                int index = s.indexOf(i);
                if (index != -1 && index == s.lastIndexOf(i))
                    min = Math.min(min, index);
            }

            return min == Integer.MAX_VALUE ? -1 : min;
        }
    }

    // Expensive Solution using HashMap, Looping Twice
    class Solution_1 {
        public int firstUniqChar(String s) {

            Map<Character, Integer> countMap = new HashMap();

            for (char ch : s.toCharArray()) {
                countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
            }

            int min = Integer.MAX_VALUE;

            for (char ch : countMap.keySet()) {
                if (countMap.get(ch) == 1) {
                    min = Math.min(s.indexOf(ch), min);
                }
            }

            return min == Integer.MAX_VALUE ? -1 : min;
        }
    }
}

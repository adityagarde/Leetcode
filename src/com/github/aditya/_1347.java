package com.github.aditya;

import java.util.HashMap;

public class _1347 {
    // Counting the frequency for each possible char of s and subtracting it from t
    public static class Solution {
        public int minSteps(String s, String t) {
            int result = 0;
            int[] countArr = new int[26];

            for (char ch : s.toCharArray())
                countArr[ch - 'a']++;

            for (char ch : t.toCharArray())
                countArr[ch - 'a']--;

            for (int i : countArr) {
                if (i > 0)
                    result = result + i;
            }
            return result;
        }
    }

    // Using HashMap - very Expensive
    public static class Solution_1 {
        public int minSteps(String s, String t) {
            HashMap<Character, Integer> sMap = getCountMap(s);
            HashMap<Character, Integer> tMap = getCountMap(t);
            int result = 0;
            for (char myChar : sMap.keySet()) {
                if (tMap.containsKey(myChar) && tMap.get(myChar) < sMap.get(myChar)) {
                    result = result + sMap.get(myChar) - tMap.get(myChar);
                } else if (!tMap.containsKey(myChar)) {
                    result = result + sMap.get(myChar);
                }
            }
            return result;
        }

        public static HashMap<Character, Integer> getCountMap(String str) {
            HashMap<Character, Integer> map = new HashMap<>();
            for (char ch : str.toCharArray()) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
            return map;
        }
    }
}

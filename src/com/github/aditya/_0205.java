package com.github.aditya;

import java.util.HashMap;
import java.util.Map;

public class _0205 {
    // 3 ms, faster than 97.91%
    // 256 ASCII Characters Ex - a b b a  => a -> i + 1 && w -> i + 1
    //                           w r r w  => b -> i + 1 && r -> i + 1
    // returning false when the contents of arr1 and arr2 don't match.
    public static class Solution {
        public boolean isIsomorphic(String s, String t) {
            int[] arr1 = new int[256];
            int[] arr2 = new int[256];
            for (int i = 0; i < s.length(); i++) {
                char sChar = s.charAt(i);
                char tChar = t.charAt(i);
                if (arr1[sChar] != arr2[tChar]) {
                    return false;
                }
                arr1[sChar] = i + 1;
                arr2[tChar] = i + 1;
            }
            return true;
        }
    }

    // 28 ms, using two Hash Maps
    public static class Solution_1 {
        public boolean isIsomorphic(String s, String t) {
            if (s == null || t == null)
                return false;

            Map<Character, Integer> sMap = new HashMap<>();
            Map<Character, Integer> tMap = new HashMap<>();

            for (int i = 0; i < s.length(); i++) {
                int sIndex = sMap.getOrDefault(s.charAt(i), -1);
                int tIndex = tMap.getOrDefault(t.charAt(i), -1);

                if (sIndex != tIndex)
                    return false;

                sMap.put(s.charAt(i), i);
                tMap.put(t.charAt(i), i);
            }
            return true;
        }
    }
}
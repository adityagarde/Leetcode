package com.github.aditya;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _0242 {

    // 1 ms, faster than 100.00%, memory 42 MB, less than 70.70%
    // One 26 sized array, which acts as counter. First loop to set the counter and second loop to reset.
    class Solution {
        public boolean isAnagram(String s, String t) {
            if (s.length() != t.length()) return false;

            int[] countArr = new int[26];

            for (char ch : s.toCharArray())
                countArr[ch - 'a']++;

            for (char ch : t.toCharArray())
                countArr[ch - 'a']--;

            for (int i = 0; i < 26; i++) {
                if (countArr[i] != 0) return false;
            }
            return true;
        }
    }

    // 3 ms, faster than 92.35%, but uses inbuilt APIs, not recommended.
    class Solution_1 {
        public boolean isAnagram(String s, String t) {
            if (s.length() != t.length()) return false;

            char[] sArr = s.toCharArray();
            char[] tArr = t.toCharArray();
            Arrays.sort(sArr);
            Arrays.sort(tArr);

            return Arrays.equals(sArr, tArr);
        }
    }

    // 11 ms, bit costly, uses HashMap
    class Solution_2 {
        public boolean isAnagram(String s, String t) {
            if (s.length() != t.length()) return false;

            Map<Character, Integer> freqMap = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                freqMap.put(s.charAt(i), freqMap.getOrDefault(s.charAt(i), 0) + 1);
            }

            for (char ch : t.toCharArray()) {
                if (freqMap.containsKey(ch) && freqMap.get(ch) > 0) {
                    freqMap.put(ch, freqMap.get(ch) - 1);
                } else {
                    return false;
                }
            }

            return true;
        }
    }
}
package com.github.aditya;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _1832 {
    public static class Solution {
        public boolean checkIfPangram(String sentence) {

            if (sentence.length() < 26)
                return false;

            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < sentence.length(); i++) {
                map.put(sentence.charAt(i), map.getOrDefault(sentence.charAt(i), 0) + 1);
            }

            return map.size() == 26;
        }
    }

    public static class Solution_1 {
        public boolean checkIfPangram(String sentence) {
            Set<Character> set = new HashSet<Character>();
            for (char ch : sentence.toCharArray())
                set.add(ch);

            return set.size() == 26;
        }
    }
    
}

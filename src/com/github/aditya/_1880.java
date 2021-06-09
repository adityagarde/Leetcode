package com.github.aditya;

import java.util.HashMap;

public class _1880 {
    public static class Solution {
        public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {

            if (calculateWordValue(firstWord) + calculateWordValue(secondWord) == calculateWordValue(targetWord)) {
                return true;
            }
            return false;
        }

        public Integer calculateWordValue(String input) {
            HashMap<Character, Integer> dataMap = new HashMap<>();

            dataMap.put('a', 0);
            dataMap.put('b', 1);
            dataMap.put('c', 2);
            dataMap.put('d', 3);
            dataMap.put('e', 4);
            dataMap.put('f', 5);
            dataMap.put('g', 6);
            dataMap.put('h', 7);
            dataMap.put('i', 8);
            dataMap.put('j', 9);
            
            String inputValue = "";
            for (int i = 0; i < input.length(); i++) {
                inputValue = inputValue + Integer.toString(dataMap.getOrDefault(input.charAt(i), 0));
            }

            return Integer.valueOf(inputValue);
        }
    }
}
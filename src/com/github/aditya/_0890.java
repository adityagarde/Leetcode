package com.github.aditya;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _0890 {
    public static class Solution {
        public List<String> findAndReplacePattern(String[] words, String pattern) {

            Map<Character, ArrayList<Integer>> patternMap = returnHashMap(pattern);
            List<String> solution = new ArrayList<>();
            for (int i = 0; i < words.length; i++) {

                Map<Character, ArrayList<Integer>> wordMap = returnHashMap(words[i]);
                int count = 0;
                if (wordMap.size() != patternMap.size()) {
                    continue;
                }
                for (int j = 0; j < wordMap.size(); j++) {
                    if (wordMap.get(words[i].charAt(j)).equals(patternMap.get(pattern.charAt(j)))) {
                        count++;
                    } else {
                        break;
                    }
                }
                if (count == wordMap.size()) {
                    solution.add(words[i]);
                }

            }
            return solution;
        }

        public Map<Character, ArrayList<Integer>> returnHashMap(String inputWord) {
            Map<Character, ArrayList<Integer>> hashMap = new HashMap<>();
            for (int i = 0; i < inputWord.length(); i++) {
                ArrayList<Integer> positionList;
                if (hashMap.containsKey(inputWord.charAt(i))) {
                    positionList = hashMap.get(inputWord.charAt(i));
                } else {
                    positionList = new ArrayList<>();
                }
                positionList.add(i);
                hashMap.put(inputWord.charAt(i), positionList);
            }
            return hashMap;
        }

        public static void main(String[] args) {
            String[] words = {"abcba", "deqeq", "meeea", "aqqqa", "dkdde", "cccca"};
            Solution sol = new Solution();
            List<String> solution = sol.findAndReplacePattern(words, "abbba");
            System.out.println(solution);
        }
    }
}

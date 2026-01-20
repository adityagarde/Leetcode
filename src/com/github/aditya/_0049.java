package com.github.aditya;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _0049 {
    // 6ms beats 99.29%, 49.62MB beats 67.68%
    // Time Complexity O(n · k log k) and Space Complexity O(n · k)
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            Map<String, List<String>> map = new HashMap<>();

            for (String str : strs) {

                char[] chars = str.toCharArray();
                Arrays.sort(chars);
                String sortedKey = new String(chars);

                if (!map.containsKey(sortedKey)) {
                    map.put(sortedKey, new ArrayList<>());
                }

                map.get(sortedKey).add(str);
            }

            return new ArrayList<>(map.values());
        }
    }
}
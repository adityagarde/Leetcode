package com.github.aditya;

import java.util.HashSet;
import java.util.Set;

public class _1647 {
    // 10 ms, faster than 95.54%, memory 43.1 MB, less than 85.70%
    class Solution {
        public int minDeletions(String s) {
            int freq[] = new int[26];
            for (int i = 0; i < s.length(); i++)
                freq[s.charAt(i) - 'a']++;

            int deletions = 0;

            Set<Integer> freqSet = new HashSet<>();
            for (int count : freq) {
                while (count > 0 && freqSet.contains(count)) {
                    deletions++;
                    count--;
                }
                freqSet.add(count);
            }
            return deletions;
        }
    }
}
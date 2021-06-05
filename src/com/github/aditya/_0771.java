package com.github.aditya;

import java.util.HashMap;
import java.util.Map;

public class _0771 {
    class Solution {
        public int numJewelsInStones(String jewels, String stones) {

            char[] jewelsArr = jewels.toCharArray();
            char[] stonesArr = stones.toCharArray();

            Map<Character, Integer> hashMap = new HashMap<Character, Integer>();

            for (int i = 0; i < stonesArr.length; i++) {
                hashMap.put(stonesArr[i], hashMap.getOrDefault(stonesArr[i], 0) + 1);
            }
            int count = 0;

            for (int i = 0; i < jewelsArr.length; i++) {
                if (hashMap.containsKey(jewelsArr[i])) {
                    count = count + hashMap.getOrDefault(jewelsArr[i], 0);
                }
            }

            return count;
        }
    }
}

package com.github.aditya;

import java.util.Map;

public class _0013 {
    // 4 ms, faster than 96.26%, memory 42.4 MB, less than 94.37%
    class Solution {
        public int romanToInt(String s) {
            int result = getValue(s.charAt(s.length() - 1));

            for (int i = s.length() - 2; i > 0; i--) {
                int num1 = getValue(s.charAt(i)), num2 = getValue(s.charAt(i + 1));
                if (num1 >= num2)
                    result += getValue(s.charAt(i));
                else
                    result -= getValue(s.charAt(i));
            }
            return result;
        }

        int getValue(char c) {
            if (c == 'I') return 1;
            else if (c == 'V') return 5;
            else if (c == 'X') return 10;
            else if (c == 'L') return 50;
            else if (c == 'C') return 100;
            else if (c == 'D') return 500;
            else return 1000;
        }
    }

    // Using Map - 7 ms, faster than 62.45%, memory 42.5 MB, less than 88.85%
    class Solution_1 {
        public int romanToInt(String s) {
            Map<Character, Integer> map = Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);

            int result = map.get(s.charAt(s.length() - 1));

            for (int i = s.length() - 2; i >= 0; i--) {
                if (map.get(s.charAt(i)) >= map.get(s.charAt(i + 1)))
                    result += map.get(s.charAt(i));
                else
                    result -= map.get(s.charAt(i));
            }
            return result;
        }
    }
}
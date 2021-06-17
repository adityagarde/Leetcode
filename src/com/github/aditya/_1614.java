package com.github.aditya;

public class _1614 {
    public static class Solution {
        public int maxDepth(String s) {
            int counter1 = 0, counter2 = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') {
                    counter1++;
                    if (counter1 > counter2)
                        counter2++;
                } else if (s.charAt(i) == ')')
                    counter1--;
            }
            return counter2;
        }
    }
}

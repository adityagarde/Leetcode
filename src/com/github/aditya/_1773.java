package com.github.aditya;

import java.util.List;

public class _1773 {
    public static class Solution {
        public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
            int ruleKeyEq = getType(ruleKey);
            return (int) items.stream().filter(i -> i.get(ruleKeyEq).equals(ruleValue)).count();
        }

        public Integer getType(String ruleKey) {
            return "type".equals(ruleKey) ? 0 : "color".equals(ruleKey) ? 1 : 2;
        }
    }
}

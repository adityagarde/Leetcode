package com.github.aditya;

public class _1672 {
    class Solution {
        public int maximumWealth(int[][] accounts) {
            int maxWealth = 0;
            for (int[] customer : accounts) {
                int sum = 0;
                for (int money : customer) {
                    sum += money;
                }
                maxWealth = Math.max(maxWealth, sum);
            }
            return maxWealth;
        }
    }
}

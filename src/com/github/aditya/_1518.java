package com.github.aditya;

public class _1518 {
    class Solution {
        public int numWaterBottles(int numBottles, int numExchange) {
            int totalDrank = numBottles;
            int currentBottles = numBottles;

            while (currentBottles >= numExchange) {
                numBottles = currentBottles / numExchange;
                totalDrank = totalDrank + numBottles;
                currentBottles = numBottles + currentBottles % numExchange;
            }

            return totalDrank;
        }
    }
}

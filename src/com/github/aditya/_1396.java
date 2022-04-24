package com.github.aditya;

import java.util.HashMap;
import java.util.Map;

public class _1396 {
    // 99 ms, faster than 84.10%, memory 54.3 MB, less than 99.59%
    // Because of HashMap, all methods will have ~O(1) time complexity and O(m + n) space complexity, m and n is size of 2 HashMaps.
    class UndergroundSystem {
        private static final String DELIM = "->";
        private Map<Integer, Customer> arrivalMap;
        private Map<String, AverageTime> averageTimeMap;

        public UndergroundSystem() {
            arrivalMap = new HashMap<>();
            averageTimeMap = new HashMap<>();
        }

        public void checkIn(int id, String stationName, int t) {
            arrivalMap.computeIfAbsent(id, k -> new Customer(id, stationName, t));
        }

        public void checkOut(int id, String stationName, int t) {
            Customer arrival = arrivalMap.get(id);
            arrivalMap.remove(id);

            String stationKey = arrival.stationName + DELIM + stationName;

            int diff = t - arrival.time;
            AverageTime average = averageTimeMap.getOrDefault(stationKey, new AverageTime());
            average.updateAverage(diff);
            averageTimeMap.put(stationKey, average);
        }

        public double getAverageTime(String startStation, String endStation) {
            String stationKey = startStation + DELIM + endStation;
            return averageTimeMap.get(stationKey).getAverage();
        }

        public class Customer {
            int id;
            String stationName;
            int time;

            public Customer(int id, String stationName, int time) {
                this.id = id;
                this.stationName = stationName;
                this.time = time;
            }
        }

        public class AverageTime {
            int count = 0;
            double total = 0;

            public void updateAverage(int diff) {
                count++;
                total += diff;
            }

            public double getAverage() {
                return total / count;
            }
        }
    }

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */
}
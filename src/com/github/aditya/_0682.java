package com.github.aditya;

public class _0682 {
    // 1 ms, faster than 100.00%, memory 41.8 MB, less than 77.55%
    // Time Complexity O(n) Space Complexity O(n)
    class Solution {
        public int calPoints(String[] ops) {
            int[] result = new int[ops.length];
            int i = 0;

            for (String op : ops) {
                switch (op) {
                    case "C":
                        i--;
                        result[i] = 0;
                        break;
                    case "D":
                        result[i] = 2 * result[i - 1];
                        i++;
                        break;
                    case "+":
                        result[i] = result[i - 1] + result[i - 2];
                        i++;
                        break;
                    default:
                        result[i] = Integer.parseInt(op);
                        i++;
                        break;
                }
            }

            int sum = 0;
            for (int num : result) {
                sum += num;
            }

            return sum;
        }
    }
}
package com.github.aditya;

public class _1041 {
    public static class Solution {
        public boolean isRobotBounded(String instructions) {
            String dir = "+y";
            int x = 0, y = 0;
            for (int i = 0; i < instructions.length(); i++) {
                if (instructions.charAt(i) == 'G') {
                    switch (dir) {
                        case "+y": y++; break;
                        case "-y": y--; break;
                        case "+x": x++; break;
                        case "-x": x--; break;
                    }
                } else if (instructions.charAt(i) == 'R') {
                    switch (dir) {
                        case "+y": dir = "+x"; break;
                        case "-y": dir = "-x"; break;
                        case "+x": dir = "-y"; break;
                        case "-x": dir = "+y"; break;
                    }
                } else if (instructions.charAt(i) == 'L') {
                    switch (dir) {
                        case "+y": dir = "-x"; break;
                        case "-y": dir = "+x"; break;
                        case "+x": dir = "+y"; break;
                        case "-x": dir = "-y"; break;
                    }
                }
            }
            if (x == 0 && y == 0)
                return true;
            if (dir.equals("+y"))
                return false;

            return true;
        }
    }
}
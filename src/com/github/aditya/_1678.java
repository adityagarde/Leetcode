package com.github.aditya;

public class _1678 {
    public static class Solution {
        public String interpret(String command) {

            StringBuffer sbf = new StringBuffer();
            for (int i = 0; i < command.length(); i++) {
                if (command.charAt(i) == '(' && command.charAt(i + 1) == ')') {
                    sbf.append('o');
                    i++;
                } else if (command.charAt(i) != '(' && command.charAt(i) != ')') {
                    sbf.append(command.charAt(i));
                }
            }
            return sbf.toString();
        }
    }

    public static class Solution_1 {
        public String interpret(String command) {
            return command.replace("(al)", "al").replace("()", "o");
        }
    }
}
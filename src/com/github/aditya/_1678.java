package com.github.aditya;

public class _1678 {
    public static class Solution {
        public String interpret(String command) {
            return command.replace("(al)", "al").replace("()", "o");
        }

        public static void main(String[] args) {
            Solution solution = new Solution();
            System.out.println(solution.interpret("G()()()()(al)"));
        }
    }
}

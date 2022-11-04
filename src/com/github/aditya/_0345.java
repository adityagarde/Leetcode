package com.github.aditya;

public class _0345 {
    // 3 ms, faster than 98.51%, memory 42 MB, less than 99.69%
    class Solution {
        public String reverseVowels(String s) {
            char[] arr = s.toCharArray();
            int left = 0, right = s.length() - 1;
            while (right > left) {
                if (isVowel(arr[left]) && isVowel(arr[right])) {
                    char temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left++;
                    right--;
                } else if (isVowel(arr[left]) && !isVowel(arr[right])) {
                    right--;
                } else if (!isVowel(arr[left]) && isVowel(arr[right])) {
                    left++;
                } else {
                    left++;
                    right--;
                }
            }

            return String.valueOf(arr);
        }

        private boolean isVowel(char c) {
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    return true;
                default:
                    return false;
            }
        }
    }
}
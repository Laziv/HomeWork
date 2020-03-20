package com.laziv.lesson10;

public class PalindromeFinder {
    public static boolean isPalindrome(String word) {
        StringBuilder newWord = new StringBuilder();

        for (int i = word.length() - 1; i >= 0; i--) {
            newWord.append(word.charAt(i));
        }

        if (word.equalsIgnoreCase(newWord.toString())) {
            return true;
        } else {
            return false;
        }
    }
}
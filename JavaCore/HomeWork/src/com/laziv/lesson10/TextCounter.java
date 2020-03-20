package com.laziv.lesson10;

public class TextCounter {


    public static int countWords(String textForCount) {
        int count = 0;
        String[] arrayWords = textForCount.split(" ");

        for (String word : arrayWords) {

            for (int i = 0; i < word.length(); i++) {

                int charIndex = word.charAt(i);
                if (charIndex >= 1024 && charIndex <= 1279) {    //1024-1279 - Діапазон букв кирилиці
                    count++;
                    break;
                }
            }
        }

        return count;
    }

    public static int countWordsOtherMethod(String textForCount) {
        int count = 0;
        boolean isLetter = false;

        for (int i = 0; i < textForCount.length(); i++) {

            char ch = textForCount.charAt(i);
            char previousCh;
            if (i == 0) {
                previousCh = textForCount.charAt(i + 1);
            } else {
                previousCh = textForCount.charAt(i - 1);
            }

            //1024-1279 - Діапазон букв кирилиці
            if ((ch >= 1024 && ch <= 1279) ||
                    ((ch == '-' || ch == '\'') && (previousCh >= 1024 && previousCh <= 1279))) {
                isLetter = true;
            } else {
                if (isLetter) {
                    count++;
                    isLetter = false;
                }
            }
        }
        return count;
    }

    public static int countSentence(String textForCount) {

        int countWords = 0;
        int countSentences = 0;
        int minimumNumberOfWords = 1;
        boolean isLetter = false;

        for (int i = 0; i < textForCount.length(); i++) {
            char ch = textForCount.charAt(i);
            char previousCh;
            if (i != 0) {
                previousCh = textForCount.charAt(i - 1);
            } else {
                previousCh = textForCount.charAt(i + 1);
            }


            //1024-1279 - Діапазон букв кирилиці
            if ((ch >= 1024 && ch <= 1279) ||
                    ((ch == '-' || ch == '\'') && (previousCh >= 1024 && previousCh <= 1279))) {
                isLetter = true;
            } else {
                if (isLetter) {
                    countWords++;
                    isLetter = false;
                }
            }

            if ((ch == '.' || ch == '!' || ch == '?') && countWords >= minimumNumberOfWords) {
                countSentences++;
                countWords = 0;
            }

            if (i == textForCount.length() - 1 && countWords >= minimumNumberOfWords) {
                countSentences++;
            }
        }
        return countSentences;
    }

}
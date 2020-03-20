package com.laziv.lesson10;

public class TextHelper {

    public static String[] toArrayWords(String text) {
        boolean isLetter = false;
        StringBuilder words = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);
            char previousCh;
            if (i == 0) {
                previousCh = text.charAt(i + 1);
            } else {
                previousCh = text.charAt(i - 1);
            }

            //1024-1279 - Діапазон букв кирилиці
            if ((ch >= 1024 && ch <= 1279) ||
                    ((ch == '-' || ch == '\'') && (previousCh >= 1024 && previousCh <= 1279))) {
                isLetter = true;
                words.append(ch);
            } else {
                if (isLetter) {
                    words.append('|');
                    isLetter = false;
                }
            }
        }
        return words.toString().split("\\|");
    }

    public static void findMostCommonWord(String text) {
        String[] words = toArrayWords(text);
        int[] countWords = new int[text.length()];
        int indexWord = 0;

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equalsIgnoreCase(words[j])) {
                    countWords[i]++;
                }
            }
        }

        int max = countWords[0];
        for (int i = 0; i < countWords.length; i++) {
            if (countWords[i] > max) {
                max = countWords[i];
                indexWord = i;
            }
        }

        if (max == 0) {
            System.out.println("Всі слова зустрічаються однакову кількість раз");
        } else {
            System.out.println("Найбільш зустричаємо слово - " + words[indexWord]);
        }

    }

    public static void findMostCommonWordInFirstSentence(String text) {
        String firstSentence = text.split("\\.|\\?|!")[0];
        findMostCommonWord(firstSentence);
    }
}
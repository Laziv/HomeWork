package com.laziv.lesson10;

public class Main {
    public static void main(String[] args) {

        //Task1
        System.out.println("Task1\n");

        String[] arrayWords = new String[]{"Radar", "LEVEL", "test", "reviver", "Java"};

        for (String word : arrayWords) {
            if (PalindromeFinder.isPalindrome(word)) {
                System.out.println(word + " is a palindrome");
            } else {
                System.out.println(word + " is not a palindrome");
            }
        }


        //Task2
        System.out.println("\nTask2\n");

        String text = "Створити програму, яка буде перевіряти, чи є слово з п'яти букв, введене користувачем, паліндромом\n" +
                "(приклади: «пилип», «ротор»). Якщо введено слово не з 5 букв, то повідомляти про помилку.\n" +
                "Програма повинна нормально обробляти слово, навіть якщо в ньому використані символи різного регістра...\n" +
                "Наприклад, слова «Комок» або «РОТОР» слід також вважати паліндромами";

        System.out.println(TextReplacer.replaceAllVowelsWithDashes(text));


        //Task3
        System.out.println("\nTask3\n");

        String text1 = "Створити програму  , яка буде   перевіряти, чи є слово з п'яти    букв, введене користувачем, паліндромом  (приклади: «пилип»,  «ротор»).";
        String text2 = "(приклади:«пилип», «ротор»).";
        System.out.println("Кількість слів у першому реченні " + TextCounter.countWords(text1));
        System.out.println("Кількість слів у другому реченні " + TextCounter.countWordsOtherMethod(text2));



        //Task4
        System.out.println("\nTask4\n");

        System.out.println("Кількість речень у тексті " + TextCounter.countSentence(text));


        //Task5
        System.out.println("\nTask5\n");

        String text3 = "Створити програму, яка буде перевіряти, чи є слово з п'яти букв, введене користувачем, паліндромом\n" +
                "(приклади: «пилип», «ротор»). Якщо введено  слово не з 5 букв, то повідомляти про помилку.\n" +
                "Програма повинна нормально обробляти слово,  - навіть якщо в ньому використані символи різного регістра...\n" +
                "Наприклад, слова «Комок» або «РОТОР» слід також вважати паліндромами створити створити";

        TextHelper.findMostCommonWordInFirstSentence(text3);



        //Task6
        System.out.println("\nTask6\n");

        TextHelper.findMostCommonWord(text3);

    }

}
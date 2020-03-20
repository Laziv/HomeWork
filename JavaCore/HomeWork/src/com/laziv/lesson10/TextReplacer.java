package com.laziv.lesson10;

public class TextReplacer {
    public static String replaceAllVowelsWithDashes(String textForReplace) {

        String regex = "а|я|о|у|ю|е|є|и|і|ї";
        String replacedText = textForReplace.replaceAll(regex, "-").replaceAll(regex.toUpperCase(), "-");
        return replacedText;
    }
}
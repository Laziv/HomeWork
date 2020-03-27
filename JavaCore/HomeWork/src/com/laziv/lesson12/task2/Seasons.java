package com.laziv.lesson12.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum Seasons {
    WINTER, SPRING, SUMMER, FALL;

    public static String getSeasons(String str) throws WrongInputConsoleParametersException {
        str = str.toUpperCase();
        List<Seasons> seasonsList = new ArrayList<>(Arrays.asList(Seasons.values()));

        for (Seasons season : seasonsList) {
            if (season.toString().equals(str)) {
                return str;
            }
        }
        throw new WrongInputConsoleParametersException("Incorrect season name entry");
    }
}
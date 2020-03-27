package com.laziv.lesson12.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum Months {
    DECEMBER(31, Seasons.WINTER),
    JANUARY(31, Seasons.WINTER),
    FEBRUARY(28, Seasons.WINTER),
    MARCH(31, Seasons.SPRING),
    APRIL(30, Seasons.SPRING),
    MAY(31, Seasons.SPRING),
    JUNE(30, Seasons.SUMMER),
    JULY(31, Seasons.SUMMER),
    AUGUST(31, Seasons.SUMMER),
    SEPTEMBER(30, Seasons.FALL),
    OCTOBER(31, Seasons.FALL),
    NOVEMBER(30, Seasons.FALL);

    private static boolean isLeapYear;
    private Seasons season;
    private int days;


    Months(int days, Seasons season) {
        this.days = days;
        this.season = season;
    }

    public static void setIsLeapYear(boolean isLeapYear) {
        Months.isLeapYear = isLeapYear;
    }

    public int getDays() {
        if (days == 28) {
            return isLeapYear ? 29 : days;
        } else {
            return days;
        }
    }


    public Seasons getSeason() {

        return season;
    }

    /*
     *The method checks a string with each enumeration.
     *If a string matches one of the enumerations, then that string is returned
     */
    public static String getMonth(String str) throws WrongInputConsoleParametersException {
        str = str.toUpperCase();
        List<Months> monthsList = new ArrayList<>(Arrays.asList(Months.values()));

        for (Months month : monthsList) {
            if (month.name().equals(str)) {
                return str;
            }
        }
        throw new WrongInputConsoleParametersException("Incorrect month name entry");
    }

    /**
     * The method checks whether the days of the month are entered correctly
     */
    public static void isValidNumberOfDays(int days) throws WrongInputConsoleParametersException {
        if (days < 28 || days > 31) {
            throw new WrongInputConsoleParametersException("Incorrect number of days");
        }
    }
}
package com.laziv.lesson8.task1;

public enum Months {
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
    NOVEMBER(30, Seasons.FALL),
    DECEMBER(31, Seasons.WINTER);

    private Seasons season;
    private int days;

    Months(int days, Seasons season) {
        this.days = days;
        this.season = season;
    }


    public Seasons getSeason() {

        return season;
    }

    public int getDays() {

        return days;
    }

    public static int indexOf(String str) {
        for (Months month : Months.values())
            if (month.toString().equals(str))
                return month.ordinal();

        return -1;
    }
}
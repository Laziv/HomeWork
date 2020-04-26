package com.laziv.lesson24;

public enum Days {
    MONDAY("Понеділок"),
    TUESDAY("Вівторок"),
    WEDNESDAY("Середа"),
    THURSDAY("Четвер"),
    FRIDAY("П'ятниця"),
    SATURDAY("Субота"),
    SUNDAY("Неділя");

    private String translation;

    Days(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }

    public static Days getDay(String name) {
        for (Days d : Days.values()) {
            if (d.getTranslation().toUpperCase().equalsIgnoreCase(name) || d.name().equalsIgnoreCase(name)) {
                return d;
            }
        }

        throw new IllegalArgumentException();
    }
}
